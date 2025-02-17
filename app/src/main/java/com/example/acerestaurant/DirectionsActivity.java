package com.example.acerestaurant;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * DirectionsActivity class that displays the Google Maps
 */
public class DirectionsActivity extends AppCompatActivity implements OnMapReadyCallback {

    // instantiate the Variable for map
    private GoogleMap map;

    /**
     * Called when the activity is first created.
     * @param savedInstanceState If the activity is being re-initialized after
     *     previously being shut down then this Bundle contains the data it most
     *     recently supplied in {@link #onSaveInstanceState}.  <b><i>Note: Otherwise it is null.</i></b>
     *
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // Initialize the activity
        super.onCreate(savedInstanceState);

        // Set the content view
        setContentView(R.layout.activity_directions);

        // Get the SupportMapFragment and request notification when the map is ready to be used
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);

        // Assert that the mapFragment is not null
        assert mapFragment != null;

        // Request notification when the map is ready to be used
        mapFragment.getMapAsync(this);
    }

    /**
     * Callback interface for when the map is ready to be used
     * @param googleMap
     */
    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {

        // Initialize the map
        map = googleMap;

        // Add a marker for the restaurant
        LatLng restaurantLocation = new LatLng(31.05640532808242, -97.45103398532831);

        // Assert that the map is not null
        map.addMarker(new MarkerOptions().position(restaurantLocation).title("Ace Restaurant"));

        // Move the camera to the restaurant location
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(restaurantLocation, 15));
    }
}