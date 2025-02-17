package com.example.acerestaurant;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

/**
 * MainActivity class that displays the main screen
 */
public class MainActivity extends AppCompatActivity {

    /**
     *  Override onCreate method that is called when the activity is first created
     * @param savedInstanceState If the activity is being re-initialized after
     *     previously being shut down then this Bundle contains the data it most
     *     recently supplied in {@link #onSaveInstanceState}.  <b><i>Note: Otherwise it is null.</i></b>
     *
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // Call the superclass onCreate method
        super.onCreate(savedInstanceState);

        // Set the content view to the main layout
        setContentView(R.layout.activity_main);

        // Set the Directions button and About Us button to the corresponding buttons in the layout
        Button directionsButton = findViewById(R.id.directionsButton);
        Button aboutUsButton = findViewById(R.id.aboutUsButton);

        // Set click listeners for the Directions button
        directionsButton.setOnClickListener(new View.OnClickListener() {

            /**
             * Override onClick method that is called when the button is clicked
             * @param v The view that was clicked.
             */
            @Override
            public void onClick(View v) {

                // Create an intent to start the DirectionsActivity
                Intent intent = new Intent(MainActivity.this, DirectionsActivity.class);

                // Start the DirectionsActivity
                startActivity(intent);
            }
        });

        // Set click listeners for the About Us button
        aboutUsButton.setOnClickListener(new View.OnClickListener() {

            /**
             * Override onClick method that is called when the button is clicked
             * @param v The view that was clicked.
             */
            @Override
            public void onClick(View v) {

                // Create an intent to start the AboutUsActivity
                Intent intent = new Intent(MainActivity.this, AboutUsActivity.class);

                // Start the AboutUsActivity
                startActivity(intent);
            }
        });
    }
}