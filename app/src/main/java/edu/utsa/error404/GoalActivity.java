package edu.utsa.error404;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.Toast;

import androidx.activity.ComponentActivity;

public class GoalActivity extends ComponentActivity {
    private Button button;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.goals);
        CheckBox checkBox = findViewById(R.id.check);
        CheckBox checkBox2 = findViewById(R.id.check2);
        CheckBox checkBox3 = findViewById(R.id.check3);
        CheckBox checkBox4 = findViewById(R.id.check4);
        CheckBox checkBox5 = findViewById(R.id.check5);
        CheckBox checkBox6 = findViewById(R.id.check6);
        CheckBox checkBox7 = findViewById(R.id.check7);
        setupButtons();
        //checkBox.setChecked(true);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b)
                    //checkBox.setEnabled(false);
                    Toast.makeText(getApplicationContext(), "Checked", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getApplicationContext(), "Not Checked", Toast.LENGTH_SHORT).show();
            }
        });
        //checkBox.setEnabled(false);
    }
    private void setupButtons() {
        button = (Button) findViewById(R.id.done);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Intent intent = new Intent(GoalActivity.this, MainActivity.class);
                //startActivity(intent);
                finish();
            }
        });
    }
}
