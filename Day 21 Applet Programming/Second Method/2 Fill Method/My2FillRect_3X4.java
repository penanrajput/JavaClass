/*
<applet code="My2FillRect_3X4.class" width="300" height="300">
</applet>

*/

// Set of 3 X 4 Matrices, filled with black color
import java.applet.Applet;
import java.awt.Graphics;

public class My2FillRect_3X4 extends Applet {
    public void paint(Graphics g) {
        g.fillRect(10, 20, 60, 80);
        g.fillRect(10, 110, 60, 80); // y = 20 + 80 = 100
        g.fillRect(10, 200, 60, 80); // y = 110 + 80 = 190

        // x = 10 + 60
        g.fillRect(80, 20, 60, 80);
        g.fillRect(80, 110, 60, 80); // y = 20 + 80 = 100
        g.fillRect(80, 200, 60, 80); // y = 110 + 80 = 190

        // x = 80 + 60 = 140
        g.fillRect(150, 20, 60, 80);
        g.fillRect(150, 110, 60, 80); // y = 20 + 80 = 100
        g.fillRect(150, 200, 60, 80); // y = 110 + 80 = 190

        // x = 140 + 60 = 200
        g.fillRect(220, 20, 60, 80);
        g.fillRect(220, 110, 60, 80); // y = 20 + 80 = 100
        g.fillRect(220, 200, 60, 80); // y = 110 + 80 = 190
    }
}