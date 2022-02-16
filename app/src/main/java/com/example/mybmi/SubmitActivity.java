package com.example.mybmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.gson.Gson;

import org.w3c.dom.Text;

public class SubmitActivity extends AppCompatActivity {
    TextView tvname,tvprocess,tvQualifi,tvcname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit);
        tvname = findViewById(R.id.tname);
        tvprocess = findViewById(R.id.tprocess);
        tvQualifi = findViewById(R.id.tquali);
        tvcname = findViewById(R.id.tcname);
         //Intent through
        Intent intent = getIntent();
       String names = intent.getStringExtra("Name");
        String process = intent.getStringExtra("Process");
       /* String qualification = intent.getStringExtra("Qualification");
        String company = intent.getStringExtra("Company");*/

        //Bundle through

      /*  Bundle bundle = intent.getExtras();
        String names = bundle.getString(Keys.FIRST_NAME);*/

              /*emp Emp = (emp) intent.getSerializableExtra(Keys.SERIALIZED_DATA);*/
        String jsonString = intent.getStringExtra(Keys.JSON_DATA);
               empDataWithSerilKeys data =  new Gson().fromJson(jsonString,empDataWithSerilKeys.class);




        /*tvname.setText("Developer Name:"    +names);
        tvprocess.setText("Developer Process:"      +process);*/

        Log.d("DATA", names+" "+process);


        /*tvQualifi.setText("Qualification:"       +qualification);
        tvcname.setText("Company Name:"      +company);*/

    }

}