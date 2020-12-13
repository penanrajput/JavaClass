/*
<applet code="My3DrawRoundRect1.class" width="300" height="300">
</applet>

*/

// Set of 3 X 4 Matrices
import java.applet.Applet;
import java.awt.Graphics;

public class My3DrawRoundRect1 extends Applet {
    public void paint(Graphics g) {
        int round = 10;
        g.drawRoundRect(10, 20, 60, 80, round, round);
        round += 5;
        g.drawRoundRect(10, 110, 60, 80, round, round); // y = 20 + 80 = 100
        round += 5;
        g.drawRoundRect(10, 200, 60, 80, round, round); // y = 110 + 80 = 190
        round += 5;

        // x = 10 + 60
        g.drawRoundRect(80, 20, 60, 80, round, round);
        round += 5;
        g.drawRoundRect(80, 110, 60, 80, round, round); // y = 20 + 80 = 100
        round += 5;
        g.drawRoundRect(80, 200, 60, 80, round, round); // y = 110 + 80 = 190
        round += 5;

        // x = 80 + 60 = 140
        round += 5;
        g.drawRoundRect(150, 20, 60, 80, round, round);
        round += 5;
        g.drawRoundRect(150, 110, 60, 80, round, round); // y = 20 + 80 = 100
        round += 5;
        g.drawRoundRect(150, 200, 60, 80, round, round); // y = 110 + 80 = 190
        round += 5;

        // x = 140 + 60 = 200

        g.drawRoundRect(220, 20, 60, 80, round, round);
        round += 5;
        g.drawRoundRect(220, 110, 60, 80, round, round); // y = 20 + 80 = 100
        round += 5;
        g.drawRoundRect(220, 200, 60, 80, round, round); // y = 110 + 80 = 190
    }
}