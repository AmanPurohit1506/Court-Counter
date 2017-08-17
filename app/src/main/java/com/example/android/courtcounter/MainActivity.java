package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int quantity = 0, quantity1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);}

        /**
         * Displays the given score for Team A.
         */

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void three(View view) {
        quantity = quantity + 3;
        displayForTeamA(quantity);
    }

    public void two(View view) {
        quantity += 2;
        displayForTeamA(quantity);
    }

    public void free(View view) {
        quantity = quantity + 1;
        displayForTeamA(quantity);
    }

    public void three1(View view) {
        quantity1 = quantity1 + 3;
        displayForTeamB(quantity1);
    }

    public void two1(View view) {
        quantity1 += 2;
        displayForTeamB(quantity1);
    }

    public void free1(View view) {
        quantity1 = quantity1 + 1;
        displayForTeamB(quantity1);
    }

    public void knew(View view)

    {
        quantity = 0;
        quantity1 = 0;
        displayForTeamA(quantity);
        displayForTeamB(quantity1);
    }
}
