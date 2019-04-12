package in.portfolio.shikhar.blockchain;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import in.portfolio.shikhar.blockchain.utils.Helper;
import in.portfolio.shikhar.blockchain.utils.UiHelper;

/**
 * Created by Shikhar Shah on 03/18/2019
 */
public class BaseFragment extends Fragment {

    public BaseAppCompatActivity mActivity;
    public static String TAG = BaseFragment.class.getSimpleName();
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivity = (BaseAppCompatActivity) getActivity();
        setHasOptionsMenu(true);
    }

        public boolean isNetworkAvailable() {
            return Helper.isNetworkAvailable(mActivity);
        }

        public void startProgress(boolean isCancelable) {
            UiHelper.startProgress(mActivity, isCancelable);
        }

        public void stopProgress() {
            UiHelper.stopProgress(mActivity);
        }
}
