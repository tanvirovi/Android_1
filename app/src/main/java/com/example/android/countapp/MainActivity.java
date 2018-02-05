package com.example.android.countapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int countA = 0, countB = 0;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addThree(View view) {
        display(1, countA+=3);
    }
    public void addTwo(View view) {
        display(1, countA+=2);
    }
    public void addOne(View view) {
        display(1, ++countA);
    }
    public void addThreeB(View view) {
        display(2, countB+=3);
    }
    public void addTwoB(View view) {
        display(2, countB+=2);
    }
    public void addOneB(View view) {
        display(2, ++countB);
    }
    public void resetText(View view) {
        display(countA = 0, countB = 0);
    }

    private void display(int number, int show) {

        TextView quantityTextView = (TextView) findViewById(R.id.quantityTextView);
        TextView quantityTextViewB = (TextView) findViewById(R.id.quantityTextViewB);
        if(number == 1){
            quantityTextView.setText("" + show);
        }else if(number == 2){
            quantityTextViewB.setText("" + show);
        }else {
            quantityTextViewB.setText("" + number);
            quantityTextView.setText("" + show);
        }

    }

}
