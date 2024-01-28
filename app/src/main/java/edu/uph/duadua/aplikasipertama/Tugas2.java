package edu.uph.duadua.aplikasipertama;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Tugas2 extends AppCompatActivity {
    TextView textView17;

    TextView textView19;
    TextView textView21;
    TextView textView23;

    Button button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tugas2);
        textView17 = (TextView) findViewById(R.id.textView17);
        textView17.setText("Daniel");
        textView19 = (TextView) findViewById(R.id.textView19);
        textView19.setText("03081220025");
        textView21 = (TextView) findViewById(R.id.textView21);
        textView21.setText("Sistem Informasi");
        textView23 = (TextView) findViewById(R.id.textView23);
        textView23.setText("Badminton");
        button6 = (Button) findViewById(R.id.button6);
        button6.setBackgroundColor(Color.BLUE);
    }
}