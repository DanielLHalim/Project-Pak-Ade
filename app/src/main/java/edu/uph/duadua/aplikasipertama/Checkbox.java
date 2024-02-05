package edu.uph.duadua.aplikasipertama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;

public class Checkbox extends AppCompatActivity {
    CheckBox checkbox_meat ,checkbox_cheese;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);
        checkbox_meat = (CheckBox) findViewById(R.id.checkbox_meat);
        checkbox_cheese = (CheckBox) findViewById(R.id.checkbox_cheese);
        checkbox_cheese.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Log.d("Checkbox", "Cheese is selected");
                }
                else{
                    Log.d("Checkbox","Cheese is not selected");
                }
            }
        });

        RadioButton radio_pirates = findViewById(R.id.radio_pirates);

        RadioButton radio_ninjas = findViewById(R.id.radio_ninjas);

        radio_pirates.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Log.d("RadioButton", "RadioButton is selected");
                }
            }
        });
    }
}