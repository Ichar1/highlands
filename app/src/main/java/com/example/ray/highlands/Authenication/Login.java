package com.example.ray.highlands.Authenication;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ray.highlands.Farmer.Farmer_form;
import com.example.ray.highlands.Guard.Activity_Guard;
import com.example.ray.highlands.Guard.MainActivity;
import com.example.ray.highlands.R;

public class Login extends AppCompatActivity {

    private Button btnSignin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        btnSignin = findViewById(R.id.signIn);

        btnSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });
    }
}
