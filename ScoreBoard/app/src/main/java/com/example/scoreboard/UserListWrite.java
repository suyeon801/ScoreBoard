package com.example.scoreboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class UserListWrite extends AppCompatActivity {

    EditText u_id_write;
    EditText u_name_write;
    EditText u_birth_write;
    EditText u_gender_write;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_list_write);

        //editText findID
        //u_id_write = (EditText) findViewById(R.id.u_id_write);
        u_name_write = (EditText) findViewById(R.id.u_name_write);
        u_birth_write = (EditText) findViewById(R.id.u_birth_write);
        u_gender_write = (EditText) findViewById(R.id.u_gender_write);

        //add user
        Button addButton = (Button) findViewById(R.id.addbutton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent addIntent = new Intent();

                addIntent.putExtra("user_name", u_name_write.getText().toString());
                addIntent.putExtra("user_birth", u_birth_write.getText().toString());
                addIntent.putExtra("user_gender", u_gender_write.getText().toString());

                setResult(RESULT_OK, addIntent);
                //startActivity(addIntent);
                finish();
            }
        });
    }
}