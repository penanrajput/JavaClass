/*
<applet code="My40DrawOval1.class" width="400" height="600">
</applet>

*/

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class My40DrawOval1 extends Applet {
    public int randomRange(int lower, int upper) {
        int num = (int) (Math.random() * (upper + 1 - lower)) + lower;
        return num;
    }

    public void paint(Graphics g) {

        for (int i = 0, j = 0; i < 5; i++, j += 20) {
            int x = randomRange(0, 255);
            int y = randomRange(0, 255);
            int z = randomRange(0, 255);
            g.setColor(new Color(x, y, z));
            g.drawOval(40 + j, 80 + j, 200 - 2 * j, 200 - 2 * j);
        }
    }
}