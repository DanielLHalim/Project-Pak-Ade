package edu.uph.duadua.aplikasipertama;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class QuizDanil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_danil);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void openProfileActivityProfil(View view) {
        Intent intent = new Intent(this, quizdanil2.class);
        startActivity(intent);
    }

    public void openProfileActivityTodo(View view) {
        Intent intent = new Intent(this, Tugas2.class);
        startActivity(intent);
    }
}
