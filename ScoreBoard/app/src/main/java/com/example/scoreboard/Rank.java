package com.example.scoreboard;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Rank extends AppCompatActivity {

    RecyclerView recyclerView;
    TotalAdapter totalAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rank);

        //recyclerView
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView_totalRank);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        totalAdapter = new TotalAdapter(getApplicationContext());

        totalAdapter.addItem(new TotalItem(4, "D player", 10));

        recyclerView.setAdapter(totalAdapter);
    }
}