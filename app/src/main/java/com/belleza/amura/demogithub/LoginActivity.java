package com.belleza.amura.demogithub;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Pooja at amura on 6/4/16.
 */
public class LoginActivity extends AppCompatActivity{


    Button btn_login;
    EditText edt_username,edt_password;
    TextView tv_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);




        btn_login=(Button)findViewById(R.id.btn_login);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent_login= new Intent(LoginActivity.this,MainActivity.class);
                startActivity(intent_login);

            }
        });

        tv_register=(TextView)findViewById(R.id.tv_register);

        tv_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               Intent intent_login= new Intent(LoginActivity.this,RegisterActivity.class);
               startActivity(intent_login);
            }
        });

// nothing to display

    }

    /*public void init{


        edt_name=(EditText)findViewById(R.id.edt_name_register);
        edt_password=(EditText)findViewById(R.id.edt_password);
        edt_confirmpassword=(EditText)findViewById(R.id.edt_confirm_password_rigister);
    }*/
}
