package edu.uph.duadua.aplikasipertama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class QuizDanil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_danil);
    }

    // Metode untuk membuka Activity Tugas2
    public void openProfileActivity(View view) {
        Intent intent = new Intent(this, Tugas2.class);
        startActivity(intent);
    }
}
