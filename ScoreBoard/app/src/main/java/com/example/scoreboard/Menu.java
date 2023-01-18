package com.example.scoreboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Menu extends AppCompatActivity {

    RecyclerView recyclerView;
    GameAdapter adapter;

    EditText newGame;
    Button addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button userList = (Button) findViewById(R.id.user_list);
        userList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent userIntent = new Intent(getApplicationContext(), UserList.class);
                startActivity(userIntent);
            }
        });

        Button rank = (Button) findViewById(R.id.rank);
        rank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rankIntent = new Intent(getApplicationContext(), Rank.class);
                startActivity(rankIntent);
            }
        });

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView_GameList);
        //recyclerView LayoutManager
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new GameAdapter(getApplicationContext());

        adapter.addItem(new GameItem("Baseball"));
        adapter.addItem(new GameItem("Soccer"));
        adapter.addItem(new GameItem("Basketball"));

        recyclerView.setAdapter(adapter);

        //newGame 추가하기
        newGame = (EditText) findViewById(R.id.newgame_add);
        addButton = (Button) findViewById(R.id.newgame_addButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = newGame.getText().toString();

                adapter.addItem(new GameItem(name));
                adapter.notifyDataSetChanged();
            }
        });
    }
}