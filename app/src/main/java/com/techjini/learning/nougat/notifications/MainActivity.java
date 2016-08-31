package com.techjini.learning.nougat.notifications;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.techjini.learning.nougat.notifications.util.NotificationUtil;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    NotificationUtil mNotificationUtil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mNotificationUtil = new NotificationUtil();
    }

    @OnClick(R.id.button_standard_notification)
    public void onButtonStandardNotificationClick() {
        mNotificationUtil.showStandardNotification(this);
    }

    @OnClick(R.id.button_bundled_notification)
    public void onButtonBundledNotificationsClick() {
        mNotificationUtil.showBundledNotifications(this);
    }

    @OnClick(R.id.button_direct_reply_notification)
    public void onButtonRemoteInputNotificationsClick() {
        mNotificationUtil.showDirectReplyNotification(this);
    }

    @OnClick(R.id.button_custom_content_view_notification)
    public void onButtonCustomContentViewNotificationClick() {
        mNotificationUtil.showCustomContentViewNotification(this);
    }

    //seethalakshmisoman
    //Seetha_1990
}
