package org.nullonerror.huenotifications.service;

import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;

public class NotificationListener extends NotificationListenerService {

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public void onNotificationPosted(StatusBarNotification statusBarNotification) {

    }

    @Override
    public void onNotificationRemoved(StatusBarNotification statusBarNotification) {
    }
}
