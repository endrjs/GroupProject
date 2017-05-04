package player_data;

/**
 * This class will load the input page for the user(s), it also contains the loading profile button.
 * @author Damien Powell, Ka Chu, Gun Park, Maahnoor Khan & Zainab Khatun
 */
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import ininja.sunka.R;

public class Player1 extends Activity {

    // Note: This class is pretty much done, please do not change any of the methods, unless you
    // have an idea that can improve the current code.
    private Button load, next, back;
    /**
     * This method will allow all the widgets in player1.xml load. And also returns the EditText
     * data back into the game.
     * @param savedInstanceState
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player_1);


        final EditText Player1Name = (EditText) findViewById(R.id.inputPlayer1);
        Player1Name.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if ((event.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    Toast.makeText(Player1.this, Player1Name.getText(), Toast.LENGTH_LONG).show();
                    return true;
                }
                return false;
            }
        });
    }

    /**
     * This method was created to continue onto the next page, and also carrying the data over to
     * the gameboard interface.
     * @param v
     */
    public void nextScreen(View v) {
        next = (Button) findViewById(R.id.nextPlayer);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Player1.this, Player2.class);
                EditText Player1Name = (EditText) findViewById(R.id.inputPlayer1);
                intent.putExtra("P1Name", Player1Name.getText().toString());
                startActivityForResult(intent,1);
            }
        });
    }


    /**
     * Returns back to the last known page.
     * @param v
     */
    public void goBack(View v) {
        back = (Button) findViewById(R.id.backButton);
        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}