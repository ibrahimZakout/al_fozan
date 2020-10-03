package com.coders.al_fozan;


import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class Picture1 extends AppCompatActivity {
    Dialog a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.picture1); // focus i put here the name of xml activity it will turn me to dialog

        a = new Dialog(this);


        openDialog();

    }

    public void openDialog(){
        a.requestWindowFeature(Window.FEATURE_NO_TITLE);
        a.setContentView(R.layout.dialog);
        a.show();

    }

}