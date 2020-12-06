/*
<applet code="MyColorProjectApplet.class" width="450" height="600">
</applet>

*/

import java.applet.Applet;
import java.awt.*;

public class MyColorProjectApplet extends Applet {

    public int randomRange(int lower, int upper) {
        return (int) (Math.random() * (upper - lower)) + lower;
    }

    public void paint(Graphics g) {

        // g.setFont(new Font("Times New Roman", Font.BOLD, 20));
        g.setFont(new Font("Consolas", Font.BOLD, 20));
        // g.drawString("This is Line", 100, 20);
        // g.setColor(Color.RED);
        // g.drawString("This is Line", 100, 40);
        // g.setColor(Color.ORANGE);
        // g.drawString("This is Line", 100, 60);

        // g.setColor(Color.PINK);
        // g.drawString("This is Line", 100, 80);

        // g.setColor(Color.BLUE);
        // g.drawString("This is Line", 100, 100);

        // g.setColor(Color.GREEN);
        // g.drawString("This is Line", 100, 120);

        // g.setColor(Color.GRAY);
        // g.drawString("This is Line", 100, 140);

        // g.setColor(Color.DARK_GRAY);
        // g.drawString("This is Line", 100, 160);

        for (int i = 1, j = 0; i <= 20; i++, j += 30) {
            int red = randomRange(0, 255);
            int green = randomRange(0, 255);
            int blue = randomRange(0, 255);
            g.setColor(new Color(red, green, blue));
            g.drawString("" + i + " (" + red + ", " + green + ", " + blue + ") This is new Line", 30, 20 + j);
        }

        // g.drawString("This is Line", 10, 40);
        // g.drawString("This is Line", 10, 50);

        // g.drawString("This is Line", 10, 10);
        // g.drawString("This is Line", 10, 10);
        // g.drawString("This is Line", 10, 10);
        // g.drawString("This is Line", 10, 10);
        // g.drawString("This is Line", 10, 10);
    }
}