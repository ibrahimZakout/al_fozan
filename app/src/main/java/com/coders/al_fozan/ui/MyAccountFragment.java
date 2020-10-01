package com.coders.al_fozan.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.coders.al_fozan.AboutCompny;
import com.coders.al_fozan.BottomNavigationMain;
import com.coders.al_fozan.CallUs;
import com.coders.al_fozan.ForgetPassword;
import com.coders.al_fozan.R;

public class MyAccountFragment extends Fragment {
    ImageView go_to_callus,aboutproject;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view =inflater.inflate(R.layout.fragment_myaccount, container, false);


        go_to_callus = view.findViewById(R.id.go_to_callus);
        aboutproject = view.findViewById(R.id.aboutproject);
        go_to_callus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s = new Intent(getContext(),CallUs.class);
                startActivity(s);
            }
        });
        aboutproject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s = new Intent(getContext(), AboutCompny.class);
                startActivity(s);
            }
        });

        return view;
    }

}