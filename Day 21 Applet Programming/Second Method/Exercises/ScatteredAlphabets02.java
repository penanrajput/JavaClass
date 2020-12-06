/*
<applet code="ScatteredAlphabets02.class" width="400" height="600">
</applet>

*/

import java.applet.Applet;
import java.awt.*;

public class ScatteredAlphabets02 extends Applet {

    public int randomRange(int lower, int upper) {
        int num = (int) (Math.random() * (upper - lower)) + lower;
        return num;
    }

    public int randomRange(int lower, int upper, int step) {
        int num = (int) (Math.random() * (upper - lower)) + lower;
        num = num - (num % step);
        return num;

    }

    public void paint(Graphics g) {

        // g.setFont(new Font("Consolas", Font.ITALIC, 20));
        for (int i = 0, j = 0; i < 800; i++, j += 20) {
            int red = randomRange(0, 255);
            int green = randomRange(0, 255);
            int blue = randomRange(0, 255);
            g.setColor(new Color(red, green, blue));
            char ch = (char) (randomRange(65, 92));
            int x = randomRange(25, 375, 20);
            int y = randomRange(25, 575, 20);

            g.drawString(Character.toString(ch), x, y);
            // g.drawString("" + x + " " + y, x, y);
        }

    }
}