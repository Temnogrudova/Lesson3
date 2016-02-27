package com.temnogrudova.lesson3;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by 123 on 26.02.2016.
 */
public class ActivityTwo extends AppCompatActivity {
    final String TAG = "States";
    TextView tv2;
    EditText ed2;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        tv2 = (TextView)findViewById(R.id.tv2);
        ed2 = (EditText)findViewById(R.id.et2);

        // получаем Intent, который вызывал это Activity
        final Intent intent = getIntent();
        // читаем из него action
        String action = intent.getAction();
        String text;
        if (action.equals("ru.startandroid.intent.action.showtime")) {
            text = intent.getStringExtra("text");
            tv2.setText("Text from MainActivity: " + text);
        }

        Log.d(TAG, "ActivityTwo: onCreate()");

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = getIntent();
                in.putExtra("name", ed2.getText().toString() );
                setResult(RESULT_OK, in);
                finish();
            }
        });

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "ActivityTwo: onRestart()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "ActivityTwo: onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "ActivityTwo: onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "ActivityTwo: onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "ActivityTwo: onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "ActivityTwo: onDestroy()");
    }
}
