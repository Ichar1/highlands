package com.example.ray.highlands.Guard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.example.ray.highlands.R;

public class Activity_deliveryVehicle extends AppCompatActivity {

    TextView delivery1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_vehicle);
        setTitle("Delivery Vehicles");

        delivery1 = findViewById(R.id.delivery1);

        delivery1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Activity_Categories.class));
            }
        });
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

}
