package edu.uph.duadua.aplikasipertama;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class activity_pertemuan_tiga extends AppCompatActivity {

    TextView textView;
    Button button4;
    Button button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pertemuan_tiga);
        textView = (TextView) findViewById(R.id.textView);
        textView.setText("Selamat Datang");
        button4 = (Button) findViewById(R.id.button4);
        button4.setBackgroundColor(Color.WHITE);
        button5 = (Button) findViewById(R.id.button5);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}