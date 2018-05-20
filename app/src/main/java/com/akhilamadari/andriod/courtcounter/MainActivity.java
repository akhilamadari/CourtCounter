package com.akhilamadari.andriod.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    int totalTeam_a = 0;
    int totalTeam_b = 0;

    public void plusThree(View view) {

        totalTeam_a = totalTeam_a +3;
        displayForTeamA(totalTeam_a);

    }

    public void plusTwo(View view) {

        totalTeam_a = totalTeam_a +2;
        displayForTeamA(totalTeam_a);

    }

    public void freeThrow(View view) {

        totalTeam_a = totalTeam_a +1;
        displayForTeamA(totalTeam_a);

    }

    public void plusThree_b(View view) {

        totalTeam_b = totalTeam_b +3;
        displayForTeamB(totalTeam_b);
    }

    public void plusTwo_b(View view) {

        totalTeam_b = totalTeam_b +2;
        displayForTeamB(totalTeam_b);

    }

    public void freeThrow_b(View view) {

        totalTeam_b = totalTeam_b +1;
        displayForTeamB(totalTeam_b);

    }

    public void resetScores(View view) {

        displayForTeamA(0);

        displayForTeamB(0);

    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


}
