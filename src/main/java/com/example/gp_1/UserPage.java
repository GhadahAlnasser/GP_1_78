package com.example.gp_1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.mapbox.mapboxsdk.Mapbox;
import com.mapbox.mapboxsdk.maps.MapView;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.maps.OnMapReadyCallback;
import com.mapbox.mapboxsdk.maps.Style;

public class UserPage extends AppCompatActivity {

    Button Abtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Mapbox.getInstance(this, getString(R.string.mapbox_access_token));

        setContentView(R.layout.activity_user_page);

        MapView mapView = (MapView) findViewById(R.id.mapView);
        mapView.onCreate(savedInstanceState);

        mapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(@NonNull MapboxMap mapboxMap) {

                //the code bellow shows the map of the collage:
                mapboxMap.setStyle(new Style.Builder().fromUri("mapbox://styles/gp1/ckv8fa6wn9hwf14qk6hj5rswr"), new Style.OnStyleLoaded() {

                    //
                    @Override
                    public void onStyleLoaded(@NonNull Style style) {

                        // Custom map style has been loaded and map is now ready



                    }
                });
//

            }






        });

        Abtn = (Button) findViewById(R.id.Abutton);
        Abtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(UserPage.this, AdminLogin.class);
                startActivity(i);
            }

        });
    }
}