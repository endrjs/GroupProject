package menu;

import android.app.ProgressDialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ToggleButton;

import ininja.sunka.R;
import player_data.Player1;

/**
 *
 */

public class MainMenu extends AppCompatActivity {

    private ToggleButton mute;


    private static MediaPlayer playMusic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);

        musicControl();
    }

    /**
     * This method will enable the user to mute/un-mute the background music.
     */
    public void musicControl(){

        mute = (ToggleButton) findViewById(R.id.muteButton);
        playMusic = MediaPlayer.create(MainMenu.this,R.raw.freemusic);

        mute.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    playMusic.start();
                } else {
                    playMusic.pause();
                }
            }
        });
        playMusic.pause();
        playMusic.isLooping();
    }

    public void newRule(View v) {
        Intent intent = new Intent(this, Rules.class);
        startActivity(intent);
    }

    public void newScoreBoard(View v) {
        startActivity(new Intent(MainMenu.this, Scoreboard.class));
    }

    public void newGame(View v) {
        startActivity(new Intent(MainMenu.this, Player1.class));
    }
}
