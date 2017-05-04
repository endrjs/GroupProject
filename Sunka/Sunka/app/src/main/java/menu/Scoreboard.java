package menu;

import android.app.Activity;

import android.content.SharedPreferences;
import android.os.Bundle;

import android.os.Environment;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import Data.Data;

import game_data.Gameboard;
import ininja.sunka.R;

/**
 * Created by Buttsecks on 09/11/2015.
 */
public class Scoreboard extends Activity {

    private TextView player1, player2, timer, scoreView;
    private Button score1, score2;

    private TextView tableContext;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scoreboard);

        //get text view
        TextView scoreView = (TextView)findViewById(R.id.scoreboardData);
        //get shared prefs
        SharedPreferences scorePrefs = getSharedPreferences(Gameboard.GAME_PREFS, 0);
        //get scores
        String[] savedScores = scorePrefs.getString("highScores", "").split("\\|");
        //build string
        StringBuilder scoreBuild = new StringBuilder("");
        for(String score : savedScores){
            scoreBuild.append(score+"\n");
        }
        //display scores
        scoreView.setText(scoreBuild.toString());
    }
 }










