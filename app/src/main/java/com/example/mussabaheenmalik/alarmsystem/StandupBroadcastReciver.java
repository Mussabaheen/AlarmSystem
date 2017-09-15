package com.example.mussabaheenmalik.alarmsystem;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;

public class StandupBroadcastReciver extends BroadcastReceiver {
    public StandupBroadcastReciver(){

    }

    @Override
    public void onReceive(Context context, Intent intent) {
        NotificationManagerCompat mymanager = NotificationManagerCompat.from(context);
        NotificationCompat.Builder mynoti = new NotificationCompat.Builder(context);
        mynoti.setContentTitle("EXCERSICE TIME STAND UP ! ");
        mynoti.setContentText("KINDLY STAND UP FOR BE FIT :) ");
        mynoti.setSmallIcon(android.R.drawable.button_onoff_indicator_off);
        Intent i1 = new Intent(context,StandUpActivity.class);
        PendingIntent pd =PendingIntent.getActivities(context,0, new Intent[]{i1},0);
        mynoti.setContentIntent(pd);
        mynoti.setAutoCancel(true);
        mymanager.notify(1,mynoti.build());

    }
}
