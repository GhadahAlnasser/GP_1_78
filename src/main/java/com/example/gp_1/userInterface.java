package com.example.gp_1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class userInterface extends AppCompatActivity {
    Button vm;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_interface);
        vm = (Button) findViewById(R.id.viewMap);
        vm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(userInterface.this, UserPage.class);
                startActivity(i);
            }

        });
    }

//    public void viewMap(View v) {
//
//        Intent myIntent = new Intent(getBaseContext(), UserPage.class);
//        startActivity(myIntent);
//    }
}
