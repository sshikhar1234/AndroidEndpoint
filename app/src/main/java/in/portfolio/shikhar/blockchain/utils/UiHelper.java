package in.portfolio.shikhar.blockchain.utils;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.provider.Settings;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;

import java.util.Calendar;

import in.portfolio.shikhar.blockchain.BaseAppCompatActivity;
import in.portfolio.shikhar.blockchain.R;


/**
 * Created by Shikhar Shah on 29-12-2017.
 */

public class UiHelper {

    private static ProgressDialog progress;

//
//    public static void startLoginActivity(AppCompatActivity activity) {
//        Intent intent = new Intent(activity,LoginActivity.class);
//        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);
//        activity.startActivity(new Intent(activity, LoginActivity.class));
//        animateFade(activity);
//    }
    static void showNetworkDialog(final BaseAppCompatActivity context) {
        new AlertDialog.Builder(context, R.style.AlertDialogStyle)
                .setTitle(R.string.app_name)
                .setMessage(R.string.no_internet)
                .setIcon(R.mipmap.ic_launcher)
                .setCancelable(false)
                .setPositiveButton(R.string.connect, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        Intent settingIntent = new Intent(Settings.ACTION_SETTINGS);
                        settingIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(settingIntent);
                    }
                })
                .setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        context.finish();
                    }
                }).show();
    }

    public static void backToParent(AppCompatActivity activity, MenuItem menuItem)
    {
            activity.finish();
            animateSlideBackButton(activity);
    }

    public static void animateFade(AppCompatActivity activity)
    {
        activity.overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
    }

    public static void animateSlideBackButton(AppCompatActivity activity)
    {
        activity.overridePendingTransition(R.anim.slide_in,R.anim.slide_out);
    }

    public static void startProgress(BaseAppCompatActivity activity, boolean isCancelable) {
        stopProgress(activity);
        progress = new ProgressDialog(activity, R.style.ProgressBarTheme);
        progress.setProgressStyle(android.R.style.Widget_ProgressBar_Small);
        progress.setIndeterminate(true);
        progress.setCancelable(isCancelable);
        progress.setCanceledOnTouchOutside(isCancelable);
        progress.show();
    }

    public static void stopProgress(BaseAppCompatActivity activity) {
        if (null != activity && null != progress && progress.isShowing()) {
            progress.dismiss();
        }
    }
    public static String getRealPathFromURI(Context context, Uri contentUri) {
        Cursor cursor = null;
        try {
            String[] proj = { MediaStore.Images.Media.DATA };
            cursor = context.getContentResolver().query(contentUri,  proj, null, null, null);
            int column_index = cursor.getColumnIndexOrThrow(MediaStore.Images.Media.DATA);
            cursor.moveToFirst();
            return cursor.getString(column_index);
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }



}
