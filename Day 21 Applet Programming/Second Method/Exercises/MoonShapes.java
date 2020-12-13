/*
<applet code="MoonShapes.class" width="600" height="600">
</applet>

*/

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class MoonShapes extends Applet {
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
        int diff = 50;

        g.setColor(new Color(127, 127, 127));
        g.fillRect(0, 0, 600, 600);

        int x = 0, y = 0;
        int arcDiff = 360 / (6 * 5);
        int arcAngle = 0;
        for (int i = 0; i < 6; i++) { // for row

            x = 0;
            for (int j = 0; j < 5; j++) { // for column
                arcAngle += arcDiff;
                g.setColor(new Color(255, 255, 255));
                g.fillArc(x + diff / 2, y + diff / 2, 100 - diff, 100 - diff, 0, arcAngle);
                x += 100;
            }
            y += 100;

        }

    }
}


/*
<applet code="MoonShapes.class" width="400" height="600">
</applet>

*/

import java.applet.Applet;
import java.awt.Graphics;

public class MoonShapes extends Applet {
    public void paint(Graphics g) {

    }
}