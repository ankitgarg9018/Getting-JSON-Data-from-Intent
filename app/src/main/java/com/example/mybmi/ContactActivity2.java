package com.example.mybmi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.security.acl.Permission;

public class ContactActivity2 extends AppCompatActivity implements View.OnClickListener {
Button btcall,btdial,btemail;

    private final String[] PERMISSIONS = new String[]{Manifest.permission.CALL_PHONE, Manifest.permission.ACCESS_COARSE_LOCATION, Manifest.permission.ACCESS_FINE_LOCATION};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact2);
        btcall = findViewById(R.id.bt_call);
        btdial= findViewById(R.id.bt_dial);
        btemail = findViewById(R.id.bt_email);

       btdial.setOnClickListener(this);
       btcall.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
      switch (view.getId()){
          case R.id.bt_dial:
          Intent intentDial = new Intent(Intent.ACTION_DIAL);
          intentDial.setData(Uri.parse("tel:121"));
          startActivity(intentDial);
          break;

          case R.id.bt_call:
              if(ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE)== PackageManager.PERMISSION_GRANTED) {
                  Intent intentCall = new Intent(Intent.ACTION_CALL);
                  intentCall.setData(Uri.parse("121"));
                  startActivity(intentCall);
              }

              else {

                  ActivityCompat.requestPermissions(ContactActivity2.this, PERMISSIONS, 1);
              }
              break;


      }


    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(requestCode == 1){

            if(grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){

                Intent intentCall = new Intent(Intent.ACTION_CALL);
                intentCall.setData(Uri.parse("121"));
                startActivity(intentCall);
            }
            else {

                Toast.makeText(this, "Permission Denied!", Toast.LENGTH_SHORT).show();
            }


        }
    }
}

