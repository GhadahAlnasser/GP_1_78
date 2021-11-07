package com.example.gp_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class AdminLogin extends AppCompatActivity {
    EditText etUsername,etPassword;
    Button btnLogin;
    CheckBox cbShowPassword;

    SharedPreferences sharedPreferences;

    public static final String  fileName = "login";
    public static final String  Username = "username";
    public static final String Password = "password";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);
        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);

        btnLogin = findViewById(R.id.btnLogin);

        cbShowPassword = findViewById(R.id.cbShowPassword);

        sharedPreferences = getSharedPreferences(fileName, Context.MODE_PRIVATE);

        if(sharedPreferences.contains(Username)){
            Intent i = new Intent(AdminLogin.this,AdminPage.class);
            startActivity(i);
        }
        btnLogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String username  = etUsername.getText().toString();
                String password = etPassword.getText().toString();

                if(username.equals("GuideMeAdmin") && password.equals("GuideMeAdmin@11@")){
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString(Username,username);
                    editor.putString(Password,password);
                    editor.commit();
                    Toast.makeText(getApplicationContext(),"Successfully Login",Toast.LENGTH_SHORT).show();

                    Intent i = new Intent(AdminLogin.this,AdminPage.class);
                    startActivity(i);
            }else {
                    Toast.makeText(getApplicationContext(),"Invalid ",Toast.LENGTH_SHORT).show();
                    etUsername.setText("");
                    etUsername.requestFocus();
                    etPassword.setText("");
                }
            }
        });

         cbShowPassword.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(!isChecked){
                etPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            else{
                etPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            }


         });
    }
}