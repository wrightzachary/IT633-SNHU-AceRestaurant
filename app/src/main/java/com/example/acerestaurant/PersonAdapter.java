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

/**
 * PersonAdapter class that displays the list of people
 */
public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.PersonViewHolder> {

    // Instance variables
    private final List<Person> people;

    // Constructor for the person adapter
    public PersonAdapter(List<Person> people) {
        this.people = people;
    }

    /**
     * Override method for creating a new ViewHolder
     * @param parent The ViewGroup into which the new View will be added after it is bound to
     *               an adapter position.
     * @param viewType The view type of the new View.
     *
     * @return
     */
    @NonNull
    @Override
    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        // Inflate the layout for each item
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_person, parent, false);

        // Create a new ViewHolder for the item
        return new PersonViewHolder(view);
    }

    /**
     * Override method for binding the data to the ViewHolder
     * @param holder The ViewHolder which should be updated to represent the contents of the
     *        item at the given position in the data set.
     * @param position The position of the item within the adapter's data set.
     */
    @Override
    public void onBindViewHolder(@NonNull PersonViewHolder holder, int position) {
        Person person = people.get(position);
        holder.nameTextView.setText(person.getName());
        holder.bioTextView.setText(person.getBio());
        holder.relevantInfoTextView.setText(person.getRelevantInfo());
        holder.photoImageView.setImageResource(person.getPhotoResId());
    }

    /**
     * Override method for getting the number of items in the data set
     * @return The total number of items in this adapter.
     */
    @Override
    public int getItemCount() {

        // Return the number of items in the data set
        return people.size();
    }

    /**
     * PersonViewHolder class that holds the views for each item
     */
    public static class PersonViewHolder extends RecyclerView.ViewHolder {

        // Instance variables
        TextView nameTextView;
        TextView bioTextView;
        TextView relevantInfoTextView;
        ImageView photoImageView;

        /**
         * Constructor for the person view holder
         * @param itemView
         */
        public PersonViewHolder(@NonNull View itemView) {

            // Call the superclass constructor
            super(itemView);

            // Initialize the instance variables
            nameTextView = itemView.findViewById(R.id.nameTextView);
            bioTextView = itemView.findViewById(R.id.bioTextView);
            relevantInfoTextView = itemView.findViewById(R.id.relevantInfoTextView);
            photoImageView = itemView.findViewById(R.id.photoImageView);
        }
    }
}