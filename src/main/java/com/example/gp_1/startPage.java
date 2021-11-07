package com.example.gp_1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class startPage extends AppCompatActivity {
    Button Ubtn;
    Button Abtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_page);
        Ubtn = (Button) findViewById(R.id.LogUser);
        Ubtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(startPage.this, userInterface.class );
                startActivity(i);
            }
        });
        Abtn = (Button) findViewById(R.id.LogAdmin);
        Abtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(startPage.this, AdminLogin.class );
                startActivity(i);
            }

        });
        }


}