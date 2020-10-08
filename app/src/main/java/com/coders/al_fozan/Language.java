package com.coders.al_fozan;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class Language extends AppCompatActivity {
    TextView en, enV, ar, arV;
    Button languageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.language);

        checkNetworkConnectionStatus();



        languageButton = findViewById(R.id.languageButton);
        languageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent x = new Intent(Language.this, Login.class);
                startActivity(x);
            }
        });


        en = findViewById(R.id.text_english);
        enV = findViewById(R.id.text_english_v);
        ar = findViewById(R.id.text_arabic);
        arV = findViewById(R.id.text_arabic_v);

        en.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enV.setVisibility(View.VISIBLE);
                ar.setVisibility(View.VISIBLE);
                arV.setVisibility(View.GONE);
                en.setVisibility(View.GONE);
            }
        });
        ar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arV.setVisibility(View.VISIBLE);
                en.setVisibility(View.VISIBLE);
                enV.setVisibility(View.GONE);
                ar.setVisibility(View.GONE);
            }
        });

    }
    private void checkNetworkConnectionStatus() {
        boolean wifiConnected;
        boolean mobileConnected;
        ConnectivityManager connMgr = (ConnectivityManager)
                getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeInfo = connMgr.getActiveNetworkInfo();
        if (activeInfo != null && activeInfo.isConnected()){ //connected with either mobile or wifi
            wifiConnected = activeInfo.getType() == ConnectivityManager.TYPE_WIFI;
            mobileConnected = activeInfo.getType() == ConnectivityManager.TYPE_MOBILE;
            if (wifiConnected){ //wifi connected

            }

        }else { //no internet connection
            Intent s = new Intent(this,NoInternetConnection.class);
            startActivity(s);
        }
    }
}
