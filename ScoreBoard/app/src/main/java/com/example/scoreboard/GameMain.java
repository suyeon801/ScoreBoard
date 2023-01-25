package com.example.scoreboard;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GameMain extends AppCompatActivity {

    TextView detail_game_name;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_main);

        detail_game_name = findViewById(R.id.detail_game_name);

        //activity_game_main 에서 받아온 데이터
        Intent gameIntent = getIntent();

        name = gameIntent.getExtras().getString("name");
        detail_game_name.setText(name);

    }
}