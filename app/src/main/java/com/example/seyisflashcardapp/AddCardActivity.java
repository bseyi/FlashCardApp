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


            ImageView CancleButton = findViewById(R.id.my_cancle_Btn);
            ImageView SaveButton =findViewById(R.id.my_save_icon);
            EditText editQuestion = findViewById(R.id.editQuestionField);
            EditText editAnswer = findViewById(R.id.editAnswerField);



            CancleButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });

//on click listener for the save button
            SaveButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String question = editQuestion.getText().toString();
                    String answer = editAnswer.getText().toString();

                    Intent data =new Intent();     // create a new Intent, this is where we will put our data
                    data.putExtra("string1", question);  // puts one string into the Intent, with the key as 'string1'
                    data.putExtra("string2", answer);   // puts another string into the Intent, with the key as 'string2
                    setResult(RESULT_OK,data);  // set result code and bundle data for response
                    finish();    // closes this activity and pass data to the original activity that launched this activity
                    overridePendingTransition(R.anim.right_in, R.anim.left_out);
                }
            });
        }
    }