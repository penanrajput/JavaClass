/*
<applet code="My2DrawRect.class" width="300" height="300">
</applet>

*/

// Set of 3 X 4 Matrices
import java.applet.Applet;
import java.awt.Graphics;

public class My2DrawRect extends Applet {
    public void paint(Graphics g) {
        g.drawRect(10, 20, 60, 80);
        g.drawRect(10, 110, 60, 80); // y = 20 + 80 = 100
        g.drawRect(10, 200, 60, 80); // y = 110 + 80 = 190

        // x = 10 + 60
        g.drawRect(80, 20, 60, 80);
        g.drawRect(80, 110, 60, 80); // y = 20 + 80 = 100
        g.drawRect(80, 200, 60, 80); // y = 110 + 80 = 190

        // x = 80 + 60 = 140
        g.drawRect(150, 20, 60, 80);
        g.drawRect(150, 110, 60, 80); // y = 20 + 80 = 100
        g.drawRect(150, 200, 60, 80); // y = 110 + 80 = 190

        // x = 140 + 60 = 200
        g.drawRect(220, 20, 60, 80);
        g.drawRect(220, 110, 60, 80); // y = 20 + 80 = 100
        g.drawRect(220, 200, 60, 80); // y = 110 + 80 = 190
    }
}