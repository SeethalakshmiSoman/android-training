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

    @OnClick(R.id.button_custom_normal_and_big_content_views_notification)
    public void onButtonCustomNormalAndBigContentViewsNotification() {
        mNotificationUtil.showCustomBothContentViewNotification(this);
    }

    @OnClick(R.id.button_heads_up_notification)
    public void onButtonHeadsUpNotificationClick() {
        mNotificationUtil.showStandardHeadsUpNotification(this);
    }

    @OnClick(R.id.button_custom_layout_heads_up_notification)
    public void onButtonCustomLayoutHeadsUpNotificationClick() {
        mNotificationUtil.showCustomLayoutHeadsUpNotification(this);
    }

}
