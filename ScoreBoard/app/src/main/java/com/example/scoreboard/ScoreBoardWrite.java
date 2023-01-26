package com.example.scoreboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ScoreBoardWrite extends AppCompatActivity {

    EditText dateW;
    EditText uAIdW;
    EditText uBIdW;
    EditText uAScoreW;
    EditText uBScoreW;

    TextView gameSpinnerResult;
    Spinner gameSpinner;
    ArrayAdapter<String> spinnerAdapter;
    //GameAdapter spinnerAdapter;

    String[] gameItemArrayList = {"Baseball", "Soccer", "Basketball"};

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

        //add score
        dateW = (EditText) findViewById(R.id.date_w);
        uAIdW = (EditText) findViewById(R.id.uA_id_w);
        uBIdW = (EditText) findViewById(R.id.uB_id_w);
        uAScoreW = (EditText) findViewById(R.id.uA_score_w);
        uBScoreW = (EditText) findViewById(R.id.uB_score_w);

        Button addButton = (Button) findViewById(R.id.scoreAddButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent addIntent = new Intent();

                addIntent.putExtra("score_date", dateW.getText().toString());
                addIntent.putExtra("score_uA_id", uAIdW.getText().toString());
                addIntent.putExtra("score_uB_id", uBIdW.getText().toString());
                addIntent.putExtra("score_uA", Integer.parseInt(uAScoreW.getText().toString().trim()));
                addIntent.putExtra("score_uB", Integer.parseInt(uBScoreW.getText().toString().trim()));

                setResult(RESULT_OK, addIntent);
                finish();
            }
        });




    }
}