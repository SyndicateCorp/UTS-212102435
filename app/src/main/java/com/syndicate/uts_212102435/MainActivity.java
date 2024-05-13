package com.syndicate.uts_212102435;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button _informasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initInformasiButton();
    }

    private void initInformasiButton() {
        _informasi = findViewById(R.id.informasi);

        _informasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NotificationChannel channel = new NotificationChannel("twChannel", "tw", NotificationManager.IMPORTANCE_DEFAULT);

                NotificationCompat.Builder builder = new NotificationCompat.Builder(getApplicationContext())
                        .setSmallIcon(R.mipmap.ic_launcher)
                        .setContentTitle("Hello!")
                        .setContentText("212102435 - Andi Riyadl Abdul Aziz setiaraja")
                        .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                        .setChannelId(channel.getId());

                NotificationManager manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                manager.createNotificationChannel(channel);
                manager.notify(1, builder.build());
            }
        });
    }
}