/*
<applet code="My50OvalInsideOval.class" width="1250" height="550">
</applet>

*/

import java.applet.Applet;
import java.awt.*;

public class My50OvalInsideOval extends Applet {
    public int randomRange(int lower, int upper) {
        int num = (int) (Math.random() * (upper + 1 - lower)) + lower;
        return num;
    }

    public void paint(Graphics g) {

        for (int i = 0, j = 0; i < 13; i++, j += 20) {
            int red = randomRange(0, 255);
            int green = randomRange(0, 255);
            int blue = randomRange(0, 255);
            g.setColor(new Color(red, green, blue));
            g.fillOval(20 + j, 20 + j, 500 - 2 * j, 500 - 2 * j);

        }
        for (int i = 0, j = 0; i < 13; i++, j += 20) {
            int red = randomRange(0, 255);
            int green = randomRange(0, 255);
            int blue = randomRange(0, 255);
            g.setColor(new Color(red, green, blue));

            g.fillOval(550 + j, 20 + j, 500 - 2 * j, 500 - 2 * j);

        }

    }
}