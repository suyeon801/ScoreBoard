package com.example.scoreboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class UserList extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_list);

        Button addButton = (Button) findViewById(R.id.add);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent addIntent = new Intent(getApplicationContext(), UserListWrite.class);
                startActivity(addIntent);
            }
        });

        recyclerView = (RecyclerView) findViewById(R.id.recyclerViewUser);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);

        UserAdapter userAdapter = new UserAdapter(getApplicationContext());

        //데이터 설정
        userAdapter.addItem(new UserItem("#1", "김수연", "2000-11-08", "Female"));
        userAdapter.addItem(new UserItem("#2", "000", "2000-11-08", "Male"));
        userAdapter.addItem(new UserItem("#3", "111", "2000-11-08", "Male"));
        userAdapter.addItem(new UserItem("#4", "222", "2000-11-08", "Female"));

        recyclerView.setAdapter(userAdapter);
    }
}