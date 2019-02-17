package com.example.ray.highlands.Guard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.ray.highlands.R;

public class ItemOnCheckout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_on_checkout);
        setTitle("Item On Checkout");
    }

    public void checkOut(View view){
        Guard_Dialog guard_dialog = new Guard_Dialog();
        guard_dialog.show(getFragmentManager(),"check Out successful");

    }
}
