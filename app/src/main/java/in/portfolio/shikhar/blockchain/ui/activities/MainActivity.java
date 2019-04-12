package in.portfolio.shikhar.blockchain.ui.activities;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import java.lang.reflect.Array;
import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import in.portfolio.shikhar.blockchain.BaseAppCompatActivity;
import in.portfolio.shikhar.blockchain.R;
import in.portfolio.shikhar.blockchain.models.ChainDataModel;
import in.portfolio.shikhar.blockchain.models.MineDataModel;
import in.portfolio.shikhar.blockchain.models.TransactionReqDataModel;
import in.portfolio.shikhar.blockchain.ui.views.BlockAdapter;
import in.portfolio.shikhar.blockchain.ui.views.XAlertDialog;
import in.portfolio.shikhar.blockchain.web_services.WebServiceHelper;
import in.portfolio.shikhar.blockchain.web_services.responses.ChainResponse;
import in.portfolio.shikhar.blockchain.web_services.responses.NewTransacResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;



public class MainActivity extends BaseAppCompatActivity {
    @BindView(R.id.layout_main_blockchain)
    LinearLayout layoutMainBlockchain;
    @BindView(R.id.btn_add_new_block)
    Button btnAddNewBlock;
    @BindView(R.id.btn_mine)
    Button btnMine;
    @BindView(R.id.rviewBlocks)
    RecyclerView rviewBlocks;
    ChainDataModel currentChain;

    private ArrayList<MineDataModel.TransactionsBean> transactionsList = new ArrayList<>();
    private ArrayList<MineDataModel> blockList = new ArrayList<>();
    private BlockAdapter blockAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        prepareRecyclerView();
        makeChainRequest();
    }

    private void makeChainRequest() {
        toast("Fetching chain");
        WebServiceHelper.getChainCall().enqueue(new Callback<ChainResponse>() {
            @Override
            public void onResponse(Call<ChainResponse> call, Response<ChainResponse> response) {
                if(response.isSuccessful())
                {
                    currentChain = response.body().getChainDataModel();

                }
            }

            @Override
            public void onFailure(Call<ChainResponse> call, Throwable t) {
                toast(t.getMessage());
            }
        });
    }


    private void handleButtonClick() {


        XAlertDialog payDialog = new XAlertDialog(this);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int displayWidth = displayMetrics.widthPixels;
        int displayHeight = displayMetrics.heightPixels;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        int dialogWindowWidth = (int) (displayWidth * 0.9f);
        int dialogWindowHeight = (int) (displayHeight * 0.4f);
        layoutParams.width = dialogWindowWidth;
        layoutParams.height = dialogWindowHeight;
        payDialog.getWindow().setAttributes(layoutParams);
        payDialog.show();
        final EditText et_recipient = payDialog.findViewById(R.id.editTextRecipient);
        final EditText et_amount = payDialog.findViewById(R.id.editTextAmount);
        payDialog.findViewById(R.id.btn_pay).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransactionReqDataModel newTransaction = new TransactionReqDataModel(et_amount.getText().toString(), et_recipient.getText().toString(), "Shikhar");
                WebServiceHelper.getNewTransactionCall(newTransaction).enqueue(new Callback<NewTransacResponse>() {
                    @Override
                    public void onResponse(Call<NewTransacResponse> call, Response<NewTransacResponse> response) {
                        if (response.isSuccessful()) {
                            stopProgress();
                            toast(response.body().getMessage());
                        }
                    }

                    @Override
                    public void onFailure(Call<NewTransacResponse> call, Throwable t) {
                        stopProgress();

                    }
                });
            }
        });
    }

    @OnClick({R.id.btn_mine, R.id.btn_add_new_block})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_mine:
                startProgress(false);
                mineTheBlock();
                break;
            case R.id.btn_add_new_block:
                startProgress(false);
                handleButtonClick();
                break;
        }
    }

    private void mineTheBlock() {

        WebServiceHelper.getMineCall().enqueue(new Callback<MineDataModel>() {
            @Override
            public void onResponse(Call<MineDataModel> call, Response<MineDataModel> response) {

                if (response.isSuccessful()) {
                    MineDataModel minedBlock = response.body();
                    blockList.add(minedBlock);
                    blockAdapter.notifyDataSetChanged();
                    stopProgress();
                }
            }

            @Override
            public void onFailure(Call<MineDataModel> call, Throwable t) {
                toast(t.getMessage());
                stopProgress();
            }
        });
    }

    public void prepareRecyclerView()
    {
        blockAdapter = new BlockAdapter(MainActivity.this,blockList);
        rviewBlocks.setAdapter(blockAdapter);
        rviewBlocks.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        rviewBlocks.setHasFixedSize(true);

    }
}
