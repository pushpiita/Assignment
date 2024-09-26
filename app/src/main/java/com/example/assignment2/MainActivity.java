package com.example.assignment2;





import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button signInButton, signUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find buttons by ID
        signInButton = findViewById(R.id.signInButton);
        signUpButton = findViewById(R.id.signUpButton);

        // Set click listeners for Sign In and Sign Up buttons
        View.OnClickListener buttonClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Show welcome toast
                Toast.makeText(MainActivity.this, "Welcome", Toast.LENGTH_SHORT).show();

                // Navigate to SignUpActivity on Sign Up button click
                if (v.getId() == R.id.signUpButton) {
                    Intent intent = new Intent(MainActivity.this, SignUpActivity.class);
                    startActivity(intent);
                }
            }
        };

        signInButton.setOnClickListener(buttonClickListener);
        signUpButton.setOnClickListener(buttonClickListener);
    }
}
