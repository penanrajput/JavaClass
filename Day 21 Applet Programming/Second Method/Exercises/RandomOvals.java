/*
<applet code="RandomOvals.class" width="600" height="600">
</applet>

*/

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class RandomOvals extends Applet {
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
        for (int i = 0; i < 6; i++) {

            y = 0;
            for (int j = 0; j < 6; j++) {
                int diff_x = randomRange(0, 100);
                int diff_y = randomRange(0, 100);
                int red = randomRange(0, 255);
                int green = randomRange(0, 255);
                int blue = randomRange(0, 255);
                g.setColor(new Color(red, green, blue));
                g.fillOval(x + diff_x, y + diff_y, 100, 100);
                y += 100;

            }
            x += 100;

        }

    }
}