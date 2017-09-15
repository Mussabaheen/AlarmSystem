package com.example.mussabaheenmalik.alarmsystem;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    AlarmManager myalarmManager ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myalarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
    }
    public void startsome(View view) {

        Intent i1  = new Intent();
        i1.setAction("Messages");
        i1.addCategory("android.intent.category.DEFAULT");
        PendingIntent pe = PendingIntent.getBroadcast(this,0,i1,0);
        myalarmManager.setRepeating(myalarmManager.RTC_WAKEUP,System.currentTimeMillis(),1000*2,pe);


    }

    public void stopsomething(View view) {
        Intent i1  = new Intent();
        i1.setAction("Messages");
        i1.addCategory("android.intent.category.DEFAULT");
        PendingIntent pe = PendingIntent.getBroadcast(this,0,i1,0);
        myalarmManager.cancel(pe);



    }



    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void nextsome(View view) {

        AlarmManager.AlarmClockInfo k = myalarmManager.getNextAlarmClock();
        Toast.makeText(this, "ALARM  : "+k, Toast.LENGTH_SHORT).show();
    }
}
