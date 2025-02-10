*** Replace `YOUR_API_KEY` with your actual API key. Add the API key from your GCP Conssole in `AndroidManifest.xml` file. ***

## Build and Run:
    *   Connect an Android device or start an emulator.
    *   Click the "Run" button in Android Studio to build and run the app.

## Project Structure

*   **`app/src/main/java/com/example/acerestaurant`:** Contains the main Java source code for the app.
    *   `MainActivity.java`: The main activity (home screen).
    *   `DirectionsActivity.java`: The activity for displaying the map and directions.
    *   `AboutUsActivity.java`: The activity for displaying information about the restaurant.
    *   `PersonAdapter.java`: The adapter for the `RecyclerView` that displays the list of people.
    * `data/Person.java`: The data class for the people.
*   **`app/src/main/res`:** Contains the resource files.
    *   `layout/`: XML layout files for the activities and list items.
    *   `drawable/`: Image resources.
    *   `values/`: String resources, styles, etc.
*   **`app/src/main/AndroidManifest.xml`:** The application manifest file.
