package com.h5190019.ibrahim_metehan_barutcu.utils;


import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

import androidx.appcompat.app.AlertDialog;

import com.h5190019.ibrahim_metehan_barutcu.R;

public class AlertDialogUtil {

    private static int totalPoint = 1000;


    public static void showExitAlert(final Context context) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(context.getResources().getString(R.string.exit_title));
        builder.setMessage(context.getResources().getString(R.string.exit_app));
        builder.setIcon(R.mipmap.ic_launcher);
        builder.setPositiveButton(context.getResources().getString(R.string.exit_no), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.setNegativeButton(context.getResources().getString(R.string.exit_yes), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });
        builder.show();
    }

    public static void showNextQuestionAlert(Context context, String title, String message) {
        if (Constants.QUESTION_POINT < totalPoint) {
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setTitle(context.getResources().getString(R.string.congrats_true_answer));
            builder.setMessage(context.getResources().getString(R.string.next_question));
           /* builder.setPositiveButton(getResources().getString(R.string.ok_alert), new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });*/
            builder.show();
        }
    }

}
