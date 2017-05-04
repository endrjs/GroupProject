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


import game_data.Gameboard;
import ininja.sunka.R;

public class Player2 extends Activity {

    private Button load, letsplay, back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player_2);

        final EditText Player2Name = (EditText) findViewById(R.id.inputPlayer2);

        Player2Name.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if ((event.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    Toast.makeText(Player2.this, Player2Name.getText(), Toast.LENGTH_LONG).show();
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
    public void startGame(View v) {
        EditText Player2Name = (EditText) findViewById(R.id.inputPlayer2);
        Intent i = getIntent();
        String Player1Name = i.getStringExtra("P1Name");
        Intent intent = new Intent(this, Gameboard.class);
        intent.putExtra("P2Name", Player2Name.getText().toString());
        intent.putExtra("P1Name", Player1Name);
        startActivity(intent);
    }

    /**
     * This method will open the Game board class.
     * @param v
     */
    public void nextScreen(View v) {
        letsplay = (Button) findViewById(R.id.nextPlayer);
        letsplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Player2.this, Gameboard.class);
                EditText Player1Name = (EditText) findViewById(R.id.inputPlayer1);
                intent.putExtra("P1Name", Player1Name.getText().toString());
                startActivity(intent);
            }
        });
    }

    /**
     * Returns back to the last known page.
     * @param v
     */
    public void goBack(View v) {
        back = (Button) findViewById(R.id.backButton);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}