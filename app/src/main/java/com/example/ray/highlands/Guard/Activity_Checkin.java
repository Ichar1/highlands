package com.example.ray.highlands.Guard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.ray.highlands.R;

public class Activity_Checkin extends AppCompatActivity implements View.OnClickListener {
    TextView checkin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkin);
        setTitle("Checkin");

        findViewById(R.id.vehicle).setOnClickListener(this);
        findViewById(R.id.txtView).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.vehicle:
                startActivity(new Intent(getApplicationContext(), Activity_Categories.class));
                break;
            case R.id.txtView:
                startActivity(new Intent(getApplicationContext(),ItemsLeftTruck.class));
        }

    }
}
