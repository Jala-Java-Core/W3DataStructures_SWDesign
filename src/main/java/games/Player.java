package games;

import java.awt.*;

public class Player {
    //Code W3-6

    private Paintbrush paintbrush;
    public void setColor(Color color) {
        paintbrush.alterColor(color);
    }

    public Paintbrush getPaintbrush() {
        return paintbrush;
    }
}
