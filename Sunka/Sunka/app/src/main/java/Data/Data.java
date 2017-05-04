package Data;

import android.os.Environment;
import android.widget.TextView;

import java.io.File;
import java.util.Scanner;

import ininja.sunka.R;

/**
 * Created by Buttsecks on 11/11/2015.
 */
public class Data {

    private String playerName, timer;
    private int highScore, wins, loses, play;

    /**
     * Collection class for player's data
     */
    public Data(String name, int score, int played, int winner, int loser, String time) {
        playerName = name;
        highScore = score;
        timer = time;
        play = played;
        wins = winner;
        loses = loser;
    }

    /**
     * print data toString
     */
    public String toString() {
        return playerName + " "  + highScore + " " + wins + " " + loses + " " + timer;
    }


    public int upDate() {
        int updateWins = wins;
        wins = updateWins + wins;

        int updateLose = loses;
        loses = updateLose + loses;

        int updatePlayed = play;
        play = updatePlayed + play;

        return wins + loses + play;
    }



}

