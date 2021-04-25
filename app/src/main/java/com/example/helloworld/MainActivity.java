package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewDisplay;
    private Button buttonAdd;
    int num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        textViewDisplay = findViewById(R.id.numIncrement);
        buttonAdd = findViewById(R.id.btnAdd);

        buttonAdd.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num ++;
                textViewDisplay.setText(String.valueOf(num));
            }
        } );
    }
}