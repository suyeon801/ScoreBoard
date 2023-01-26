package com.example.scoreboard;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ScoreBoardWrite extends AppCompatActivity {
    TextView gameSpinnerResult;
    Spinner gameSpinner;
    ArrayAdapter<String> spinnerAdapter;
    //GameAdapter spinnerAdapter;

    String[] gameItemArrayList = {"Baseball", "Socceer", "Basketball"};

    //ArrayList<GameItem> gameItemArrayList = new ArrayList<GameItem>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_board_write);

        gameSpinnerResult = (TextView) findViewById(R.id.gameSpinnerResult);
        gameSpinner = (Spinner) findViewById(R.id.gameSpinner);

        spinnerAdapter =new ArrayAdapter(this, android.R.layout.simple_spinner_item, gameItemArrayList);
        gameSpinner.setAdapter(spinnerAdapter);
        gameSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                gameSpinnerResult.setText(gameItemArrayList[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



    }
}