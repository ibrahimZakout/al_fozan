package com.coders.al_fozan;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;

public class DetailOrder extends AppCompatActivity {
    Button button2,save;
    MyDialog x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_order);

        checkNetworkConnectionStatus();


        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(DetailOrder.this, R.style.BottomSheetStyle);
                bottomSheetDialog.setContentView(R.layout.bottom_sheet2);
                bottomSheetDialog.setCanceledOnTouchOutside(false);


                ImageView close_bottom_sheet = bottomSheetDialog.findViewById(R.id.close_bottom_sheet);
                close_bottom_sheet.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        bottomSheetDialog.dismiss();
                    }
                });


                save = bottomSheetDialog.findViewById(R.id.save);
                save.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {





                        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(DetailOrder.this, R.style.BottomSheetStyle);
                        bottomSheetDialog.setContentView(R.layout.bottom_sheet);
                        bottomSheetDialog.setCanceledOnTouchOutside(false);


                        ImageView close_bottom_sheet = bottomSheetDialog.findViewById(R.id.close_bottom_sheet);
                        close_bottom_sheet.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                bottomSheetDialog.dismiss();
                            }
                        });


                        save = bottomSheetDialog.findViewById(R.id.save);
                        save.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                x = MyDialog.getInstance();
                                x.openDialog(DetailOrder.this);



                            }
                        });
                        bottomSheetDialog.show();





                    }
                });
                bottomSheetDialog.show();
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
