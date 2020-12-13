/*
<applet code="My4DrawOval1.class" width="400" height="400">
</applet>

*/

import java.applet.Applet;
import java.awt.Graphics;

public class My4DrawOval1 extends Applet {
    public void paint(Graphics g) {
        g.drawOval(80, 40, 140, 140);
        g.drawLine(80, 200, 220, 200);
        g.drawString("Simple Oval", 120, 220);
    }
}