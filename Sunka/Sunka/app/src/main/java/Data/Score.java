package Data;

/**
 * Created by Buttsecks on 12/11/2015.
 */

public class Score implements Comparable<Score> {

    //score date and number
    private String playerName, time;
    public int winner, lose,highScore;

    public Score(String name, int highscore, int win, int loses, String timer) {
        playerName = name;
        highScore = highscore;
        winner = win;
        lose = loses;
        time = timer;
    }

    //check this score against another
    public int compareTo(Score sc) {
        //return 0 if equal
        //1 if passed greater than this
        //-1 if this greater than passed
        return sc.highScore > highScore ? 1 : sc.highScore < highScore ? -1 : 0;
    }

    //return score display text
    public String getScoreText() {
        return playerName + " - " + highScore + " - " + winner + " - " + lose + " - " + time;
    }
}