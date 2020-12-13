/*
<applet code="MyFont2.class" width="750" height="600">
</applet>

*/

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Font;
import java.awt.Color;

public class MyFont2 extends Applet {
    public static int randomRange(int lower, int upper) {
        int num = (int) (Math.random() * (upper + 1 - lower)) + lower;
        return num;
    }

    public void paint(Graphics g) {
        String str = "Penan is Good boy and hardworking";
        String[] arrOfStr = str.split(" ", -2);
        String fonts[] = { "Arial", "Times New Roman", "Consolas", "Ubuntu Mono" };
        for (int k = 0, height = 0; k < 5; k++, height += 40) {
            for (int i = 0, j = 0; i < str.length(); i++, j += 20) {
                int style = randomRange(0, 3);
                int point = randomRange(20, 30);
                int font = randomRange(0, fonts.length);
                g.setFont(new Font(fonts[0], style, point));
                int red = randomRange(0, 255);
                int green = randomRange(0, 255);
                int blue = randomRange(0, 255);
                g.setColor(new Color(red, green, blue));
                g.drawString(Character.toString(str.charAt(i)), 30 + j, 50 + height);
            }
        }

        for (int k = 0, height = 0; k < 5; k++, height += 40) {
            for (int i = 0, j = 0; i < arrOfStr.length; i++) {
                int style = randomRange(0, 3);
                int point = randomRange(20, 30);
                int font = randomRange(0, fonts.length);
                g.setFont(new Font(fonts[0], style, point));
                int red = randomRange(0, 255);
                int green = randomRange(0, 255);
                int blue = randomRange(0, 255);
                g.setColor(new Color(red, green, blue));
                if (i > 0) {
                    j = j + 20 * arrOfStr[i - 1].length();
                }
                g.drawString(arrOfStr[i], 30 + j, 300 + height);
            }
        }

    }
}