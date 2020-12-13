/*
<applet code="ScatteredAlphabets.class" width="1250" height="550">
</applet>

*/

import java.applet.Applet;
import java.awt.*;

public class ScatteredAlphabets extends Applet {

    public static int randomRange(int lower, int upper) {
        int num = (int) (Math.random() * (upper + 1 - lower)) + lower;
        return num;
    }

    public static int randomRange(int lower, int upper, int step) {
        int num = (int) (Math.random() * (upper + 1 - lower)) + lower;
        num = num - (num % step);
        return num;
    }

    public void paint(Graphics g) {

        for (int i = 0, j = 0; i < 1800; i++, j += 20) {
            int size = randomRange(15, 30);
            g.setFont(new Font("Consolas", Font.ITALIC, size));
            int red = randomRange(0, 255);
            int green = randomRange(0, 255);
            int blue = randomRange(0, 255);
            g.setColor(new Color(red, green, blue));
            char ch = (char) (randomRange(65, 92));
            int x = randomRange(0, 1250);
            int y = randomRange(0, 550);

            g.drawString(Character.toString(ch), x, y);
            // g.drawString("" + x + " " + y, x, y);
        }

    }
}