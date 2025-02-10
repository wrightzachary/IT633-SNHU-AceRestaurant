package com.example.acerestaurant;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class AboutUsActivity extends AppCompatActivity {

    // Override onCreate method
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        // Get the list of people
        List<com.example.acerestaurant.Person> people = com.example.acerestaurant.Person.getPeople();

        // Set up the RecyclerView
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        PersonAdapter adapter = new PersonAdapter(people);
        recyclerView.setAdapter(adapter);
    }
}