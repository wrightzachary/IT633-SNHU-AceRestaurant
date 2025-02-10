package com.example.acerestaurant;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class DirectionsActivity extends AppCompatActivity implements OnMapReadyCallback {
    // Override onCreate method
    private GoogleMap map;

    // Override onCreate method
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_directions);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    // Override onMapReady method
    @Override
    public void onMapReady(GoogleMap googleMap) {
        map = googleMap;
        // Add a marker for the restaurant
        LatLng restaurantLocation = new LatLng(31.05640532808242, -97.45103398532831); // Replace with your restaurant's coordinates
        map.addMarker(new MarkerOptions().position(restaurantLocation).title("Your Restaurant"));
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(restaurantLocation, 15));
    }
}