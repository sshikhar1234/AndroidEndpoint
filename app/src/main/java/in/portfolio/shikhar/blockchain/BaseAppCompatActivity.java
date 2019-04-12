package in.portfolio.shikhar.blockchain;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import in.portfolio.shikhar.blockchain.utils.UiHelper;

/**
 * Created by Administrator on 1/2/2018.
 */

public class BaseAppCompatActivity  extends AppCompatActivity {
    public BaseAppCompatActivity mActivity;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivity = this;
    }


    public void toast(String message)
    {
        Toast.makeText(mActivity, message, Toast.LENGTH_SHORT).show();
    }
    public void startProgress(boolean isCancelable) {
        UiHelper.startProgress(this, isCancelable);
    }

    public void stopProgress() {
        UiHelper.stopProgress(this);
    }


}
