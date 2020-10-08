package com.coders.al_fozan;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;



/*public class MyDialog extends AppCompatActivity {
    Dialog d;
    Button button_dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog); // focus i put here the name of xml activity it will turn me to dialog

        d = new Dialog(this);


        openDialog();

    }

    public void openDialog(){
        d.requestWindowFeature(Window.FEATURE_NO_TITLE);
        d.setContentView(R.layout.dialog);

        button_dialog = d.findViewById(R.id.button_dialog);
       button_dialog.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) { // its not complete
               d.dismiss();
               Toast.makeText(getBaseContext(),"شغل نضيف نضيف ",Toast.LENGTH_LONG).show();
           }
       });


        d.show();

    }

}*/

    public class MyDialog {
    Dialog d;
    Button button_dialog;
    static MyDialog instance;

    public static MyDialog getInstance() {
        if (instance == null) {
            instance = new MyDialog();
        }
        return instance;
    }


     public void openDialog(final Context context) {
        if (d == null)
            d = new Dialog(context);
        d.setContentView(R.layout.dialog);
        d.getWindow().setBackgroundDrawableResource(android.R.color.transparent);

        button_dialog = d.findViewById(R.id.button_dialog);
        button_dialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { // its not complete
                d.dismiss();
                Toast.makeText(context, "شغل نضيف نضيف ", Toast.LENGTH_LONG).show();
            }
        });

        d.show();
    }

      /*  public void openDialog(final Context context) {
            if (d == null)
                d = new Dialog(context);
            d.setContentView(R.layout.picture1);
            d.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
            d.show();
        }*/
}
