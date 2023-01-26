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

public class ScoreBoard extends AppCompatActivity {
    RecyclerView recyclerView;
    ScoreAdapter scoreAdapter;
    Button addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_board);

        //add score button
        addButton = (Button) findViewById(R.id.addScore);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent addIntent = new Intent(getApplicationContext(), ScoreBoardWrite.class);
                startActivityResult.launch(addIntent);
            }
        });

        recyclerView = (RecyclerView) findViewById(R.id.recyclerViewScore);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        scoreAdapter = new ScoreAdapter(getApplicationContext());

        //데이터 설정
        scoreAdapter.addItem(new ScoreItem("1/26", "김수연", 10, "장지인", 5));
        recyclerView.setAdapter(scoreAdapter);

    }

    //Score 값 받기
    ActivityResultLauncher<Intent> startActivityResult = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    if (result.getResultCode() == Activity.RESULT_OK) {
                        //다른 액티비티를 다녀와서 실행할 작업 작성
                        if (result != null) {
                            Intent intent = result.getData();

                            assert intent != null;
                            String dateW = intent.getStringExtra("score_date");
                            String uAIdW = intent.getStringExtra("score_uA_id");
                            String uBIdW = intent.getStringExtra("score_uB_id");
                            int uAScoreW = intent.getIntExtra("score_uA", 0);
                            int uBScoreW = intent.getIntExtra("score_uB", 0);

                            // Recyclerview에 추가
                            scoreAdapter.addItem(new ScoreItem(dateW, uAIdW, uAScoreW, uBIdW, uBScoreW));
                            recyclerView.setAdapter(scoreAdapter);
                            scoreAdapter.notifyDataSetChanged();
                        }
                    }
                }
    });
}