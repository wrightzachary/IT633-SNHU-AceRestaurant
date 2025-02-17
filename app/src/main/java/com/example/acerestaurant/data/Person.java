package com.example.acerestaurant;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

/**
 * Person class that holds the information for each person
 */
public class Person implements Parcelable {
    // Person Variables
    private String name;
    private String bio;
    private String relevantInfo;
    private int photoResId;

    /**
     * Constructor
     * @param name
     * @param bio
     * @param relevantInfo
     * @param photoResId
     */
    public Person(String name, String bio, String relevantInfo, int photoResId) {

        // Initialize the variables
        this.name = name;
        this.bio = bio;
        this.relevantInfo = relevantInfo;
        this.photoResId = photoResId;
    }

    /***
     * Constructor
     * @param in
     */
    protected Person(Parcel in) {

        // Initialize the variables
        name = in.readString();
        bio = in.readString();
        relevantInfo = in.readString();
        photoResId = in.readInt();
    }

    /**
     * Creator
     */
    public static final Creator<Person> CREATOR = new Creator<Person>() {

        // Override method for creating a new Person object from a Parcel
        @Override
        public Person createFromParcel(Parcel in) {

            // Create a new Person object from a Parcel
            return new Person(in);
        }

        // Override method for creating a new array of Person objects
        @Override
        public Person[] newArray(int size) {

            // Create a new array of Person objects
            return new Person[size];
        }
    };

    /**
     * Getter get name
     * @return name
     */
    public String getName() {

        // Return the name
        return name;
    }

    /**
     * getter for bio
     * @return bio
     */
    public String getBio() {

        // Return the bio
        return bio;
    }

    /**
     * getter for relevant info
     * @return relevantInfo
     */
    public String getRelevantInfo() {

        // Return the relevantInfo
        return relevantInfo;
    }

    /**
     * getter for photo
     * @return photo
     */
    public int getPhotoResId() {

        // Return the photo
        return photoResId;
    }

    /**
     * Parcelable Methods
     * @return
     */
    @Override
    public int describeContents() {

        // Return 0 for compatibility with Parcelable
        return 0;
    }

    /**
     * Write to Parcel
     * @param dest
     * @param flags
     */
    @Override
    public void writeToParcel(Parcel dest, int flags) {

        // Write the variables to the Parcel to be read later
        dest.writeString(name);
        dest.writeString(bio);
        dest.writeString(relevantInfo);
        dest.writeInt(photoResId);
    }

    /**
     * Get People list
     * @return people
     */
    public static List<Person> getPeople() {

        // Create a list of people
        List<Person> people = new ArrayList<>();

        // Add the people to the list
        people.add(new Person(
                "Savor & Co.",
                "Savor & Co. is a visionary restaurateur known for creating exceptional dining experiences that blend innovative cuisine, hospitality, and sustainability. ",
                "Philosophy: Focus on storytelling through cuisine, guest satisfaction, and eco-friendly practices.\n" +
                        "Achievements: Award-winning concepts, media features, and community-driven initiatives.\n" +
                        "Goals: Expand culinary ventures and promote sustainability in the restaurant industry",
                R.drawable.person));
        people.add(new Person(
                "Isla Anne",
                "Isla Anne is an innovative chef celebrated for their mastery of farm-to-table cooking.",
                "Culinary Style: Emphasis on fresh, seasonal ingredients and innovative flavor pairings.\n" +
                        "Achievements: Recipient of Michelin star.\n" +
                        "Philosophy: Crafting unforgettable dining experiences through a passion for food, sustainability, and storytelling.",
                R.drawable.person));
        people.add(new Person(
                "Gina Oro",
                "Gina Oro is a dynamic and results-driven hospitality manager with a proven track record of leading successful teams and delivering exceptional guest experiences. ",
                "Management Style: Collaborative leadership with a focus on team empowerment and operational excellence.\n" +
                        "Philosophy: Building strong teams and fostering a culture of excellence and inclusivity to achieve business success.",
                R.drawable.person));
        people.add(new Person(
                "Rick Lee",
                "Rick Lee is a creative mixologist renowned for crafting unforgettable cocktails that balance innovation, tradition, and flavor.",
                "Mixology Style: Specializes in molecular mixology.\n" +
                        "Philosophy: Creating drinks that tell a story and foster connections, using fresh, high-quality ingredients and innovative techniques.",
                R.drawable.person));
        people.add(new Person(
                "Gloria Boone",
                "Gloria Boone is a warm and detail-oriented receptionist dedicated to creating exceptional first impressions and seamless guest experiences.",
                "Specialty: Skilled in multitasking, problem-solving, and maintaining a welcoming environment.\n" +
                        "Philosophy: Ensuring every guest feels valued, heard, and at home from the moment they walk in.\n",
                R.drawable.person));
        people.add(new Person(
                "Ralph Toone",
                "Ralph Toone s a dedicated and versatile team member with a passion for excellence in customer service which has won him employee of the month.",
                "Strengths: Skilled in communication, multitasking, and problem-solving.\n" +
                        "Achievements: Employee of the month\n" +
                        "Philosophy: Committed to teamwork, growth, and ensuring every guest interaction is positive.",
                R.drawable.person));
        return people;
    }
}