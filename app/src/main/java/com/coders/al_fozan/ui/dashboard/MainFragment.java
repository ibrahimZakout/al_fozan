package com.coders.al_fozan.ui.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.coders.al_fozan.CallUs;
import com.coders.al_fozan.DetailOrder;
import com.coders.al_fozan.DetailOreder1;
import com.coders.al_fozan.Login;
import com.coders.al_fozan.R;

public class MainFragment extends Fragment {
    TextView en, enV, ar, arV;
    View view;
    ImageView imageView5;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_main, container, false);

 /*      en = veiw.findViewById(R.id.text_english);
        enV = view.findViewById(R.id.text_english_v);
        ar = view.findViewById(R.id.text_arabic);
        arV = view.findViewById(R.id.text_arabic_v);

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
*/

        imageView5 =view.findViewById(R.id.imageView5);
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s = new Intent(getContext(),DetailOrder.class);
                startActivity(s);
            }
        });






        return view;
    }
}