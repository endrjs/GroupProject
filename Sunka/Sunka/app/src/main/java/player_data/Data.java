package player_data;

/**
 * Created by Buttsecks on 09/11/2015.
 */
public class Data implements Comparable<Data> {

    //score

    private String playerName;
    private int scoreNum;

    public Data(String playerName, int scoreNum) {
        this.playerName = playerName;
        this.scoreNum = scoreNum;
    }

    public int compareTo (Data sc) {

        return sc.scoreNum>scoreNum? 1 : sc.scoreNum<scoreNum? -1: 0;

    }
    public String getScoreText() {
        return playerName+ " - " + scoreNum;
    }
}