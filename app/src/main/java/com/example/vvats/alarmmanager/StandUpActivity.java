package com.example.vvats.alarmmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class StandUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stand_up);
        Toast.makeText(this, "StandUp Activity Created", Toast.LENGTH_SHORT).show();
    }
}
