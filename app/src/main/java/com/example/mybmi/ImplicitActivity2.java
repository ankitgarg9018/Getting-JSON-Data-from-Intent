package com.example.mybmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ImplicitActivity2 extends AppCompatActivity  implements View.OnClickListener {
    Button bturl,btdial;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit2);

        bturl = findViewById(R.id.bt_url);
        btdial = findViewById(R.id.bt_dial);

       bturl.setOnClickListener(this);
       btdial.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.bt_url:
                Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/reference/android/content/Intent"));
                startActivity(intent);
                break;
                //-----URL open-------//
            case R.id.bt_dial:
                Intent intentDial = new Intent(Intent.ACTION_DIAL);
                intentDial.setData(Uri.parse("tel:121"));
                startActivity(intentDial);
                break;
        }



    }
}