package com.example.acerestaurant;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/**
 * AboutUsActivity class that displays the list of people
 */
public class AboutUsActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_about_us);

        // Find the back button (Home Icon)
        ImageButton backButton = findViewById(R.id.backButton);

        // Set a click listener for the back button
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Finish the activity to go back
                finish();
            }
        });

        // Get the list of people
        List<com.example.acerestaurant.Person> people = com.example.acerestaurant.Person.getPeople();

        // Set up the RecyclerView
        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        // Set the layout manager
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Set up the adapter
        PersonAdapter adapter = new PersonAdapter(people);

        // Set the adapter
        recyclerView.setAdapter(adapter);
    }
}