package com.example.vvats.alarmmanager;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    AlarmManager alarmManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
    }

    public void startAlarm(View view) {
        Toast.makeText(this, "Setting up the Alarm", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent();
        intent.setAction("com.varun.own.alarm.RECEIVER");
        intent.addCategory("android.intent.category.DEFAULT");

        PendingIntent pendingIntent = PendingIntent.getBroadcast(this, 0, intent, 0);
        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, System.currentTimeMillis(), 1000 * 30, pendingIntent);
    }

    public void stopAlarm(View view) {
        Intent intent = new Intent();
        intent.setAction("com.varun.own.alarm.RECEIVER");
        intent.addCategory("android.intent.category.DEFAULT");

        PendingIntent pendingIntent = PendingIntent.getBroadcast(this, 0, intent, 0);
        alarmManager.cancel(pendingIntent);
        Toast.makeText(this, "Stopping up the Alarm", Toast.LENGTH_SHORT).show();
    }
}
