package com.sharif.quiz2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
RadioButton radioButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioButton=findViewById(R.id.radiobuttonid);
    }

    public void intentfunction(View view) {
        Intent myintent = new Intent(MainActivity.this,SecondActivity.class);
        startActivity(myintent);

    }
}