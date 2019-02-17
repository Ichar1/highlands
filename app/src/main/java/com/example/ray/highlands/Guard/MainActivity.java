package com.example.ray.highlands.Guard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Switch;

import com.example.ray.highlands.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.guardprofile).setOnClickListener(this);
        findViewById(R.id.truck).setOnClickListener(this);
        findViewById(R.id.checkin).setOnClickListener(this);
        findViewById(R.id.checkout).setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.guardprofile:
                startActivity(new Intent(getApplicationContext(),Activity_guardProfile.class));
                break;
            case R.id.truck:
                startActivity(new Intent(getApplicationContext(),Activity_deliveryVehicle.class));
                break;
            case R.id.checkin:
                startActivity(new Intent(getApplicationContext(),Activity_Checkin.class));
                break;
            case R.id.checkout:
                startActivity(new Intent(getApplicationContext(),Activity_Checkout.class));
                break;
        }


    }
}
