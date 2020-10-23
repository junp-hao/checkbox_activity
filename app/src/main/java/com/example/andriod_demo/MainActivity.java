package com.example.andriod_demo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ImageView;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    Button mTrueBtn;
    Button mFalseBtn;
    Button mNextBtn;
    Button mLastBtn;
    TextView mQuestionView;

    Question[] mQuestions = new Question[] {
            new Question(R.string.question1,true),
            new Question(R.string.question2,true),
            new Question(R.string.question3,false),
    };
    int mIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"onCreate");


        mTrueBtn = findViewById(R.id.true_button);
        mTrueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(true);
//              Toast.makeText(MainActivity.this, getString(R.string.yesQuestion), Toast.LENGTH_SHORT).show();
            }
        });

        mFalseBtn = findViewById(R.id.false_button);
        mFalseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(false);
//              Toast.makeText(context:MainActivity.this,R.string.NoQuestion,Toast.LENGTH_SHORT)
//              Toast.makeText(MainActivity.this, getString(R.string.NoQuestion), Toast.LENGTH_SHORT).show();
            }
        });

        mQuestionView = findViewById(R.id.questionView);

        mNextBtn = findViewById(R.id.next_button);
        mNextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mIndex = (mIndex+1)%mQuestions.length;
                int id=mQuestions[mIndex].getResId();
                mQuestionView.setText(id);
            }
        });

        mLastBtn = findViewById(R.id.last_button);
        mLastBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mIndex = (mIndex+2)%mQuestions.length;
                int id=mQuestions[mIndex].getResId();
                mQuestionView.setText(id);
            }
        });

    }

    private void checkAnswer(boolean b) {
        boolean bAns = mQuestions[mIndex].isAnswerTrue();
        if(bAns == b) {
            Toast.makeText(MainActivity.this, getString(R.string.yesQuestion), Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(MainActivity.this, getString(R.string.NoQuestion), Toast.LENGTH_SHORT).show();

        }

    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"onRestart");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(TAG,"onSaveInstanceState, mIndex"+mIndex);

    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(TAG,"onRestoreInstanceState");
    }





    private ImageView mImageView;

    private File mPhotoFile=null;




}
