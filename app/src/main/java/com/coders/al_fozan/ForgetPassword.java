package com.coders.al_fozan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.coders.al_fozan.ui.dashboard.MainFragment;

public class ForgetPassword extends AppCompatActivity {
    Button forgetPasswordButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forgetpassword);




        forgetPasswordButton = findViewById(R.id.forgetPasswordButton);
        forgetPasswordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent x = new Intent(ForgetPassword.this, BottomNavigationMain.class);
                startActivity(x);
            }
        });



    }}