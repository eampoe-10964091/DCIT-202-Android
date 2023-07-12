package com.group8journal.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ScaleGestureDetector scaleGestureDetector;
    private float scaleFactor = 1.0f;

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.btnStartJournal);

        // Get the view or layout on which you enabled zooming
        View zoomableView = findViewById(R.id.zoomable_view);

        // Create a ScaleGestureDetector instance
        scaleGestureDetector = new ScaleGestureDetector(this, new ScaleListener());

        // Set an OnTouchListener to capture touch events and perform scaling
        zoomableView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                scaleGestureDetector.onTouchEvent(event);
                return true;
            }
        });


    }

    private class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        @Override
        public boolean onScale(ScaleGestureDetector detector) {
            scaleFactor *= detector.getScaleFactor();
            scaleFactor = Math.max(0.1f, Math.min(scaleFactor, 5.0f));

            // Apply the scaling to the view or layout
            View zoomableView = findViewById(R.id.zoomable_view);
            zoomableView.setScaleX(scaleFactor);
            zoomableView.setScaleY(scaleFactor);

            return true;
        }
    }

    public void NextPage() {
        Intent intent = new Intent(this, JournalActivity.class);
        startActivity(intent);
    }
}