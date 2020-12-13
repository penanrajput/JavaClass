/*
<applet code="My30FilloundRect1.class" width="400" height="500">
</applet>

*/

// Set of 3 X 4 Matrices
import java.applet.Applet;
import java.awt.Graphics;

public class My30FilloundRect1 extends Applet {
    public void paint(Graphics g) {
        int round = 0;
        int x = 0;
        int y = 20;

        for (int i = 0; i < 4; i++) {
            // for row
            round += 20;
            x = 20;

            for (int j = 0; j < 3; j++) {
                // column
                g.fillRoundRect(x, y, 75, 75, 20, 20);
                round += 5;
                x += 90;
            }
            y += 100;
        }
    }
}