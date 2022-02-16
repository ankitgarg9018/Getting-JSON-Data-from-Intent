package com.example.mybmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.gson.Gson;

import java.security.Key;

public class AboutDeveloperActivity extends AppCompatActivity {
    EditText etname,etprocess,etquali,etcompany;
    Button btsubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_developer);
        etname = findViewById(R.id.et_dname);
        etprocess = findViewById(R.id.et_deveprocess);
        etquali = findViewById(R.id.et_quali);
        etcompany = findViewById(R.id.et_cname);
        btsubmit = findViewById(R.id.bt_submit);

        btsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String name = etname.getText().toString();
               String process = etprocess.getText().toString();
               String qualification = etquali.getText().toString();
               String company = etcompany.getText().toString();

                    //Intent through passing data...../
               Intent intent = new Intent(AboutDeveloperActivity.this,SubmitActivity.class);
               intent.putExtra("Name",name);
                intent.putExtra("Process",process);
                /*intent.putExtra("Qualification",qualification);
                intent.putExtra("Company",company);
                startActivity(intent);*/


                //Bundle  through passing data...../
               /* Bundle bundle = new Bundle();
                bundle.putString(Keys.FIRST_NAME,name);
                 intent.putExtras(bundle);
                 startActivity(intent);*/
///----------------Serializable----------
               /* emp Emp = new emp();
                Emp.setName(name);
                Emp.setProcess(process);
                intent.putExtra(Keys.SERIALIZED_DATA,Emp);
                startActivity(intent);*/

                empDataWithSerilKeys data= new empDataWithSerilKeys();
                data.setEmpName(name);
                data.setEmpProcess(process);
                intent.putExtra(Keys.JSON_DATA,new Gson().toJson(data));
                startActivity(intent);


            }
        });
    }
}