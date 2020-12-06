/*
<applet code="MyColorProject2Applet.class" width="400" height="600">
</applet>

*/

import java.applet.Applet;
import java.awt.*;

public class MyColorProject2Applet extends Applet {
    public int randomRange(int lower, int upper) {
        return (int) (Math.random() * (upper - lower)) + lower;
    }

    public void paint(Graphics g) {

        // g.setFont(new Font("Consolas", Font.ITALIC, 20));
        for (int i = 0, j = 0; i < 1600; i++, j += 20) {
            int red = randomRange(0, 255);
            int green = randomRange(0, 255);
            int blue = randomRange(0, 255);
            g.setColor(new Color(red, green, blue));
            char ch = (char) (randomRange(65, 92));
            int x = randomRange(25, 375);
            int y = randomRange(25, 575);

            g.drawString(Character.toString(ch), x, y);
            // g.drawString("" + x + " " + y, x, y);
        }

    }
}