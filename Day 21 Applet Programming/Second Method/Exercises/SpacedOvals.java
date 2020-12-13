/*
<applet code="SpacedOvals.class" width="600" height="600">
</applet>

*/

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class SpacedOvals extends Applet {
    public static int randomRange(int lower, int upper, int step) {
        int num = (int) (Math.random() * (upper + 1 - lower)) + lower;
        num = num - (num % step);
        return num;
    }

    // RandomRange(int, int)
    public static int randomRange(int lower, int upper) {
        int num = (int) (Math.random() * (upper + 1 - lower)) + lower;
        return num;
    }

    public void paint(Graphics g) {
        int x = 0, y = 0;
        for (int i = 0; i < 6; i++) { // for row

            x = 0;
            for (int j = 0; j < 5; j++) { // for column
                int diff = randomRange(0, 100);
                int red = randomRange(0, 255);
                int green = randomRange(0, 255);
                int blue = randomRange(0, 255);
                g.setColor(new Color(red, green, blue));
                g.fillOval(x + diff / 2, y + diff / 2, 100 - diff, 100 - diff);
                x += 100;
            }
            y += 100;

        }

    }
}