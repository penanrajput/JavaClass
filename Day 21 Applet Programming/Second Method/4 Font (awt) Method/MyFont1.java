/*
<applet code="MyFont1.class" width="750" height="600">
</applet>

*/

import java.applet.Applet;
import java.awt.*;

public class MyFont1 extends Applet {
    public static int randomRange(int lower, int upper) {
        int num = (int) (Math.random() * (upper + 1 - lower)) + lower;
        return num;
    }

    public void paint(Graphics g) {
        String str = "Penan is Good boy and hardworking";
        String fonts[] = { "Arial", "Times New Roman", "Consolas", "Ubuntu Mono", "Calibri", "Constantia", "Corbel",
                "Courier New", "Georgia", "Lucida Sans Unicode", "MS Gothic", "Segoe UI", "Tahoma", "Trebuchet MS",
                "Verdana", "Sitka", "SimSun", "SimSun", "Impact", "Gabriola" };

        for (int i = 0, j = 0; i < fonts.length; i++, j += 30) {

            g.setFont(new Font(fonts[i], 0, 20));
            int red = randomRange(0, 255);
            int green = randomRange(0, 255);
            int blue = randomRange(0, 255);
            g.setColor(new Color(red, green, blue));

            g.drawString(fonts[i] + " - " + str, 30, 20 + j);
        }

    }
}