package edu.uph.duadua.aplikasipertama;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class quizdanil2 extends AppCompatActivity {
    EditText editText;

    RadioGroup radioGroup;

    CheckBox checkBox, checkBox2, checkBox3, checkBox4;

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizdanil2);
        editText = findViewById(R.id.editTextText);
        checkBox = findViewById(R.id.checkBox);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        checkBox4 = findViewById(R.id.checkBox4);
        radioGroup = findViewById(R.id.radioGroup); // Removed unnecessary casting

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText = editText.getText().toString();
                String radioButton = "";
                int selectedId = radioGroup.getCheckedRadioButtonId();
                if (selectedId != -1) {
                    RadioButton selectedRadio = findViewById(selectedId);
                    radioButton = selectedRadio.getText().toString();
                }
                StringBuilder checkBoxText = new StringBuilder();
                if (checkBox.isChecked()){
                    checkBoxText.append(checkBox.getText());
                    checkBoxText.append("\n - ");
                }
                if (checkBox2.isChecked()){
                    checkBoxText.append(checkBox2.getText());
                    checkBoxText.append("\n - ");
                }
                if (checkBox3.isChecked()){
                    checkBoxText.append(checkBox3.getText());
                    checkBoxText.append("\n - ");
                }
                if (checkBox4.isChecked()){
                    checkBoxText.append(checkBox4.getText());
                    checkBoxText.append("\n - ");
                }
                String fullText = "Berhasil Disimpan\n" + "Nama Kegiatan: "+ inputText + "\nTempat Kegiatan: " + radioButton + "\nJenis Kegiatan:\n -" + checkBoxText.toString() ;
                Toast.makeText(quizdanil2.this, fullText, Toast.LENGTH_SHORT).show();
            }

        });
    }
}
