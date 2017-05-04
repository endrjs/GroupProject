package game_data;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

import ininja.sunka.R;


/**
 * Created by Buttsecks on 09/11/2015.
 */
public class Settings extends Activity {


    private static MediaPlayer playMusic;
    private ToggleButton mute;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_menu);


        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int) (width * 0.5), (int) (height * 0.8));

        musicControl();


    }

    /**
     * This method will enable the user to mute/un-mute the background music.
     */
    public void musicControl(){

        mute = (ToggleButton) findViewById(R.id.muteButton);
        playMusic = MediaPlayer.create(Settings.this, R.raw.freemusic);

        mute.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    playMusic.start();
                } else {
                    playMusic.pause();
                }
            }
        });
        playMusic.start();
        playMusic.isLooping();
    }
    public void newRule(View v) {
        Intent intent = new Intent(this, RulesMenu.class);
        startActivity(intent);
    }

    public void quitGame(View v) {

        finish();

        }

}
