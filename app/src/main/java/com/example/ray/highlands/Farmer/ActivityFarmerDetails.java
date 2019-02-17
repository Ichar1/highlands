package com.example.ray.highlands.Farmer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ray.highlands.R;

public class ActivityFarmerDetails extends AppCompatActivity {

    Button btn_addfarmer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farmer_details);

        btn_addfarmer = (Button) findViewById(R.id.btn_submit);

        btn_addfarmer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = new Intent(ActivityFarmerDetails.this,Add_cattle.class);
                startActivity(next);
            }
        });
    }
}
