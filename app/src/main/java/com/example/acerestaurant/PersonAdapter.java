package com.example.acerestaurant;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import com.example.acerestaurant.Person;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.PersonViewHolder> {
    // instantiate the Variables
    private List<Person> people;

    // Constructor
    public PersonAdapter(List<Person> people) {
        this.people = people;
    }

    // Override methods
    @NonNull
    @Override
    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_person, parent, false);
        return new PersonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonViewHolder holder, int position) {
        Person person = people.get(position);
        holder.nameTextView.setText(person.getName());
        holder.bioTextView.setText(person.getBio());
        holder.relevantInfoTextView.setText(person.getRelevantInfo());
        holder.photoImageView.setImageResource(person.getPhotoResId());
    }

    @Override
    public int getItemCount() {
        return people.size();
    }

    // ViewHolder class
    public static class PersonViewHolder extends RecyclerView.ViewHolder {
        TextView nameTextView;
        TextView bioTextView;
        TextView relevantInfoTextView;
        ImageView photoImageView;

        // Constructor
        public PersonViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.nameTextView);
            bioTextView = itemView.findViewById(R.id.bioTextView);
            relevantInfoTextView = itemView.findViewById(R.id.relevantInfoTextView);
            photoImageView = itemView.findViewById(R.id.photoImageView);
        }
    }
}