/*
<applet code="MyFillApplet.class" width="450" height="600">
</applet>

*/

import java.applet.Applet;
import java.awt.Graphics;

public class MyFillApplet extends Applet {
    public void paint(Graphics g) {

        g.fillRect(10, 10, 130, 130);
        g.fillArc(160, 10, 130, 130, 180, 180);
        g.fillOval(300, 10, 130, 130);

        g.fillOval(10, 180, 130, 130);
        g.fillArc(160, 180, 130, 130, 0, 180);
        g.fillRect(300, 180, 130, 130);

    }
}

// If line passes the cordinate of Applet, it get clipped, not shown