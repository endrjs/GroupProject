package game_data;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import ininja.sunka.R;

/**
 * Created by Maahnoor on 12/11/2015.
 */
public class AIGameboard extends Activity {

    // RotateAnimation a = new RotateAnimation(0,90);
    // a.setFillAfter(true);
    // a.setDuration(0);
    //  timer.startAnimation(a);
    private Button p1Buttons[], p2Buttons[], allButtonsp1[],allButtonsp2[], player1store, player2store, pass,
            player1Extramoves, player2Extramoves;
    private int seconds = 0, player1acc, player2acc, player1time, player2time;
    private boolean running, player1, player2,b,wasrunning;
    private List<Integer> player1times, player2times;
    private TextView timeView, playerTurns, setPlayer1, setPlayer2;
    private String Player1Name,Player2Name;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_board);
        if(savedInstanceState !=null){
            seconds = savedInstanceState.getInt("seconds");
            running = savedInstanceState.getBoolean("running");
            wasrunning = savedInstanceState.getBoolean("wasrunning");
        }

        Intent i = getIntent();
        Player1Name = i.getStringExtra("P1Name");
        Player2Name = i.getStringExtra("P2Name");

        setPlayer1 = (TextView) findViewById(R.id.setPlayer1);
        setPlayer2 = (TextView) findViewById(R.id.setPlayer2);

        setPlayer1.setText(Player1Name);
        setPlayer2.setText("AI player");

        playerTurns = (TextView) findViewById(R.id.playersTurn);


        buttonAssigned();
        randomplayer();
        useAccumulatedMoves();
        runTimmer();
    }

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

        for(int i = 0; i < p2Buttons.length; i++){
            p2Buttons[i].setClickable(false);
        }

        player1store = (Button) findViewById(R.id.player1store);
        player2store = (Button) findViewById(R.id.player2store);

        pass = (Button) findViewById(R.id.pass);
        pass.setEnabled(false);

        player1Extramoves= (Button) findViewById(R.id.player1_extratruns);
        player2Extramoves= (Button) findViewById(R.id.player2_extraturns);




    }
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
            v.setText("AI Goes First!!");
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
                    firstTurn();
                }
            }, 2000);
        }

    }

    public void playGame() {

        start();
        player1Turn();
        player2Turn();

    }

        public void firstTurn(){
       int length = Integer.parseInt( p2Buttons[0].getText().toString());
            p2Buttons[0].setText("0");
            Button addbutton[] = new Button[length];
            for (int i = 0; i < length; i++) {
                addbutton[i] = allButtonsp2[i+1];
            }
            addingOne(addbutton, player1);
        }

    public void player1Turn(){
        if (player1==true){
            setPlayer1.setVisibility(View.VISIBLE);
            setPlayer2.setVisibility(View.INVISIBLE);
            for (int i = 0; i < p1Buttons.length; i++) {
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






    public void player2Turn(){
        if(player2==true){
            setPlayer2.setVisibility(View.VISIBLE);
            setPlayer1.setVisibility(View.INVISIBLE);

            for (int i = 0 ; i<p2Buttons.length; i++){
                if(Integer.parseInt(p2Buttons[i].getText().toString()) == 0){
                    //do nothing
                }
                else if(Integer.parseInt(p2Buttons[i].getText().toString()) != 0) {
                    int x = i;
                    int add = x+1;
                  p2Buttons[x].setText("0");
                    Button addbutton[] = new Button[Integer.parseInt(p2Buttons[x].getText().toString())];
                    for (int y =0 ; y<allButtonsp2.length; y++) {
                        addbutton[y] = allButtonsp2[y+add];
                    }
                    addingOne(addbutton, player1);
                }
                break;





























            }




        }


    }


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
        savedInstanceState.putBoolean("wasrunning",wasrunning);


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



    public void menuSetting(View v) {
        startActivity(new Intent(AIGameboard.this, Settings.class));

    }

}










