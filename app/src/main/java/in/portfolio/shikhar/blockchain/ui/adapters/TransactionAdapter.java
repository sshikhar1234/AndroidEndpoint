package in.portfolio.shikhar.blockchain.ui.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import in.portfolio.shikhar.blockchain.R;
import in.portfolio.shikhar.blockchain.models.MineDataModel;

import static in.portfolio.shikhar.blockchain.BaseFragment.TAG;

public class TransactionAdapter extends RecyclerView.Adapter<TransactionAdapter.TransactionViewHolder> {

    private LayoutInflater inflater;
    private Context context;
    private ArrayList<MineDataModel.TransactionsBean> transactions;

    public TransactionAdapter(Context context, ArrayList<MineDataModel.TransactionsBean> transactions)
    {
        this.context = context;
        this.transactions = transactions;
        inflater = LayoutInflater.from(context);

        Log.e(TAG, "TransactionAdapter: "+"Transactions List Size: "+transactions.size() );
    }
    @NonNull
    @Override
    public TransactionViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        return new TransactionViewHolder(inflater.inflate(R.layout.ic_item_transaction, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull TransactionViewHolder transactionViewHolder, int i)

    {

        MineDataModel.TransactionsBean currentTransaction = transactions.get(i);


        Log.e(TAG, "Trasactions: "+currentTransaction.getAmount());
      //  transactionViewHolder.textviewAmount.setText(currentTransaction.getAmount());
        transactionViewHolder.textviewRecipient.setText(currentTransaction.getReceiver());
        if(i==0)
        {
            transactionViewHolder.textviewType.setText(context.getString(R.string.reward));
            transactionViewHolder.textviewRecipient.setText(currentTransaction.getSender());
        }
        else
        {
            transactionViewHolder.textviewType.setText(context.getString(R.string.transfer));
        }
    }/**/

    @Override
    public int getItemCount() {
        return transactions.size();
    }

    public class TransactionViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.textviewType)
        TextView textviewType;
        @BindView(R.id.textviewRecipient)
        TextView textviewRecipient;
        @BindView(R.id.textviewAmount)
        TextView textviewAmount;

        public TransactionViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
