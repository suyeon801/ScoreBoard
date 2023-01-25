package com.example.scoreboard;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ScoreBoard extends AppCompatActivity {
    RecyclerView recyclerView;
    ScoreAdapter scoreAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_board);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerViewScore);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        scoreAdapter = new ScoreAdapter(getApplicationContext());

        //데이터 설정
        scoreAdapter.addItem(new ScoreItem("1/26", "김수연", 10, "장지인", 5));
        recyclerView.setAdapter(scoreAdapter);
    }
}