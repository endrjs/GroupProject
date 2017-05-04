package game_data;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;



import Data.Score;


import ininja.sunka.R;
import menu.Scoreboard;

/**
 * Created by Buttsecks on 09/11/2015.
 */
public class Gameboard extends Activity {

    private Button p1Buttons[], p2Buttons[], allButtonsp1[],allButtonsp2[], player1store, player2store, pass,
            player1Extramoves, player2Extramoves, menuButton;
    private int seconds = 0, player1acc, player2acc, player1time, player2time;
    private static final String TAG = Gameboard.class.getSimpleName();
    private boolean running, player1, player2, b, wasrunning;

    private List<Integer> player1times, player2times;
    private TextView timeView, playerTurns, setPlayer1, setPlayer2;
    TextView playerName1, playerName2, timer;
    Button player1Total, player2Total;
    private String Player1Name,Player2Name;

    public static final String Player_Data = "PlayerFile";


    // My data
    TextView scoreTxt;
    TextView scoreTxt2;

    int played = 0;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_board);

        if(savedInstanceState !=null){
            seconds = savedInstanceState.getInt("seconds");
            running = savedInstanceState.getBoolean("running");
            wasrunning = savedInstanceState.getBoolean("wasrunning");
        }


        //initiate shared prefs
        gamePrefs = getSharedPreferences(GAME_PREFS, 0);

        scoreTxt = (TextView) findViewById(R.id.player1store);
        scoreTxt2 = (TextView) findViewById(R.id.player2store);

        if (savedInstanceState != null) {
            //saved instance state data
            played = savedInstanceState.getInt("level");
            int exScore = savedInstanceState.getInt("score");
            scoreTxt.setText("Score: " + exScore);
        } else {
            //get passed level number
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                int passedLevel = extras.getInt("level", -1);
                if (passedLevel >= 0) played = passedLevel;
            }
        }


        menuSetting();
        saveData();
        displayOutput();
        setNames();
        buttonAssigned();
        randomplayer();
        useAccumulatedMoves();
        runTimmer();
    }


    public void setNames() {

        Intent i = getIntent();
        String Player1Name = i.getStringExtra("P1Name");
        String Player2Name = i.getStringExtra("P2Name");
        setPlayer1 = (TextView) findViewById(R.id.setPlayer1);
        setPlayer2 = (TextView) findViewById(R.id.setPlayer2);
        setPlayer1.setText(Player1Name);
        setPlayer2.setText(Player2Name);

        playerTurns = (TextView) findViewById(R.id.playersTurn);
        playerName1 = (TextView) findViewById(R.id.setPlayer1);
        playerName2 = (TextView) findViewById(R.id.setPlayer2);
        timer = (TextView) findViewById(R.id.timer_view);
        player1Total = (Button) findViewById(R.id.player1store);
        player2Total = (Button) findViewById(R.id.player2store);

    }

    /**
     * This method assigns all the buttons from the game.xml. It also passes back the data to the
     * private Button p1Buttons[], p2Buttons[], allButtons[], player1store, player2store, pass,
     * player1Extramoves, player2Extramoves.
     */
    public void buttonAssigned(){

        p1Buttons = new Button[7];
        p1Buttons[0] = (Button) findViewById(R.id.p11);
        p1Buttons[1] = (Button) findViewById(R.id.p12);
        p1Buttons[2] = (Button) findViewById(R.id.p13);
        p1Buttons[3] = (Button) findViewById(R.id.p14);
        p1Buttons[4] = (Button) findViewById(R.id.p15);
        p1Buttons[5] = (Button) findViewById(R.id.p16);
        p1Buttons[6] = (Button) findViewById(R.id.p17);

        p2Buttons = new Button[7];
        p2Buttons[0] = (Button) findViewById(R.id.p21);
        p2Buttons[1] = (Button) findViewById(R.id.p22);
        p2Buttons[2] = (Button) findViewById(R.id.p23);
        p2Buttons[3] = (Button) findViewById(R.id.p24);
        p2Buttons[4] = (Button) findViewById(R.id.p25);
        p2Buttons[5] = (Button) findViewById(R.id.p26);
        p2Buttons[6] = (Button) findViewById(R.id.p27);


        allButtonsp1 = new Button[49];
        allButtonsp1[0] = (Button) findViewById(R.id.player1store);
        allButtonsp1[1] = (Button) findViewById(R.id.p21);
        allButtonsp1[2] = (Button) findViewById(R.id.p22);
        allButtonsp1[3] = (Button) findViewById(R.id.p23);
        allButtonsp1[4] = (Button) findViewById(R.id.p24);
        allButtonsp1[5] = (Button) findViewById(R.id.p25);
        allButtonsp1[6] = (Button) findViewById(R.id.p26);
        allButtonsp1[7] = (Button) findViewById(R.id.p27);

        allButtonsp1[8] = (Button) findViewById(R.id.p17);
        allButtonsp1[9] = (Button) findViewById(R.id.p16);
        allButtonsp1[10] = (Button) findViewById(R.id.p15);
        allButtonsp1[11] = (Button) findViewById(R.id.p14);
        allButtonsp1[12] = (Button) findViewById(R.id.p13);
        allButtonsp1[13] = (Button) findViewById(R.id.p12);
        allButtonsp1[14] = (Button) findViewById(R.id.p11);

        allButtonsp1[15] = (Button) findViewById(R.id.player1store);

        allButtonsp1[16] = (Button) findViewById(R.id.p21);
        allButtonsp1[17] = (Button) findViewById(R.id.p22);
        allButtonsp1[18] = (Button) findViewById(R.id.p23);
        allButtonsp1[19] = (Button) findViewById(R.id.p24);
        allButtonsp1[20] = (Button) findViewById(R.id.p25);
        allButtonsp1[21] = (Button) findViewById(R.id.p26);
        allButtonsp1[22] = (Button) findViewById(R.id.p27);

        allButtonsp1[23] = (Button) findViewById(R.id.p17);
        allButtonsp1[24] = (Button) findViewById(R.id.p16);
        allButtonsp1[25] = (Button) findViewById(R.id.p15);
        allButtonsp1[26] = (Button) findViewById(R.id.p14);
        allButtonsp1[27] = (Button) findViewById(R.id.p13);
        allButtonsp1[28] = (Button) findViewById(R.id.p12);
        allButtonsp1[29] = (Button) findViewById(R.id.p11);

        allButtonsp1[30] = (Button) findViewById(R.id.player1store);
        allButtonsp1[31] = (Button) findViewById(R.id.p21);
        allButtonsp1[32] = (Button) findViewById(R.id.p22);
        allButtonsp1[33] = (Button) findViewById(R.id.p23);
        allButtonsp1[34] = (Button) findViewById(R.id.p24);
        allButtonsp1[35] = (Button) findViewById(R.id.p25);
        allButtonsp1[36] = (Button) findViewById(R.id.p26);
        allButtonsp1[37] = (Button) findViewById(R.id.p27);

        allButtonsp1[38] = (Button) findViewById(R.id.p17);
        allButtonsp1[39] = (Button) findViewById(R.id.p16);
        allButtonsp1[40] = (Button) findViewById(R.id.p15);
        allButtonsp1[41] = (Button) findViewById(R.id.p14);
        allButtonsp1[42] = (Button) findViewById(R.id.p13);
        allButtonsp1[43] = (Button) findViewById(R.id.p12);
        allButtonsp1[44] = (Button) findViewById(R.id.p11);
        allButtonsp1[45] = (Button) findViewById(R.id.player1store);
        allButtonsp1[46] = (Button) findViewById(R.id.p21);
        allButtonsp1[47] = (Button) findViewById(R.id.p22);
        allButtonsp1[48] = (Button) findViewById(R.id.p23);

        allButtonsp2 = new Button[49];
        allButtonsp2[0] = (Button) findViewById(R.id.p21);
        allButtonsp2[1] = (Button) findViewById(R.id.p22);
        allButtonsp2[2] = (Button) findViewById(R.id.p23);
        allButtonsp2[3] = (Button) findViewById(R.id.p24);
        allButtonsp2[4] = (Button) findViewById(R.id.p25);
        allButtonsp2[5] = (Button) findViewById(R.id.p26);
        allButtonsp2[6] = (Button) findViewById(R.id.p27);
        allButtonsp2[7] = (Button) findViewById(R.id.player2store);
        allButtonsp2[8] = (Button) findViewById(R.id.p17);
        allButtonsp2[9] = (Button) findViewById(R.id.p16);
        allButtonsp2[10] = (Button) findViewById(R.id.p15);
        allButtonsp2[11] = (Button) findViewById(R.id.p14);
        allButtonsp2[12] = (Button) findViewById(R.id.p13);
        allButtonsp2[13] = (Button) findViewById(R.id.p12);
        allButtonsp2[14] = (Button) findViewById(R.id.p11);


        allButtonsp2[15] = (Button) findViewById(R.id.p21);
        allButtonsp2[16] = (Button) findViewById(R.id.p22);
        allButtonsp2[17] = (Button) findViewById(R.id.p23);
        allButtonsp2[18] = (Button) findViewById(R.id.p24);
        allButtonsp2[19] = (Button) findViewById(R.id.p25);
        allButtonsp2[20]= (Button) findViewById(R.id.p26);
        allButtonsp2[21] = (Button) findViewById(R.id.p27);
        allButtonsp2[22] = (Button) findViewById(R.id.player2store);
        allButtonsp2[23] = (Button) findViewById(R.id.p17);
        allButtonsp2[24] = (Button) findViewById(R.id.p16);
        allButtonsp2[25] = (Button) findViewById(R.id.p15);
        allButtonsp2[26] = (Button) findViewById(R.id.p14);
        allButtonsp2[27] = (Button) findViewById(R.id.p13);
        allButtonsp2[28] = (Button) findViewById(R.id.p12);
        allButtonsp2[29] = (Button) findViewById(R.id.p11);

        allButtonsp2[30] = (Button) findViewById(R.id.p21);
        allButtonsp2[31] = (Button) findViewById(R.id.p22);
        allButtonsp2[32] = (Button) findViewById(R.id.p23);
        allButtonsp2[33] = (Button) findViewById(R.id.p24);
        allButtonsp2[34] = (Button) findViewById(R.id.p25);
        allButtonsp2[35] = (Button) findViewById(R.id.p26);
        allButtonsp2[36] = (Button) findViewById(R.id.p27);
        allButtonsp2[37] = (Button) findViewById(R.id.player2store);
        allButtonsp2[38] = (Button) findViewById(R.id.p17);
        allButtonsp2[39] = (Button) findViewById(R.id.p16);
        allButtonsp2[40] = (Button) findViewById(R.id.p15);
        allButtonsp2[41] = (Button) findViewById(R.id.p14);
        allButtonsp2[42] = (Button) findViewById(R.id.p13);
        allButtonsp2[43] = (Button) findViewById(R.id.p12);
        allButtonsp2[44] = (Button) findViewById(R.id.p11);

        allButtonsp2[45] = (Button) findViewById(R.id.p21);
        allButtonsp2[46] = (Button) findViewById(R.id.p22);
        allButtonsp2[47]= (Button) findViewById(R.id.p23);



        player1store = (Button) findViewById(R.id.player1store);
        player2store = (Button) findViewById(R.id.player2store);

        pass = (Button) findViewById(R.id.pass);
        pass.setEnabled(false);

        player1Extramoves= (Button) findViewById(R.id.player1_extratruns);
        player2Extramoves= (Button) findViewById(R.id.player2_extraturns);

    }

    /**
     * This method tells the user who turn it is.
     */

    public void randomplayer(){
        Random random = new Random();
        int randomNumber = random.nextInt((1-0)+1);

        if(randomNumber==0){

            Context context = getApplicationContext();
            LayoutInflater inflater = getLayoutInflater();
            View toastRoot = inflater.inflate(R.layout.toast_player1, null);
            final Toast toast = new Toast(context);
            toast.setView(toastRoot);
            TextView v = (TextView) toastRoot.findViewById(R.id.toast_player1tv);
            v.setText(Player1Name + "  Goes First!!");
            toast.getView().setBackgroundColor(Color.parseColor("#FF3599DB"));
            toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL,
                    0, 0);
            toast.show();

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    toast.cancel();
                    player1 = true;
                    playGame();

                }

            }, 2000);

        }
        if(randomNumber==1){

            Context context = getApplicationContext();
            LayoutInflater inflater = getLayoutInflater();
            View toastRoot = inflater.inflate(R.layout.toast_player2,null);
            final Toast toast = new Toast(context);
            toast.setView(toastRoot);
            TextView v = (TextView) toastRoot.findViewById(R.id.toast_player2tv);
            v.setText(Player2Name + "  Goes First!!");
            toast.getView().setBackgroundColor(Color.parseColor("#4ccd97"));
            toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL,
                    0, 0);
            toast.show();


            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    toast.cancel();
                    player2 = true;
                    playGame();
                }

            }, 2000);



        }

    }

    /**
     * Loads all the methods into one method.
     */
    public void playGame() {

        start();
        player1Turn();
        player2Turn();

    }


    /**
     * This method contains all the data for the implemented buttons for player 1.
     */
    public void player1Turn(){
        if (player1==true){
            setPlayer1.setVisibility(View.VISIBLE);
            setPlayer2.setVisibility(View.INVISIBLE);
            for (int i = 0; i < p1Buttons.length; i++) {
                p2Buttons[i].setClickable(false);
                p1Buttons[i].setClickable(true);

                p1Buttons[i].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        pass.setEnabled(false);
                        if (v == p1Buttons[0]) {
                            if(p1Buttons[0].getText().equals("0")){
                                //donothing
                            }else {
                                int length = Integer.parseInt(p1Buttons[0].getText().toString());
                                p1Buttons[0].setText("0");
                                for (int i = 0; i < p1Buttons.length; i++) {
                                    p1Buttons[i].setClickable(false);
                                }
                                Button addbutton[] = new Button[length];
                                for (int i = 0; i < length; i++) {
                                    addbutton[i] = allButtonsp1[i];
                                }
                                addingOne(addbutton, player1);
                            }
                        }else if (v == p1Buttons[1]) {
                            if(p1Buttons[1].getText().toString().equals("0")){

                            }else {
                                int length = Integer.parseInt(p1Buttons[1].getText().toString());
                                p1Buttons[1].setText("0");
                                for (int i = 0; i < p1Buttons.length; i++) {
                                    p1Buttons[i].setClickable(false);
                                }
                                Button addbutton[] = new Button[length];
                                for (int i = 0; i < length; i++) {
                                    addbutton[i] = allButtonsp1[i + 14];
                                }
                                addingOne(addbutton, player1);
                            }
                        } else if (v == p1Buttons[2]) {
                            if(p1Buttons[2].getText().toString().equals("0")){

                            }else {
                                int length = Integer.parseInt(p1Buttons[2].getText().toString());
                                p1Buttons[2].setText("0");

                                for (int i = 0; i < p1Buttons.length; i++) {
                                    p1Buttons[i].setClickable(false);
                                }
                                Button addbutton[] = new Button[length];
                                for (int i = 0; i < length; i++) {
                                    addbutton[i] = allButtonsp1[i + 13];
                                }
                                addingOne(addbutton, player1);
                            }
                        } else if (v == p1Buttons[3]) {
                            if(p1Buttons[3].getText().toString().equals("0")){

                            }else {
                                int length = Integer.parseInt(p1Buttons[3].getText().toString());
                                p1Buttons[3].setText("0");
                                for (int i = 0; i < p1Buttons.length; i++) {
                                    p1Buttons[i].setClickable(false);
                                }
                                Button addbutton[] = new Button[length];
                                for (int i = 0; i < length; i++) {
                                    addbutton[i] = allButtonsp1[i + 12];
                                }
                                addingOne(addbutton, player1);
                            }
                        } else if (v==p1Buttons[4]){
                            if(p1Buttons[4].getText().toString().equals("0")){

                            }else {
                                int length = Integer.parseInt(p1Buttons[4].getText().toString());
                                p1Buttons[4].setText("0");
                                for (int i = 0; i < p1Buttons.length; i++) {
                                    p1Buttons[i].setClickable(false);
                                }
                                Button addbutton[] = new Button[length];
                                for (int i = 0; i < length; i++) {
                                    addbutton[i] = allButtonsp1[i + 11];
                                }
                                addingOne(addbutton, player1);
                            }
                        } if (v == p1Buttons[5]) {
                            if(p1Buttons[5].getText().toString().equals("0")){

                            }else {
                                int length = Integer.parseInt(p1Buttons[5].getText().toString());
                                p1Buttons[5].setText("0");
                                for (int i = 0; i < p1Buttons.length; i++) {
                                    p1Buttons[i].setClickable(false);
                                }
                                Button addbutton[] = new Button[length];
                                for (int i = 0; i < length; i++) {
                                    addbutton[i] = allButtonsp1[i + 10];
                                }
                                addingOne(addbutton, player1);
                            }
                        } if (v == p1Buttons[6]) {
                            if(p1Buttons[6].getText().toString().equals("0")){

                            }else {
                                int length = Integer.parseInt(p1Buttons[6].getText().toString());
                                p1Buttons[6].setText("0");
                                for (int i = 0; i < p1Buttons.length; i++) {
                                    p1Buttons[i].setClickable(false);
                                }
                                Button addbutton[] = new Button[length];
                                for (int i = 0; i < length; i++) {
                                    addbutton[i] = allButtonsp1[i + 9];
                                }
                                addingOne(addbutton, player1);
                            }
                        }
                    }
                });
            }
        }
    }

    /**
     * This method contains all the data for the implemented buttons for player 2.
     */
    public void player2Turn(){
        if(player2==true){
            setPlayer2.setVisibility(View.VISIBLE);
            setPlayer1.setVisibility(View.INVISIBLE);

            for (int i = 0; i < p2Buttons.length; i++) {
                p1Buttons[i].setClickable(false);
                p2Buttons[i].setClickable(true);

                p2Buttons[i].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        pass.setEnabled(false);
                        if (v == p2Buttons[0]) {

                            if(p2Buttons[0].getText().toString().equals("0")){

                            }else {

                                int length = Integer.parseInt(p2Buttons[0].getText().toString());
                                p2Buttons[0].setText("0");
                                for (int i = 0; i < p2Buttons.length; i++) {
                                    p2Buttons[i].setClickable(false);
                                }
                                Button addbutton[] = new Button[length];
                                for (int i = 0; i < length; i++) {
                                    addbutton[i] = allButtonsp2[i + 1];
                                }
                                addingOne(addbutton, player1);
                            }
                        } else if (v == p2Buttons[1]) {

                            if(p2Buttons[1].getText().toString().equals("0")){
                            }else {

                                int length = Integer.parseInt(p2Buttons[1].getText().toString());
                                p2Buttons[1].setText("0");

                                for (int i = 0; i < p2Buttons.length; i++) {
                                    p2Buttons[i].setClickable(false);
                                }

                                Button addbutton[] = new Button[length];
                                for (int i = 0; i < length; i++) {
                                    addbutton[i] = allButtonsp2[i + 2];
                                }
                                addingOne(addbutton, player1);
                            }
                        } else if (v == p2Buttons[2]) {

                            if(p2Buttons[2].getText().toString().equals("0")){
                            }else {
                                int length = Integer.parseInt(p2Buttons[2].getText().toString());
                                p2Buttons[2].setText("0");

                                for (int i = 0; i < p2Buttons.length; i++) {
                                    p2Buttons[i].setClickable(false);
                                }
                                Button addbutton[] = new Button[length];
                                for (int i = 0; i < length; i++) {
                                    addbutton[i] = allButtonsp2[i + 3];
                                }
                                addingOne(addbutton, player1);
                            }

                        } else if (v == p2Buttons[3]) {

                            if(p2Buttons[3].getText().toString().equals("0")){
                            }else {
                                int length = Integer.parseInt(p2Buttons[3].getText().toString());
                                p2Buttons[3].setText("0");
                                for (int i = 0; i < p2Buttons.length; i++) {
                                    p2Buttons[i].setClickable(false);
                                }
                                Button addbutton[] = new Button[length];
                                for (int i = 0; i < length; i++) {
                                    addbutton[i] = allButtonsp2[i + 4];
                                }
                                addingOne(addbutton, player1);

                            }
                        } else if (v == p2Buttons[4]) {

                            if(p2Buttons[4].getText().toString().equals("0")){
                            }else {
                                int length = Integer.parseInt(p2Buttons[4].getText().toString());
                                p2Buttons[4].setText("0");
                                for (int i = 0; i < p2Buttons.length; i++) {
                                    p2Buttons[i].setClickable(false);
                                }
                                Button addbutton[] = new Button[length];
                                for (int i = 0; i < length; i++) {
                                    addbutton[i] = allButtonsp2[i + 5];
                                }
                                addingOne(addbutton, player1);
                            }
                        } else if (v == p2Buttons[5]) {

                            if(p2Buttons[5].getText().toString().equals("0")){
                            }else {
                                int length = Integer.parseInt(p2Buttons[5].getText().toString());
                                p2Buttons[5].setText("0");
                                for (int i = 0; i < p2Buttons.length; i++) {
                                    p2Buttons[i].setClickable(false);
                                }
                                Button addbutton[] = new Button[length];
                                for (int i = 0; i < length; i++) {
                                    addbutton[i] = allButtonsp2[i + 6];
                                }
                                addingOne(addbutton, player1);
                            }
                        } else if (v == p2Buttons[6]) {

                            if(p2Buttons[6].getText().toString().equals("0")){
                            }else {
                                int length = Integer.parseInt(p2Buttons[6].getText().toString());
                                p2Buttons[6].setText("0");

                                for (int i = 0; i < p2Buttons.length; i++) {
                                    p2Buttons[i].setClickable(false);
                                }
                                Button addbutton[] = new Button[length];
                                for (int i = 0; i < length; i++) {
                                    addbutton[i] = allButtonsp2[i + 7];
                                }
                                addingOne(addbutton, player1);
                            }
                        }
                    }
                });
            }
        }


    }


    /***
     *
     */


    public void addingOne(final Button [] addbutton, final boolean player){

        Handler handler = new Handler();
        for (int i = 0; i < addbutton.length; i++) {
            final int x = i;
            handler.postDelayed(new Runnable() {
                public void run() {
                    int num = Integer.parseInt(addbutton[x].getText().toString());
                    addbutton[x].setText(Integer.toString(num + 1));
                    if (x == addbutton.length - 1) {
                        captureShell(addbutton[x], player);
                        extraTurn(addbutton[x], player);
                        noTurn(addbutton[x]);
                        gameover();
                        if (extraTurn(addbutton[x], player)) {
                            //donothing
                        } else {
                            if (player == true) {
                                player1 = false;
                                player2 = true;
                                playGame();
                            } else {
                                player1 = true;
                                player2 = false;
                                playGame();
                            }
                        }

                    }
                }
            },500*(i+1));
            reset();
        }

    }

    public void captureShell(Button  button,boolean player){
        int length = 1;
        if(player==true){
            for (int i = 0 ; i<p1Buttons.length; i++) {
                if (button== p1Buttons[i] && button.getText().toString().equals("1")){
                    p1Buttons[i].setText("0");
                    int capturedshells = Integer.parseInt( p2Buttons[i].getText().toString());
                    p2Buttons[i].setText("0");
                    int allshells = Integer.parseInt(player1store.getText().toString())  + capturedshells + 1;
                    player1store.setText(Integer.toString(allshells));
                }
            }
        } if(player==false) {
            for (int i = 0 ; i<p2Buttons.length; i++) {
                if (button== p2Buttons[i] && button.getText().toString().equals("1")){
                    p2Buttons[i].setText("0");
                    int capturedshells = Integer.parseInt( p1Buttons[i].getText().toString());
                    p1Buttons[i].setText("0");
                    int allshells = Integer.parseInt(player2store.getText().toString())  + capturedshells + 1;
                    player2store.setText(Integer.toString(allshells));
                }
            }
        }
    }

    public boolean extraTurn(final Button button,boolean player){
        boolean b = false;
        if(button==player1store && player == true) {
            start();
            b= true;
            pass.setEnabled(true);
            pass.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    reset();
                    player1acc ++;
                    player1Extramoves.setText(Integer.toString(player1acc));
                    player1 = false;
                    player2 = true;
                    playGame();
                    pass.setEnabled(false);
                    noTurn(button);
                }
            });
            player1 = true;
            player2 = false;
            playGame();


        } if(button==player2store && player == false){
            start();
            b=true;
            pass.setEnabled(true);
            pass.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    reset();
                    player2acc ++;
                    player2Extramoves.setText(Integer.toString(player2acc));
                    player1 = true;
                    player2 = false;
                    playGame();
                    pass.setEnabled(false);
                    noTurn(button);
                }
            });

            player2 = true;
            player1=false;
            playGame();
        }
        return b;
    }

    public void useAccumulatedMoves(){
        player1Extramoves.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (player1Extramoves.getText().toString().equals("0")) {
                    //do nothing
                } else {
                    --player1acc;
                    player1Extramoves.setText(Integer.toString(player1acc));
                    player1 = true;
                    player2 = false;
                    playGame();
                }
            }
        });

        player2Extramoves.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(player2Extramoves.getText().toString().equals("0")){
                    //do nothing
                }else{
                    --player2acc;
                    player2Extramoves.setText(Integer.toString(player2acc));
                    player1 = false;
                    player2 = true;
                    playGame();
                }
            }
        });
    }

    public void noTurn(final Button button) {
        if (player1 == true){
            if (p1Buttons[0].getText().toString().equals("0") && p1Buttons[1].getText().toString().equals("0") && p1Buttons[2].getText().toString().equals("0") && p1Buttons[3].getText().toString().equals("0") &&
                    p1Buttons[4].getText().toString().equals("0") && p1Buttons[5].getText().toString().equals("0") && p1Buttons[6].getText().toString().equals("0")) {
                pass.setEnabled(true);
                for(int i = 0; i<p1Buttons.length;i++){
                    p1Buttons[i].setClickable(false);
                }
                pass.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        if(button==player1store) {
                            player1acc ++;
                            player1Extramoves.setText(Integer.toString(player1acc));
                        }
                        player1 = false;
                        player2 = true;
                        playGame();
                        pass.setEnabled(false);
                    }
                });
            }
        }
        if(player2 == true) {
            if (p2Buttons[0].getText().toString().equals("0") && p2Buttons[1].getText().toString().equals("0") && p2Buttons[2].getText().toString().equals("0") && p2Buttons[3].getText().toString().equals("0") &&
                    p2Buttons[4].getText().toString().equals("0") && p2Buttons[5].getText().toString().equals("0") && p2Buttons[6].getText().toString().equals("0")) {
                pass.setEnabled(true);
                for(int i = 0; i<p2Buttons.length;i++) {
                    p2Buttons[i].setClickable(false);
                }
                pass.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(button==player2store) {
                            player2acc ++;
                            player2Extramoves.setText(Integer.toString(player2acc));
                        }
                        player1 = true;
                        player2 = false;
                        playGame();
                        pass.setEnabled(false);
                    }
                });

            }

        }
    }

    public void player1Time(int x){
        player1times = new ArrayList<Integer>();
        player1times.add(x);
    }

    public void player2Time(int x){
        player2times = new ArrayList<Integer>();
        player2times.add(x);

    }




    public void onPause(){
        super.onPause();
        wasrunning = running;
        running=false;
    }

    public void onResume(){
        super.onResume();
        if(wasrunning){
            running=true;
        }
    }

    public void onSaveInstancesState(Bundle savedInstanceState){
        savedInstanceState.putInt("seconds",seconds);
        savedInstanceState.putBoolean("running", running);
        savedInstanceState.putBoolean("wasrunning", wasrunning);


    }


    public void start() {
        running = true;
    }

    public void reset() {
        if(player1==true){
            player1time = Integer.parseInt(timeView.getText().toString().replaceAll(":",""));
            player1Time(player1time);

        }else if(player2 == true){
            player2time = Integer.parseInt(timeView.getText().toString().replaceAll(":",""));
            player2Time(player2time);
        }
        running = false;
        seconds = 0;
    }


    private void runTimmer() {
        timeView = (TextView) findViewById(R.id.timer_view);
        final Handler handler = new Handler();
        handler.post(new Runnable() {
            public void run() {


                int hours = seconds / 3600;
                int minutes = (seconds % 3600) / 60;
                int secs = seconds % 60;
                String time = String.format("%d:%02d:%02d", hours, minutes, secs);
                timeView.setText(time);
                if (running) {
                    seconds++;
                }
                handler.postDelayed(this, 1000);
            }
        });

    }

    public void gameover() {

        if( p1Buttons[0].getText().toString().equals("0") && p1Buttons[1].getText().toString().equals("0") && p1Buttons[2].getText().toString().equals("0") && p1Buttons[3].getText().toString().equals("0") &&
                p1Buttons[4].getText().toString().equals("0") && p1Buttons[5].getText().toString().equals("0") && p1Buttons[6].getText().toString().equals("0")&&
                p2Buttons[0].getText().toString().equals("0") && p2Buttons[1].getText().toString().equals("0") && p2Buttons[2].getText().toString().equals("0") && p2Buttons[3].getText().toString().equals("0") &&
                p2Buttons[4].getText().toString().equals("0") && p2Buttons[5].getText().toString().equals("0") && p2Buttons[6].getText().toString().equals("0"))
        {

            int player1finalscore = Integer.parseInt(player1store.getText().toString());
            int player2finalscore=Integer.parseInt(player2store.getText().toString());

            if(player1finalscore > player2finalscore){
                Collections.min(player1times);
            }else if (player1finalscore < player2finalscore){
                Collections.min(player1times);
            }else{
                String tie = "Its a tie";
            }
            pass.setEnabled(false);

        }
    }

    /**
     * This method opens up the menu page.
     *
     * @param
     */
    public void menuSetting() {


        menuButton = (Button) findViewById(R.id.menu);

        menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View e) {

                Intent intent = new Intent(Gameboard.this, Settings.class);

                startActivity(intent);
            }
        });



    }


    // The methods below will allow data to be passed into file to be saved.

    int highScore1, highScore2;
    int winner = 0, loser = 0;
    String playerOne, playerTwo;
    public static final String GAME_PREFS = "PlayerData";
    private SharedPreferences gamePrefs;


    /**
     * This method will collect player's 1 data.
     */
    public void getPlayer1() {
        playerOne = setPlayer1.getText().toString();
        playerTwo = setPlayer2.getText().toString();
        highScore1 = Integer.parseInt(player1store.getText().toString());
        highScore2 = Integer.parseInt(player2store.getText().toString());


        //Determines who is the winner & loser, and also updates the new total to the database.
        if (highScore1 > highScore2) {
            // Winner Player1.
            winner = 1;
            loser = 0;

        } else if (highScore1 < highScore2) {
            //Winner Player2
            winner = 0;
            loser = 0;
        } else {
            // It's a tie.
            winner = 1;
            loser = 0;
        }
        //Adding player 1 tot the Collection.
      /*  player1Data = new Data(playerOne, highScore1, winner, loser, "1", "10.0");
        player2Data = new Data(playerTwo, highScore1, winner, loser, 1, "10.0");
        johnSnow = new Data("John Snow", 15, 2, 1, 1, "10.0");
        uncleCid = new Data("Uncle Cid", 15, 2, 1, 1, "10.0");
*/
    }

    public int winner() {
        if (highScore1 > highScore2) {
            // Winner Player1.
            winner = 1;


        } else if (highScore1 < highScore2) {
            //Winner Player2
            winner = 0;
        } else {
            // It's a tie.
            winner = 1;

        }
        return winner;

    }

    public int loser() {
        if (highScore1 > highScore2) {
            // Winner Player1.
            loser = 0;


        } else if (highScore1 < highScore2) {
            //Winner Player2
            loser = 0;
        } else {
            // It's a tie.
            loser = 1;

        }
        return loser;

    }

    private void saveData() {

        try {

            FileOutputStream fou = openFileOutput("playerData.txt", MODE_WORLD_READABLE);
            OutputStreamWriter osw = new OutputStreamWriter(fou);

            try {
                String blah = "blah";
                osw.write(blah);
                osw.flush();
                osw.close();
                Toast.makeText(getBaseContext(), "Data Saved", Toast.LENGTH_SHORT).show();
            } catch (IOException e) {
                e.printStackTrace();
                ;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }


    /**
     * This method will display the output of the file. Works...
     */
    public void displayOutput() {
        File sdcard = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS);
        File file = new File(sdcard, "playerData.txt");
        StringBuilder text = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                text.append(line);
                text.append('\n');
            }
        } catch (FileNotFoundException e) {
            Toast.makeText(getApplicationContext(), "File not found!", Toast.LENGTH_LONG).show();
            e.printStackTrace();
        } catch (IOException e) {
            Toast.makeText(getApplicationContext(), "Error reading file!", Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }
        TextView output = (TextView) findViewById(R.id.testing);
        // Assuming that 'output' is the id of your TextView
        output.setText(text);
    }

    //method retrieves score
    private int getScore() {
        String scoreStr = scoreTxt.getText().toString();
        return Integer.parseInt(scoreStr.substring(scoreStr.lastIndexOf(" ") + 1));
    }

    //set high score
    private void setHighScore() {
        int exScore = getScore();
        if (exScore > 0) {
            //we have a valid score
            SharedPreferences.Editor scoreEdit = gamePrefs.edit();


            //get existing scores
            String scores = gamePrefs.getString("highScores", "");
            //check for scores
            if (scores.length() > 0) {
                //we have existing scores
                List<Score> scoreStrings = new ArrayList<Score>();
                //split scores
                String[] exScores = scores.split("\\|");
                //add score object for each
                for (String eSc : exScores) {
                    String[] parts = eSc.split(" - ");
                    scoreStrings.add(new Score(parts[0], Integer.parseInt(parts[1]), Integer.parseInt(parts[2]), Integer.parseInt(parts[3]), parts[4]));
                }

                String time = timer.getText().toString();
                //new score
                Score newScore = new Score(playerOne, highScore1, winner, loser, time);
                scoreStrings.add(newScore);
                //sort
                Collections.sort(scoreStrings);
                //get top ten
                StringBuilder scoreBuild = new StringBuilder("");
                for (int s = 0; s < scoreStrings.size(); s++) {
                    if (s >= 10) break;
                    if (s > 0) scoreBuild.append("|");
                    scoreBuild.append(scoreStrings.get(s).getScoreText());
                }
                //write to prefs
                scoreEdit.putString("highScores", scoreBuild.toString());
                scoreEdit.commit();

            } else {
                //no existing scores
                scoreEdit.putString(playerOne + " - " + "highScores", " - " + exScore);
                scoreEdit.commit();
            }
        }
    }

    //set high score if activity destroyed
    protected void onDestroy() {
        setHighScore();
        super.onDestroy();
    }

    //save instance state
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        //save score and level
        int exScore = getScore();
        savedInstanceState.putInt("score", exScore);
        savedInstanceState.putInt("High Score", highScore1);
        //superclass method
        super.onSaveInstanceState(savedInstanceState);
    }

    public void loadScreenboard(View v) {





    }

}











