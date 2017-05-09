package com.example.acer.employersignup;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

import java.util.Objects;


public class EmployerSignUp extends AppCompatActivity implements OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employer_sign_up);
    }

    public void FullForm(   View v ){
        if(v.getId()==R.id.signupButton) {
         String fname = findViewById(R.id.FirstNameEmployer);
                 if(fname.equals("")){
                     Toast.makeText(getApplicationContext(),"Please enter first name",Toast.LENGTH_SHORT).show();
                 }
                 String lname = findViewById(R.id.LastNameEmployer);
                         if(lname.equals("")){
                             Toast.makeText(getApplicationContext(),"Please enter last name",Toast.LENGTH_SHORT).show();
                         }
                         String cname = findViewById(R.id.CnameEmployer);
                                 if(cname.equals("")){
                                     Toast.makeText(getApplicationContext(),"Please enter company name",Toast.LENGTH_SHORT).show();
                                 }
                                String dname =  findViewById(R.id.designationEmployer);
                                        if(dname.equals("")){
                                            Toast.makeText(getApplicationContext(),"Please enter Designation",Toast.LENGTH_SHORT).show();
                                        }
                                        String pnumber = findViewById(R.id.PnumberEmployer);
                                                if(pnumber.equals("")){
                                                    Toast.makeText(getApplicationContext(),"Please enter phone number",Toast.LENGTH_SHORT).show();
                                                }
                                                String email = findViewById(R.id.emailIDEmployer);
                                                        if(email.equals("")){
                                                            Toast.makeText(getApplicationContext(),"Please enter your email",Toast.LENGTH_SHORT).show();
                                                        }
                                                String passwd = findViewById(R.id.passwordEmployer);
                                                        if(passwd.equals("")){
                                                            Toast.makeText(getApplicationContext(),"Please enter Password",Toast.LENGTH_SHORT).show();
                                                        }
                                                        String rpasswd = findViewById(R.id.rpasswordEmployer);
                                                                if(rpasswd.equals("")){
                                                                    Toast.makeText(getApplicationContext(),"Please re-enter Password",Toast.LENGTH_SHORT).show();
                                                                }
        }

    }
    @Override
    public void onStart()
    {
        super.onStart();

    }

    @Override
    public void onStop() {
        super.onStop();

    }

    @Override
    public void onClick(View v) {

    }
}

