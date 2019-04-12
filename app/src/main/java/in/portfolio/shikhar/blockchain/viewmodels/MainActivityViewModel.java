package in.portfolio.shikhar.blockchain.viewmodels;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import java.util.List;

import in.portfolio.shikhar.blockchain.models.NewTransacDataModel;
import in.portfolio.shikhar.blockchain.repositories.NewTransacRepo;

public class MainActivityViewModel extends ViewModel {

    MutableLiveData<List<NewTransacDataModel>> mNewTransactionsResponse;
    NewTransacRepo mNewTransactionRep;

    public LiveData<List<NewTransacDataModel>> getNewTransacResp() {
        return mNewTransactionsResponse;
    }

    public void init()
    {
        if(mNewTransactionRep!=null)
        {
            return;
        }
        mNewTransactionRep =  NewTransacRepo.getmInstance();
        mNewTransactionsResponse = mNewTransactionRep.getNewTransResponse();

    }
}
