package com.example.scoreboard;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class UserList extends AppCompatActivity {
    RecyclerView recyclerView;
    Button addButton;
    UserAdapter userAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_list);

        //add user button
        addButton = (Button) findViewById(R.id.add);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent addIntent = new Intent(getApplicationContext(), UserListWrite.class);
                startActivityResult.launch(addIntent);
            }
        });

        recyclerView = (RecyclerView) findViewById(R.id.recyclerViewUser);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);

        userAdapter = new UserAdapter(getApplicationContext());

        //데이터 설정
        userAdapter.addItem(new UserItem("#1", "김수연", "2000-11-08", "Female"));
        userAdapter.addItem(new UserItem("#2", "000", "2000-11-08", "Male"));
        userAdapter.addItem(new UserItem("#3", "111", "2000-11-08", "Male"));
        userAdapter.addItem(new UserItem("#4", "222", "2000-11-08", "Female"));

        recyclerView.setAdapter(userAdapter);
        userAdapter.notifyDataSetChanged();
    }
    ActivityResultLauncher<Intent> startActivityResult = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    if (result.getResultCode() == Activity.RESULT_OK) {
                        //다른 액티비티를 다녀와서 실행할 작업 작성
                        userAdapter.notifyDataSetChanged();
                    }
                }
            });
}