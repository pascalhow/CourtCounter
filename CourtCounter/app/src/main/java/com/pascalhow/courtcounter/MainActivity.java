package com.pascalhow.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the +3 button is pressed
     */
    public void teamAThreePoints(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayScoreTeamA();
    }

    /**
     * This method is called when the +2 button is pressed
     */
    public void teamATwoPoints(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayScoreTeamA();
    }

    /**
     * This method is called when the free score button is pressed
     */
    public void teamAFreeScore(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayScoreTeamA();
    }

    /**
     * This method updates the score
     */
    private void displayScoreTeamA()
    {
        TextView teamAScore = (TextView)findViewById(R.id.teamAScore_textview);
        teamAScore.setText("" + scoreTeamA);
    }

    /**
     * This method is called when the +3 button is pressed
     */
    public void teamBThreePoints(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayScoreTeamB();
    }

    /**
     * This method is called when the +2 button is pressed
     */
    public void teamBTwoPoints(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayScoreTeamB();
    }

    /**
     * This method is called when the free score button is pressed
     */
    public void teamBFreeScore(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayScoreTeamB();
    }

    /**
     * This method updates the score
     */
    private void displayScoreTeamB()
    {
        TextView teamBScore = (TextView)findViewById(R.id.teamBScore_textview);
        teamBScore.setText("" + scoreTeamB);
    }

    /**
     * This method is called when the reset button is clicked
     */
    public void resetScores(View v){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayScoreTeamA();
        displayScoreTeamB();
    }
}
