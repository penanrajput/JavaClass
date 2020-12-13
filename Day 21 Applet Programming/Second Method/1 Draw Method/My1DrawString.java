/*
<applet code="My1DrawString.class" width="200" height="200">
</applet>
*/

import java.applet.Applet;
import java.awt.Graphics;

public class My1DrawString extends Applet {
    public void paint(Graphics g) {
        g.drawString("This is new Text", 20, 50);
    }
}
