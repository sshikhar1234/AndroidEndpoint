package in.portfolio.shikhar.blockchain;

import android.app.Application;

/**
 * Created by Shikhar Shah on 03/18/2019
 */

public class App extends Application {

    private static String authKey;
    private static App mAppInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        mAppInstance = this;
    }

    public static App getAppInstance() {
        return mAppInstance;
    }

}
