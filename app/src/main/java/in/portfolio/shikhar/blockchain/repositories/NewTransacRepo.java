package in.portfolio.shikhar.blockchain.repositories;

import android.arch.lifecycle.MutableLiveData;
import java.util.ArrayList;
import java.util.List;

import in.portfolio.shikhar.blockchain.models.NewTransacDataModel;

public class NewTransacRepo  {
    private ArrayList<NewTransacDataModel> resposeList;

    static NewTransacRepo mInstance;

    public static NewTransacRepo getmInstance() {
        if(mInstance == null)
        {
            mInstance = new NewTransacRepo();
        }
        return mInstance;
    }

    public    MutableLiveData<List<NewTransacDataModel>> getNewTransResponse() {
        setNicePlaces();
        MutableLiveData<List<NewTransacDataModel>> listMutableLiveData = new MutableLiveData<>();
        listMutableLiveData.setValue(resposeList);
        return listMutableLiveData;
    }


    public void setNicePlaces() {
    }
}
