/*
<applet code="My50DrawArc.class" width="400" height="600">
</applet>

*/
/*
        Start Angle()
        90
180              0
        270

        same as 

        -270
-180            0
        -90


        ArcAngle()
 anti-clockwise: positive (0, 360)
 clockwise : right to left (0, -360) 

*/

import java.applet.Applet;
import java.awt.Graphics;

public class My50DrawArc extends Applet {
        public void paint(Graphics g) {
                for (int i = 0, j = 0; i < 5; i++, j += 10) {
                        g.drawArc(80 + j, 60 + j, 100 - 2 * j, 100 - 2 * j, 180, 90);
                }

        }
}