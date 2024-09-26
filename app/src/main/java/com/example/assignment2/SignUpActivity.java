package com.example.assignment2;



import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private SeekBar seekBar;
    private CheckBox checkBoxLoveMonica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        // Find views by ID
        radioGroup = findViewById(R.id.radioGroup);
        seekBar = findViewById(R.id.seekBar);
        checkBoxLoveMonica = findViewById(R.id.checkBoxLoveMonica);

        // RadioGroup listener
        radioGroup.setOnCheckedChangeListener((group, checkedId) -> {
            RadioButton radioButton = findViewById(checkedId);
            Toast.makeText(SignUpActivity.this, "Selected: " + radioButton.getText(), Toast.LENGTH_SHORT).show();
        });

        // SeekBar listener
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                // No specific action needed for progress
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(SignUpActivity.this, "SeekBar released", Toast.LENGTH_SHORT).show();
            }
        });

        // CheckBox listener
        checkBoxLoveMonica.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                Toast.makeText(SignUpActivity.this, "I love Monica!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
