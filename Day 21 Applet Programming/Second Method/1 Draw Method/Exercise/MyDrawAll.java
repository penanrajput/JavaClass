/*
<applet code="MyDrawApplet.class" width="400" height="600">
</applet>

*/

import java.applet.Applet;
import java.awt.Graphics;

public class MyDrawApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("This is my First Program", 30, 200);
        g.drawLine(70, 100, 180, 100);
        g.drawLine(10, 150, 100, 150);

        // parameters (x, y, width, height)
        // for (int i = 0; i < 50; i += 5) {
        // g.drawRect(20 + i, 20 + i, 100 - 2 * i, 90 - 2 * i);
        // }
        g.drawRect(20, 20, 100, 90);
        g.drawRect(25, 25, 90, 80);
        g.drawRect(30, 30, 80, 70);
        g.drawRect(35, 35, 70, 60);
        g.drawRect(40, 40, 60, 50);

        g.drawRect(45, 45, 50, 40);
        g.drawRect(50, 50, 40, 30);
        g.drawRect(55, 55, 30, 20);
        g.drawRect(60, 60, 20, 10);
        g.drawRect(65, 65, 10, 00);

        // to draw Oval/ Circle/
        // same parameters like Rect
        // parameters (x, y, width, height)
        g.drawOval(150, 150, 200, 120);
        g.drawOval(155, 155, 190, 110);
        g.drawOval(160, 160, 180, 100);
        g.drawOval(165, 165, 170, 90);
        g.drawOval(170, 170, 160, 80);

        g.drawOval(175, 175, 150, 70);
        g.drawOval(180, 180, 140, 60);
        g.drawOval(185, 185, 130, 50);
        g.drawOval(190, 190, 120, 40);
        g.drawOval(195, 195, 110, 30);
        g.drawString("CIRCLE", 230, 215);

        // drawRoundRect
        // g.drawRoundRect(x, y, width, height, arcWidth, arcHeight);
        // arcWidth, arcHeight are diammeters
        // if arcWidth (x-axis) = 80
        // arc made on arcWidth/2 = 80/2 = 40
        // at 40 it will cut and arc will be made

        // RoundRect will be circle / oval
        // whem arcWidth = x and archeight = y
        // please dont use like arcWidth > x and archeight > y
        g.drawRoundRect(20, 250, 200, 100, 60, 20);
        g.drawRoundRect(20, 250, 200, 100, 220, 110);

        g.drawRoundRect(20, 370, 200, 100, 200, 100);

        // drawArc
        // g.drawArc(x, y, width, height, startAngle, arcAngle)
        g.drawArc(250, 270, 100, 100, 0, 360);
        g.drawArc(250, 370, 100, 100, 180, 180);
        g.drawArc(250, 370, 100, 100, 180, 180);

        // Wifi Signal
        g.drawArc(250, 500, 100, 100, 30, 120);
        g.drawArc(260, 510, 80, 80, 30, 120);
        g.drawArc(270, 520, 60, 60, 30, 120);
        g.drawArc(280, 530, 40, 40, 30, 120);
        g.drawArc(290, 540, 20, 20, 30, 120);

    }
}

// If line passes the cordinate of Applet, it get clipped, not shown