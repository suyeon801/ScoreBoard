package com.example.scoreboard;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ScoreBoardWrite extends AppCompatActivity {
    TextView gameSpinnerResult;
    Spinner gameSpinner;
    ArrayAdapter<String> spinnerAdapter;
    //GameAdapter spinnerAdapter;

    ArrayList<GameItem> gameItemArrayList = new ArrayList<GameItem>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_board_write);

        gameSpinnerResult.findViewById(R.id.gameSpinnerResult);
        gameSpinner.findViewById(R.id.gameSpinner);

        spinnerAdapter =new ArrayAdapter(this, android.R.layout.simple_spinner_item, gameItemArrayList);
        gameSpinner.setAdapter(spinnerAdapter);
        gameSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                gameSpinnerResult.setText((CharSequence) gameItemArrayList.get(position));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



    }
}