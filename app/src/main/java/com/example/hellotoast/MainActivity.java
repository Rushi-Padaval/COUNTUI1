package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int count = 0; // Initialize count to 0

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button toastButton = findViewById(R.id.button_toast);
        toastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Hey connections!", Toast.LENGTH_SHORT).show();
            }

        });
        Button countButton = findViewById(R.id.button_count);
        countButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                count++;
                TextView showCountTextView = findViewById(R.id.show_count);
                showCountTextView.setText(String.valueOf(count));
            }
        });
    }
}
