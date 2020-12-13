/*
<applet code="My2DrawRect_5RectInOne.class" width="300" height="300">
</applet>

*/

// Set of 3 X 4 Matrices
import java.applet.Applet;
import java.awt.Graphics;

public class My2DrawRect_5RectInOne extends Applet {
    public void paint(Graphics g) {
        for (int i = 0, j = 0; i < 5; i++, j += 20) {
            g.drawRect(40 + j, 40 + j, 200 - 2 * j, 200 - 2 * j);
        }
    }
}