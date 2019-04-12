package in.portfolio.shikhar.blockchain.web_services.responses;

import android.util.Log;

import java.util.ArrayList;

import in.portfolio.shikhar.blockchain.models.MineDataModel;
import in.portfolio.shikhar.blockchain.models.TransactionDataModel;
import in.portfolio.shikhar.blockchain.web_services.BaseResponse;

import static in.portfolio.shikhar.blockchain.BaseFragment.TAG;

public class MineResponse extends BaseResponse {
    private MineDataModel minedBlock;



    public ArrayList<MineDataModel.TransactionsBean> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(ArrayList<MineDataModel.TransactionsBean> transactionList) {
        this.transactionList = transactionList;
    }

    public ArrayList<MineDataModel.TransactionsBean> transactionList;
    public MineDataModel getMinedBlock() {
        Log.d(TAG, "getMinedBlock: "+minedBlock.toString());
        return minedBlock;
    }


}
