package player_data;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import ininja.sunka.R;

/**
 * Created by Buttsecks on 09/11/2015.
 */
public class Save extends Activity {

    private int wins = 0, loses = 0, totalTime = 0;

    TextView playerName1, playerName2, timer;
    Button player1Total, player2Total;

    private SharedPreferences gameData;
    public static final String Player_Data = "PlayerFile";


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  setContentView(R.layout.gameboard);

        // Initalise the shared data.

      //  gameData = getSharedPreferences(Player_Data, 0);

      //  playerName1 = (TextView) findViewById(R.id.setPlayer1);
     //   playerName2 = (TextView) findViewById(R.id.setPlayer2);
      //  timer = (TextView) findViewById(R.id.timer_view);

      //  player1Total = (Button) findViewById(R.id.player1store);
     //   player2Total = (Button) findViewById(R.id.player2store);

        if (savedInstanceState != null) {
            //saved instance state data
            wins = savedInstanceState.getInt("Wins");
            int exScore = savedInstanceState.getInt("Scores");
            player2Total.setText("Score: " + exScore);


        } else {
            Bundle extras = getIntent().getExtras();
            if (extras != null) {

                int noWins = extras.getInt("Loses", -1);
                if (noWins >= 0) wins = noWins;

            }
        }

    }

    private int getPlayer1Score() {

        String player1Score = player1Total.getText().toString();
        return Integer.parseInt(player1Score.substring(player1Score.lastIndexOf(" ") + 1));
    }

    private int getPlayer2Score() {

        String player2Score = player2Total.getText().toString();
        return Integer.parseInt(player2Score.substring(player2Score.lastIndexOf(" ") + 1));
    }

    private void setHighScore() {

        int exScore1 = getPlayer1Score();
        int exScore2 = getPlayer2Score();


        if (exScore1 > 0 || exScore2 > 0) {

            //Valid Scores
            SharedPreferences.Editor scoreEdit = gameData.edit();

            //get existing scores.

            String scores = gameData.getString("High Score", "");

            //checl for scores


            String name = playerName1.getText().toString();
            String name2 = playerName2.getText().toString();

            if (scores.length() > 0) {

                List<Data> scoreStrings = new ArrayList<Data>();

                String[] exScore = scores.split("\\|");

                for (String eSc : exScore) {
                    String[] parts = eSc.split(" - ");
                    scoreStrings.add(new Data(parts[0], Integer.parseInt(parts[1])));
                }


                Data newScore1 = new Data(name, exScore1);
                Data newScore2 = new Data(name2, exScore2);

                scoreStrings.add(newScore1);
                scoreStrings.add(newScore2);

                Collections.sort(scoreStrings);

                StringBuilder scoreBuild = new StringBuilder("");
                for (int i = 0; i < scoreStrings.size(); i++) {

                    if (i >= 10) break;
                    if (i > 0) scoreBuild.append("|");
                    scoreBuild.append(scoreStrings.get(i).getScoreText());

                }

                // writing
                scoreEdit.putString("Highe Score", scoreBuild.toString());
                scoreEdit.commit();

            } else {
                // no existing scores
                scoreEdit.putString("Higher Score", "" + name + " - " + exScore1);
                scoreEdit.putString("Higher Score", "" + name2 + " - " + exScore2);
                scoreEdit.commit();
            }
        }
    }

    protected void onDestory() {
        setHighScore();
        super.onDestroy();
    }

    //
    @Override
    public void onSaveInstanceState(Bundle savedInstanceStats) {

        int exScore = getPlayer1Score();
        int exScore2 = getPlayer2Score();
        savedInstanceStats.putInt("score", exScore);
        savedInstanceStats.putInt("score", exScore2);

        super.onSaveInstanceState(savedInstanceStats);
    }
}