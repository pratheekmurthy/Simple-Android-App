package com.example.pratham.a1stapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int count = 0 ;
    Button minusButton;
    Button plusButton;
    TextView CountTextView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        minusButton = (Button) findViewById(R.id.minusButton);
        plusButton = (Button) findViewById(R.id.plusButton);
        CountTextView =(TextView) findViewById(R.id.countTextView);

        minusButton.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                          public void onClick(View View) {
                                               count--;
                                               CountTextView.setText(Integer.toString(count));

                                           }
                                       }
        );

        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {
                count++ ;
                CountTextView.setText(Integer.toString(count));

            }
        });
    }
}
