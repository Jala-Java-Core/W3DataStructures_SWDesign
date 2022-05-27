package games;

import java.awt.*;

public class Game {

    // Code W3-4
    protected void updatePlayer(Player player) {
        player.getPaintbrush().setColor(Color.RED); //violation of law


        //Code W3-5
        Paintbrush brush = player.getPaintbrush(); //refactor to fix violation of law
        brush.setColor(Color.RED);



        // Code W3-6
        player.setColor(Color.RED);
    }
}
