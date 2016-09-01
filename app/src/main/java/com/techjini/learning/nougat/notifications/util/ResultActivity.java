package com.techjini.learning.nougat.notifications.util;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.RemoteInput;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by techjini on 1/9/16.
 */
public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.result_layout);
        Intent intent = this.getIntent();

        Bundle remoteInput = RemoteInput.getResultsFromIntent(intent);

        if (remoteInput != null) {

            String inputString = remoteInput.getCharSequence(
                    NotificationUtil.KEY_TEXT_REPLY).toString();

            Log.v("result","message :"+inputString);


            Notification repliedNotification =
                    new Notification.Builder(this)
                            .setSmallIcon(
                                    android.R.drawable.ic_dialog_info)
                            .setContentText("Reply received")
                            .build();

            NotificationManager notificationManager =
                    (NotificationManager)
                            getSystemService(Context.NOTIFICATION_SERVICE);
            notificationManager.notify(NotificationUtil.REMOTE_INPUT_ID,
                    repliedNotification);


        }

    }
}
