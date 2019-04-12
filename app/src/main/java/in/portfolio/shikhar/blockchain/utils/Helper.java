package in.portfolio.shikhar.blockchain.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import in.portfolio.shikhar.blockchain.BaseAppCompatActivity;

/**
 * Created by Shikhar Shah on 03/18/2019
 */

public class Helper {

    private static final String KEY_USER_LNAME = "last_name";

    public static void debugLog(String tag, String log) {
        Log.e(tag, log);
    }


    /**
     * Check for network availability
     *
     * @return true if available. false otherwise
     */
    public static boolean isNetworkAvailable(BaseAppCompatActivity context) {
        boolean toReturn;
        ConnectivityManager connectivityManager
                = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();

        toReturn = activeNetworkInfo != null && activeNetworkInfo.isConnected();

        if (!toReturn) {
            UiHelper.showNetworkDialog(context);
        }
        return toReturn;
    }



}
