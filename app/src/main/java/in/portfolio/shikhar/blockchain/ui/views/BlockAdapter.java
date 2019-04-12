package in.portfolio.shikhar.blockchain.ui.views;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

import butterknife.BindView;
import butterknife.ButterKnife;
import in.portfolio.shikhar.blockchain.R;
import in.portfolio.shikhar.blockchain.models.MineDataModel;
import in.portfolio.shikhar.blockchain.ui.adapters.TransactionAdapter;

import static in.portfolio.shikhar.blockchain.BaseFragment.TAG;

public class BlockAdapter extends RecyclerView.Adapter<BlockAdapter.ViewHolder> {



    private LayoutInflater inflater;
    private Context context;
    private ArrayList<MineDataModel> list;
    private TransactionAdapter transactionAdapter;
    public BlockAdapter(Context context, ArrayList<MineDataModel> list) {
        this.context = context;
        inflater = LayoutInflater.from(context);
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ViewHolder(inflater.inflate(R.layout.ic_item_block, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        MineDataModel currentBlock = list.get(i);
        Log.e(TAG, "onBindViewHolder: "+currentBlock.getProof());
        transactionAdapter = new TransactionAdapter(context,currentBlock.getTransactions());
        viewHolder.rviewTransactions.setAdapter(transactionAdapter);
        viewHolder.rviewTransactions.setHasFixedSize(true);
        viewHolder.rviewTransactions.setLayoutManager(new LinearLayoutManager(context));

        viewHolder.textViewPrevHash.setText(currentBlock.getPrevious_hash());
        viewHolder.textViewCurrentHash.setText(currentBlock.getCurrent_hash());
        viewHolder.textViewNuance.setText(String.valueOf(currentBlock.getProof()));
        viewHolder.textViewBlockNum.setText(String.format("BLOCK#%d", currentBlock.getIndex()));
        viewHolder.textViewTime.setText(getDate(currentBlock.getTimestamp()));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    private String getDate(String timeStamp) {
        timeStamp.replace("Z"," ");
        String finalString = timeStamp.replace("T"," ");
        return finalString;
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.textViewBlockNum)
        TextView textViewBlockNum;
        @BindView(R.id.rviewTransactions)
        RecyclerView rviewTransactions;
        @BindView(R.id.textViewPrevHash)
        TextView textViewPrevHash;
        @BindView(R.id.textViewCurrentHash)
        TextView textViewCurrentHash;
        @BindView(R.id.textViewTime)
        TextView textViewTime;
        @BindView(R.id.textViewNuance)
        TextView textViewNuance;
        @BindView(R.id.cardView)
        CardView cardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
