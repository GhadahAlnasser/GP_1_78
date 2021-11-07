package com.example.gp_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class AdminPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_page);
    }
    public void ShowMapLandmarks(View v) {

        Intent myIntent = new Intent(getBaseContext(), UserPage.class);
        startActivity(myIntent);
    }

    public void goToEditLandmarksPage(View v) {
Uri uri = Uri.parse("https://studio.mapbox.com/datasets/");
Intent intent = new Intent(Intent.ACTION_VIEW, uri);
startActivity(intent);

    }
    public void goToUploadLandmarksPage(View v) {
        Uri uri = Uri.parse("https://studio.mapbox.com/datasets/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}