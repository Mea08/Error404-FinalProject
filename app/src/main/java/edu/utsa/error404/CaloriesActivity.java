package edu.utsa.error404;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;

import androidx.activity.ComponentActivity;

public class CaloriesActivity extends ComponentActivity {
    private Button back;
    private EditText workoutCaloriesInput;
    private EditText mealCaloriesInput;
    private TextView totalCaloriesText;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.caloriecounter);

        workoutCaloriesInput = findViewById(R.id.workoutCaloriesInput);
        mealCaloriesInput = findViewById(R.id.mealCaloriesInput);
        Button calculateButton = findViewById(R.id.calculateButton);
        totalCaloriesText = findViewById(R.id.totalCaloriesText);

        calculateButton.setOnClickListener(v -> calculateTotalCalories());
        setupButtons();
    }

    private void calculateTotalCalories() {
        int workoutCalories = Integer.parseInt(workoutCaloriesInput.getText().toString());
        int mealCalories = Integer.parseInt(mealCaloriesInput.getText().toString());
        int totalCalories = mealCalories - workoutCalories;

        totalCaloriesText.setText("Total Calories: " + totalCalories);
    }
    private void setupButtons() {
        back = (Button) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Intent intent = new Intent(CaloriesActivity.this, MainActivity.class);
                //startActivity(intent);
                finish();
            }
        });
    }
}

