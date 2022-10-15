package com.link.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playButtonClicked(View view) {
        Intent intent = new Intent(this, com.link.myapplication.PlayGame.class);
        startActivity(intent);
    }

    public void onButtonClicked(View view){
        TextView textView3 = (TextView) findViewById(R.id.textView3);
        Intent intent = new Intent(this, com.link.myapplication.SecondActivity.class);
        startActivity(intent);
    }
}