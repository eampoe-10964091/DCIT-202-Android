# DCIT-202-Android
GROUP 8'S MOBILE APP DEVELOPMENT PROJECT WORK   

ID'S AND USERNAMES ARE BELOW:
1. 10964091   -   https://github.com/eampoe-10964091
2. 10978912   -   https://github.com/asareemmanuelboamah
3. 10972528   -   https://github.com/samkwesiprince
4. 10945190  -   https://github.com/Manuel10945190
5. 10956951   -   https://github.com/10956951
6. 10961746   -   https://github.com/10961746
7. 10972444   -   https://github.com/10961746
8. 10964194   -   https://github.com/Gobarshev
9. 10965537   -   https://github.com/gmwdjab
10. 10976498   -   https://github.com/Dele20

# Below is the description of the project

# Journal App

This is a simple journal app developed by Group 8.

## Overview

The Journal App allows users to create and manage journal entries. It provides a user-friendly interface for writing, saving, and navigating through journal entries. Users can also customize the app's settings, such as font size and dark mode.

## Code Structure

The app is structured as follows:

- `MainActivity.java`: This is the main activity of the app. It handles the zooming functionality and navigation between screens.
- `activity_main.xml`: The XML layout file for the main activity. It includes the cover page and welcome screen views.
- `JournalEntry.java`: A model class representing a journal entry. It contains properties for the title, content, and date/time of the entry.
- `JournalActivity.java`: The activity for the main journal page. It handles the creation, editing, and saving of journal entries, as well as navigation between entries and toggling dark mode.
- `activity_journal.xml`: The XML layout file for the journal activity. It includes views for the title, content, date/time, page navigation buttons, and other actions.

## Features

- Zoom functionality for a specific view or layout
- Create, edit, and save journal entries
- Navigate between journal entries
- Dark mode toggle

## Prerequisites

- Android Studio (version 2022.1.0)
- Android SDK (minimum version 21)

## Installation

1. Clone the repository or download the source code.
2. Open the project in Android Studio.
3. Build and run the app on an emulator or physical device.

## Usage

### MainActivity.java

This is the main activity class responsible for initializing the app and handling touch events for zooming.

#### Methods

- `onCreate(Bundle savedInstanceState)`: This method is called when the activity is created. It sets up the zoom functionality and touch event handling.

#### Inner Classes

- `ScaleListener`: This class extends `ScaleGestureDetector.SimpleOnScaleGestureListener` and overrides the `onScale()` method to handle scaling events. It applies the scaling factor to the view or layout.

### activity_main.xml

This XML layout file defines the main activity's UI components. It contains a zoomable view and other UI elements for the initial screen.

### JournalEntry.java

This class represents a journal entry. It encapsulates the title, content, and date/time of an entry.

#### Constructors

- `JournalEntry(String title, String content, String dateTime)`: Creates a new journal entry with the specified title, content, and date/time.

#### Getters and Setters

- `getTitle()`: Returns the title of the journal entry.
- `setTitle(String title)`: Sets the title of the journal entry.
- `getContent()`: Returns the content of the journal entry.
- `setContent(String content)`: Sets the content of the journal entry.
- `getDateTime()`: Returns the date/time of the journal entry.
- `setDateTime(String dateTime)`: Sets the date/time of the journal entry.

### JournalActivity.java

This activity class represents the journal screen. It allows users to create, edit, and save journal entries.

#### Methods

- `onCreate(Bundle savedInstanceState)`: This method is called when the activity is created. It initializes UI components and sets up click listeners.
- `setCurrentEntry()`: Sets the current journal entry on the UI.
- `showPreviousEntry()`: Displays the previous journal entry if available.
- `showNextEntry()`: Displays the next journal entry if available.
- `saveCurrentEntry()`: Saves the changes made to the current journal entry.
- `saveAsNewEntry()`: Creates a new journal entry and saves it.
- `toggleDarkMode()`: Toggles the dark mode in the app.
- `getCurrentDateTime()`: Returns the current date and time as a formatted string.
- `onOptionsItemSelected(MenuItem item)`: Handles options menu item selections.
- `onBackPressed()`: Handles the back button press event.

### activity_journal.xml

This XML layout file defines the journal activity's UI components. It includes input fields for the title, content, and date/time of a journal entry, navigation buttons, and save options.

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvement, please open an issue or submit a pull request.

