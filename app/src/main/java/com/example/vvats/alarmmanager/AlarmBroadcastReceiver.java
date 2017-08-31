package com.example.vvats.alarmmanager;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.widget.Toast;

public class AlarmBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Broadcast Received", Toast.LENGTH_SHORT).show();
        NotificationManagerCompat managerCompat = NotificationManagerCompat.from(context);
        NotificationCompat.Builder notification = new NotificationCompat.Builder(context);

        notification.setContentTitle("Alert Message !!!");
        notification.setContentText("Stand up in next 10 minutes.");
        notification.setSmallIcon(android.R.drawable.ic_btn_speak_now);

        Intent intent1 = new Intent(context, StandUpActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, intent1, 0);
        notification.setAutoCancel(true);
        notification.setContentIntent(pendingIntent);

        managerCompat.notify(0, notification.build());
    }
}
