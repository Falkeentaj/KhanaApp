package com.example.khanaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.khanaapp.AdministratorUser.AdministratorSignInActivity;
import com.example.khanaapp.ClientUser.ClientUserSignInActivity;
import com.example.khanaapp.RestaurantUser.RestaurantSignInActivity;
import com.example.khanaapp.RiderUser.RiderSignInActivity;
import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private MaterialButton clientUser, restaurantUser, riderUser, administratorUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clientUser = findViewById(R.id.btn_client_SignIn);
        clientUser.setOnClickListener(this);

        restaurantUser = findViewById(R.id.btn_restaurent_SignIn);
        restaurantUser.setOnClickListener(this);

        riderUser = findViewById(R.id.btn_rider_SignIn);
        riderUser.setOnClickListener(this);

        administratorUser = findViewById(R.id.btn_administrator_SignIn);
        administratorUser.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view == clientUser) {
            Intent clientUser = new Intent(MainActivity.this, ClientUserSignInActivity.class);
            startActivity(clientUser);

        } else if (view == restaurantUser) {
            Intent restaurantUser = new Intent(MainActivity.this, RestaurantSignInActivity.class);
            startActivity(restaurantUser);

        } else if (view == riderUser) {
            Intent riderUser = new Intent(MainActivity.this, RiderSignInActivity.class);
            startActivity(riderUser);

        } else if (view == administratorUser) {
            Intent administratorUser = new Intent(MainActivity.this, AdministratorSignInActivity.class);
            startActivity(administratorUser);
        }
    }
}