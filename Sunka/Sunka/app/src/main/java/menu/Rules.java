package menu;
/**
 * This class will load a popup screen that will overlay on the Main Menu Page. It will show the
 * user all the rules for the current game.
 *
 * @author Damien Powell, Ka Chu, Gun Park, Maahnoor Khan & Zainab Khatun
 */

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;

import ininja.sunka.R;


public class Rules extends Activity {

    Button closeScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.rules_popup);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int) (width * 0.5), (int) (height * 0.8));

        closeScreen = (Button) findViewById(R.id.exitButton);

        closeScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });

    }

}
