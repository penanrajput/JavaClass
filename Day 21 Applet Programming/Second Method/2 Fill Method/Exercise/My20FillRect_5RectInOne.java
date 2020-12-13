/*
<applet code="My20FillRect_5RectInOne.class" width="300" height="500">
</applet>

*/

// Set of 3 X 4 Matrices
import java.applet.Applet;
import java.awt.Graphics;

public class My20FillRect_5RectInOne extends Applet {
    public void paint(Graphics g) {
        int height = 40;
        for (int i = 0, j = 0; i < 5; i++, j += 20) {

            g.fillRect(40, height, 20 + j, 20 + j);
            height += 40 + j;
        }
    }
}