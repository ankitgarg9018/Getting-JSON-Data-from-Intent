package com.example.mybmi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.service.autofill.RegexValidator;
import android.util.Patterns;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;
import com.basgeekball.awesomevalidation.utility.RegexTemplate;


import org.w3c.dom.Text;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    private Object Menu;
    TextView b;
    EditText etName,etMoblie,etEmail,etPass,etWebsite;
    Button calbutton;


/*AwesomeValidation awesomeValidation;*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName = findViewById(R.id.et_name);
        etMoblie = findViewById(R.id.et_mobile);
        etEmail = findViewById(R.id.et_email);
        etPass = findViewById(R.id.et_pass);
        etWebsite= findViewById(R.id.et_web);
        calbutton = findViewById(R.id.cal_button);
        b = findViewById(R.id.tv_score);
        registerForContextMenu(b);

        // Initialize validation
/*awesomeValidation =new AwesomeValidation(ValidationStyle.BASIC);

             // Add Validation For name
awesomeValidation.addValidation(this,R.id.et_name,
        RegexTemplate.NOT_EMPTY,R.string.Invalid_Name);

        // Add Validation For mobile no
        awesomeValidation.addValidation(this,R.id.et_mobile
        , "[5-9]{1}[0-9]{9}$",R.string.Invalid_moble);
        // Add Validation For Email id
        awesomeValidation.addValidation(this,R.id.et_email
        , Patterns.EMAIL_ADDRESS,R.string.Invalid_Email);
        // Add Validation For Password
        awesomeValidation.addValidation(this,R.id.et_pass
        , "{8}",R.string.Invalid_Password);*/

        calbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //check vaidtion
                String name  = etName.getText().toString().trim();
                String mobile =etMoblie.getText().toString().trim();
                String Email = etEmail.getText().toString().trim();
                String web = etWebsite.getText().toString().trim();
                String pass = etPass.getText().toString().trim();
                String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
                String WebUrl = "^((ftp|http|https):\\/\\/)?(www.)?(?!.*(ftp|http|https|www.))[a-zA-Z0-9_-]+(\\.[a-zA-Z]+)+((\\/)[\\w#]+)*(\\/\\w+\\?[a-zA-Z0-9_]+=\\w+(&[a-zA-Z0-9_]+=\\w+)*)?$";

               if(name.equals(""))
               {
                   etName.setError("Please Enter Name");
                   return;
               }
                if(mobile.equals("") || mobile.length() <=9){
                   etMoblie.setError("Please Enter the Vaild number");
               }
                if(Email.matches(emailPattern) && Email.length() > 0){

                    etEmail.setError("Please Enter the Vaild Email");
                }
                if(web.matches(WebUrl) || web.length()>0){
                    etWebsite.setError("Please Enter the Vaild Website");
                }
                if(mobile.equals("") || mobile.length() <=9){
                    etMoblie.setError("Please Enter the Vaild number");
                }

               else {

               }
            }
        });
           /*binding.calButton.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  String cb1 = binding.cbItem1.getText().toString();
                  String cb2 = binding.cbItem2.getText().toString();
                  String cb3 = binding.cbItem3.getText().toString();
                  String cb4 = binding.cbItem4.getText().toString();
                  String cb5 = binding.cbItem5.getText().toString();

                  if (binding.cbItem1.isChecked() && binding.cbItem2.isChecked() &&
                          binding.cbItem3.isChecked() && binding.cbItem4.isChecked() && binding.cbItem5.isChecked())

                  {
                      binding.tvScore.setText("Selected:   "+cb1+""+cb2+""+cb3+""+cb4+""+cb5 );
                  }
                      else if (binding.cbItem1.isChecked())

                  {
                      binding.tvScore.setText("Selected:   "+cb1 );
                  }
                  else if (binding.cbItem2.isChecked())
                  {

                      binding.tvScore.setText("Selected:   "+cb2 );
                  }
                  else if (binding.cbItem3.isChecked())
                  {
                      binding.tvScore.setText("Selected:   "+cb3);
                  }
                  else if (binding.cbItem4.isChecked())
                  {
                      binding.tvScore.setText("Selected:   "+cb4 );
                  }
                  else if (binding.cbItem5.isChecked())
                  {
                      binding.tvScore.setText("Selected:   "+cb5 );
                  }
                 else {

                     binding.tvScore.setText("Please Selected any Checkbox");
                  }
              }


          });*/

    }// option method

    @Override
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }//----option

    //context method

    /*private ActionMode.Callback actionModeCallback = new ActionMode.Callback() {


        @Override
        public boolean onCreateActionMode(ActionMode mode, Menu menu) {

            MenuInflater inflater = mode.getMenuInflater();
            inflater.inflate(R.menu.menu, menu);
            return true;
        }

        @Override
        public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
            return false; // Return false if nothing is done
        }

        @Override
        public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
            switch (item.getItemId()) {
                case R.id.stt:
                    Toast.makeText(MainActivity.this, "Setting 1", Toast.LENGTH_SHORT).show();
                    mode.finish(); // Action picked, so close the CAB
                    return true;
                case R.id.log:
                    Toast.makeText(MainActivity.this, "Login 1", Toast.LENGTH_SHORT).show();
                    mode.finish(); // Action picked, so close the CAB
                    return true;
                default:
                    return false;
            }
        }

        // Called when the user exits the action mode
        @Override
        public void onDestroyActionMode(ActionMode mode) {
            actionMode = null;
        }
    };*/

    // context menu is Requried View
        /*public void ActionMode(View view){
       TextView  click = findViewById(R.id.tv_score);

       click.setOnLongClickListener(new View.OnLongClickListener() {

           public boolean onLongClick(View view) {
               Object actionMode = null;
               if (actionMode != null) {
                   return false;
               }
               // Start the CAB using the ActionMode.Callback defined above
               actionMode = MainActivity.this.startActionMode(actionModeCallback);
               view.setSelected(true);
               return true;
           }
       });
        }*/
    // option item selected----
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.abmi:
                Intent intent = new Intent(MainActivity.this,AboutbmiActivity.class);
                startActivity(intent);
                return true;
            case R.id.bmic:

                Intent intent2 = new Intent(MainActivity.this,BMIChartActivity.class);
                startActivity(intent2);
                /*Toast.makeText(MainActivity.this, "Login", Toast.LENGTH_SHORT).show();*/
                return true;
            case R.id.abdev:
                Intent intent3 = new Intent(MainActivity.this,AboutDeveloperActivity.class);
                startActivity(intent3);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }//----------option
    //POP menu------


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.abmi:
                Toast.makeText(MainActivity.this, "Setting", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.bmic:
                Toast.makeText(MainActivity.this, "Login", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onContextItemSelected(item);
        }

    /*public void showMenu(View v) {
        PopupMenu popup = new PopupMenu(this, v);

        // This activity implements OnMenuItemClickListener
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.menu);
        popup.show();
    }//----POP

    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        MenuItem item = null;
        switch (item.getItemId()) {
            case R.id.stt:
                Toast.makeText(MainActivity.this, "Setting", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.log:
                Toast.makeText(MainActivity.this, "Login", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }*/
    }
}

