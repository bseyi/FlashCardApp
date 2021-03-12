package com.example.seyisflashcardapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class AddCardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_card);

        ImageView CancelButton = findViewById(R.id.cancel_button);
        ImageView SaveButton =findViewById(R.id.save_icon);
        EditText editQuestion = findViewById(R.id.enterTextField);
        EditText editAnswer = findViewById(R.id.answerTextField);





        CancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {  finish();}


        });

        //ON CLICK LISTENER
        SaveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String question = editQuestion.getText().toString();
                String answer = editAnswer.getText().toString();
            Intent data =new Intent();
            data.putExtra("string1",question);
            data.putExtra("string2",answer);
            setResult(RESULT_OK,data);
            finish();

            }
        });
    }

              }

