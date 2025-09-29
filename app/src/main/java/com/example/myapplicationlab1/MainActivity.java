package com.example.myapplicationlab1; // Assuming this is your package name

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView tvDemoLabel;
    Button changeColorButton; // Corrected variable name to follow Java conventions

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this); // Ensure this is appropriate for your project setup
        setContentView(R.layout.activity_main); // Ensure activity_main.xml exists

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Initialize views
        tvDemoLabel = findViewById(R.id.tvDemoLabel); // Removed 'this.' as it's not strictly necessary here
        changeColorButton = findViewById(R.id.btnChangeColourClick); // Ensure this ID exists in your layout

        // Set OnClickListener for the button
        if (changeColorButton != null) { // Good practice to check for null
            changeColorButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (tvDemoLabel != null) { // Good practice to check for null
                        tvDemoLabel.setBackgroundColor(Color.BLUE); // Example: Change background to blue
                        // To change text color instead:
                        // tvDemoLabel.setTextColor(Color.BLUE);
                    }
                }
            });
        }
    }

    // This method is likely intended to be called by another view via android:onClick
    // or programmatically.
    public void changeTextClick(View view) {
        if (tvDemoLabel != null) { // Good practice to check for null
            tvDemoLabel.setText("Hello World! Changed");
        }
    }
    //main changes
    //main changes
    //main changes
    //main changes
}
