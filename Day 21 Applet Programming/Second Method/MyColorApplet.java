/*
<applet code="MyColorApplet.class" width="450" height="600">
</applet>

*/

import java.applet.Applet;
import java.awt.*;

public class MyColorApplet extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(10, 10, 130, 80);

        g.setColor(Color.ORANGE);
        g.fillOval(160, 10, 130, 80);

        g.setColor(Color.PINK);
        g.fillRoundRect(300, 10, 130, 80, 30, 30);

        g.setColor(Color.BLUE);
        g.fillRect(10, 110, 130, 130);

        g.setColor(Color.CYAN);
        g.fillOval(160, 110, 130, 130);

        g.setColor(Color.GREEN);
        g.fillRoundRect(300, 110, 130, 130, 30, 30);

        g.setColor(Color.MAGENTA);
        g.fillRect(10, 260, 130, 130);

        g.setColor(Color.YELLOW);
        g.fillOval(160, 260, 130, 130);

        g.setColor(Color.LIGHT_GRAY);
        g.fillRoundRect(300, 260, 130, 130, 30, 30);

        g.setColor(Color.DARK_GRAY);
        g.fillRect(10, 410, 130, 130);

        g.setColor(Color.BLACK);
        g.fillOval(160, 410, 130, 130);

        g.setColor(new Color(10, 140, 250));
        g.fillRoundRect(300, 410, 130, 130, 30, 30);
    }
}