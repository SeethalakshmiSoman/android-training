package com.techjini.learning.nougat.notifications.util;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.app.NotificationCompat;
import android.support.v4.content.ContextCompat;
import android.widget.RemoteViews;

import com.techjini.learning.nougat.notifications.R;


public class NotificationUtil {

    public static final String REPLY_ACTION = "com.techjini.learning.nougat.notifications.util.ACTION_MESSAGE_REPLY";
    public static final String KEY_PRESSED_ACTION = "KEY_PRESSED_ACTION";

    public static final int REPLY_INTENT_ID = 0;
    public static final int ARCHIVE_INTENT_ID = 1;

    public static final int REMOTE_INPUT_ID = 1247;

    public static final String LABEL_REPLY = "Reply";
    public static final String LABEL_ARCHIVE = "Archive";
    public static final String KEY_TEXT_REPLY = "KEY_TEXT_REPLY";
    private static final String KEY_NOTIFICATION_GROUP = "KEY_NOTIFICATION_GROUP";


    public void showStandardNotification(Context context) {
        NotificationCompat.Builder notification = createNotificationBuider(context,
                "Standard Notification", "This is just a standard notification!");
        showNotification(context, notification.build(), 0);
    }

    //TODO
    public void showBundledNotifications(Context context) {

    }

    //TODO
    public void showDirectReplyNotification(Context context) {
    }

    //TODO
    public void showCustomContentViewNotification(Context context) {
    }

    //TODO
    public void showCustomBothContentViewNotification(Context context) {
    }

    //TODO
    public void showStandardHeadsUpNotification(Context context) {
    }

    //TODO
    public void showCustomLayoutHeadsUpNotification(Context context) {
    }


    private RemoteViews createRemoteViews(Context context, int layout, int iconResource,
                                          String title, String message, int imageResource) {
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), layout);
        remoteViews.setImageViewResource(R.id.image_icon, iconResource);
        remoteViews.setTextViewText(R.id.text_title, title);
        remoteViews.setTextViewText(R.id.text_message, message);
        remoteViews.setImageViewResource(R.id.image_end, imageResource);
        return remoteViews;
    }

    public Notification.Builder createCustomNotificationBuilder(Context context) {
        return new Notification.Builder(context)
                .setSmallIcon(R.mipmap.ic_launcher)
                .setAutoCancel(true);
    }

    public NotificationCompat.Builder createNotificationBuider(Context context,
                                                               String title, String message) {
        Bitmap largeIcon = BitmapFactory.decodeResource(context.getResources(),
                R.drawable.me);
        return new NotificationCompat.Builder(context)
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle(title)
                .setContentText(message)
                .setLargeIcon(largeIcon)
                .setColor(ContextCompat.getColor(context, R.color.colorPrimary))
                .setAutoCancel(true);
    }

    private void showNotification(Context context, Notification notification, int id) {
        NotificationManager mNotificationManager =
                (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        mNotificationManager.notify(id, notification);
    }
}