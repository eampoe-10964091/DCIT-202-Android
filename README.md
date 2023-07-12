# DCIT-202-Android
GROUP 8'S MOBILE APP DEVELOPMENT PROJECT WORK   

ID'S AND USERNAMES ARE BELOW:

1. 10964091(Group Leader) -https://github.com/eampoe-10964091
3. 10972528   -   https://github.com/samkwesiprince
4. 10945190  -   https://github.com/Manuel10945190
5. 10956951   -   https://github.com/10956951
6. 10978912   -   https://github.com/asareemmanuelboamah
7. 10961746   -   https://github.com/10961746
8. 10972444   -   (https://github.com/10972444)
9. 10964194   -   https://github.com/Gobarshev
10. 10965537   -   https://github.com/gmwdjab
11. 10976498   -   https://github.com/Dele20



The contributionss of every group members can be found at the bottom.

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
- `JournalActivity.java`: The activity for the main journal page. This handles the creation, editing, and saving of journal entries, as well as navigation between entries and toggling dark mode.
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


## Contributions

1. 10964091 (Group Leader)  -   https://github.com/eampoe-10964091
  -Responsibility and contribution: My responsibilty was to ensure each group member partakes in group meetings and how we will make this app. We had a slow start at first but with persistent efforts we were able to achieve our goals. Contribution: I cintributed in we making a journal app that will help users to express or explain the activities they had during the day. Indeed, my group members heeded to this and finally here we are with our working project. I also wrote the codes with the help of my group members and added a feature that allows users to change the font size and type.

2. 10978912   -   https://github.com/asareemmanuelboamah
   -Responsibility and contribution: He contributed by bringing the idea of including the toggle mode feature. This feature helps to switch or toggle between dark mode and light mode.
   
3. 10964194   -   https://github.com/Gobarshev
   - Responsibility and contribution: He contributed by suggesting the navigation feature whoich has a very nice functionality.
  
     
4. 10976498   -   https://github.com/Dele20
   - Responsibility and contribution: He suggested the splaash screen feature that creates a user-friendly welcome message interface. It serves as awelcome message for the user.

5.  10965537   -   https://github.com/gmwdjab
   - Responsibility and contribution: He suggested the zoom options. It helps the user to zoom in and out and to enlarge texts to view as well.

6. 10972444   -  https://github.com/10972444
   - Responsibility and contribution: He suggested the change date and time button. This allows the user to set the date that the activity occured.

7.  10972528   -   https://github.com/samkwesiprince
   - Responsibility and contribution: He suggested the save, save as and save and exit button which helps the user to save his or her journal activity after entries are made.


8.  10945190  -   https://github.com/Manuel10945190
    - Responsibility and contribution: He suggested we include a feature that helps to give a title to the project.
  
9. 10956951   -   https://github.com/10956951
    - Responsibility and contribution: The sugesstion was that we include a space that we can type contents i.e the things that the user wants to write about.
  
10. 10961746   -   https://github.com/10961746
    - Responsibility and contribution: The suggestion was that we include a functionality that helps to retrieve unsaved journal activities.
    

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvement, please open an issue or submit a pull request.

