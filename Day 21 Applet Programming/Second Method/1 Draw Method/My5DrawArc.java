
/*
<applet code="My5DrawArc.class" width="400" height="600">
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

public class aMy5DrawArc extends Applet {
        public void paint(Graphics g) {
                g.drawArc(80, 60, 100, 100, 0, 180);
                g.drawArc(180, 60, 100, 100, 0, -180);

                g.drawArc(80, 200, 100, 100, 0, 180);
                g.drawArc(180, 200, 100, 100, 180, 180);

        }
}