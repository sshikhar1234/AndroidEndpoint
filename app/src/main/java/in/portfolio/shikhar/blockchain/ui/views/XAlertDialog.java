package in.portfolio.shikhar.blockchain.ui.views;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import butterknife.BindView;
import in.portfolio.shikhar.blockchain.R;
import in.portfolio.shikhar.blockchain.web_services.WebServiceHelper;
import in.portfolio.shikhar.blockchain.web_services.responses.NewTransacResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class XAlertDialog extends Dialog implements View.OnClickListener {

    @BindView(R.id.btn_pay)
    Button btnPay;
    @BindView(R.id.layoutPay)
    CardView layoutPay;
    @BindView(R.id.layoutContainer)
    LinearLayout layoutContainer;
    private Activity activity;

    public XAlertDialog(Activity activity) {
        super(activity);
        // TODO Auto-generated constructor stub
        this.activity = activity;
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.ic_item_pay);

    }


    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btn_pay: {

                          break;
            }

        }
    }

    private void initRecyclerView() {
//        adapter = new RecyclerAdapter(this,mainActivityViewModel.getmNicePlaces().getValue());
//        rview.setLayoutManager(new LinearLayoutManager(this));
//        rview.setAdapter(adapter);
//        rview.setHasFixedSize(true);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }
}
