package com.group8journal.app;


import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class JournalActivity extends AppCompatActivity {

    private TextView txtCoverPageTitle;
    private TextView txtWelcomeTitle;
    private EditText editTitle;
    private EditText editContent;
    private EditText editDateTime;
    private TextView txtPageNumber;
    private Button btnBackward;
    private Button btnForward;
    private Button btnSave;
    private Button btnSaveAs;
    private Button btnSaveAndBack;
    private Button btnSaveAndExit;
    private Button btnToggleDarkMode;

    private List<JournalEntry> journalEntries;
    private int currentPosition = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_journal);

        txtCoverPageTitle = findViewById(R.id.txtCoverPageTitle);
        txtWelcomeTitle = findViewById(R.id.txtWelcomeTitle);
        editTitle = findViewById(R.id.editTitle);
        editContent = findViewById(R.id.editContent);
        editDateTime = findViewById(R.id.editDateTime);
        txtPageNumber = findViewById(R.id.txtPageNumber);
        btnBackward = findViewById(R.id.btnBackward);
        btnForward = findViewById(R.id.btnForward);
        btnSave = findViewById(R.id.btnSave);
        btnSaveAs = findViewById(R.id.btnSaveAs);
        btnSaveAndBack = findViewById(R.id.btnSaveAndBack);
        btnSaveAndExit = findViewById(R.id.btnSaveAndExit);
        btnToggleDarkMode = findViewById(R.id.btnToggleDarkMode);

        txtCoverPageTitle.setVisibility(View.GONE);
        txtWelcomeTitle.setVisibility(View.GONE);
        btnBackward.setVisibility(View.GONE);
        btnForward.setVisibility(View.GONE);

        journalEntries = new ArrayList<>();
        journalEntries.add(new JournalEntry("Welcome Page", "Welcome to our journal!", "N/A"));

        setCurrentEntry();

        btnBackward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPreviousEntry();
            }
        });

        btnForward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showNextEntry();
            }
        });

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveCurrentEntry();
            }
        });

        btnSaveAs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveAsNewEntry();
            }
        });

        btnSaveAndBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveCurrentEntry();
                finish();
            }
        });

        btnSaveAndExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveCurrentEntry();
                finishAffinity();
            }
        });

        btnToggleDarkMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleDarkMode();
            }
        });
    }

    private void setCurrentEntry() {
        JournalEntry entry = journalEntries.get(currentPosition);
        editTitle.setText(entry.getTitle());
        editContent.setText(entry.getContent());
        editDateTime.setText(entry.getDateTime());
        txtPageNumber.setText(getString(R.string.page_number, currentPosition + 1));
    }

    private void showPreviousEntry() {
        if (currentPosition > 0) {
            currentPosition--;
            setCurrentEntry();
        } else {
            Toast.makeText(this, "This is the first entry.", Toast.LENGTH_SHORT).show();
        }
    }

    private void showNextEntry() {
        if (currentPosition < journalEntries.size() - 1) {
            currentPosition++;
            setCurrentEntry();
        } else {
            Toast.makeText(this, "This is the last entry.", Toast.LENGTH_SHORT).show();
        }
    }

    private void saveCurrentEntry() {
        String title = editTitle.getText().toString().trim();
        String content = editContent.getText().toString().trim();
        String dateTime = editDateTime.getText().toString().trim();

        if (title.isEmpty()) {
            Toast.makeText(this, "Please enter a title.", Toast.LENGTH_SHORT).show();
            return;
        }

        JournalEntry entry = journalEntries.get(currentPosition);
        entry.setTitle(title);
        entry.setContent(content);
        entry.setDateTime(dateTime);

        Toast.makeText(this, "Entry saved successfully.", Toast.LENGTH_SHORT).show();
    }

    private void saveAsNewEntry() {
        String title = editTitle.getText().toString().trim();
        String content = editContent.getText().toString().trim();
        String dateTime = editDateTime.getText().toString().trim();

        if (title.isEmpty()) {
            Toast.makeText(this, "Please enter a title.", Toast.LENGTH_SHORT).show();
            return;
        }

        JournalEntry newEntry = new JournalEntry(title, content, dateTime);
        journalEntries.add(newEntry);
        currentPosition = journalEntries.size() - 1;

        Toast.makeText(this, "New entry created and saved successfully.", Toast.LENGTH_SHORT).show();
    }

    private void toggleDarkMode() {
        // TODO: Implement dark mode toggling logic
        Toast.makeText(this, "Dark mode toggled.", Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onBackPressed() {
        saveCurrentEntry();
        super.onBackPressed();
    }
}


