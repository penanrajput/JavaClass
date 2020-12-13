/*
<applet code="MyLifeCycle.class" width="400" height="600">
</applet>

*/

import java.applet.Applet;
import java.awt.Graphics;

public class MyLifeCycle extends Applet {
    int times = 1;

    public void init() {
        System.out.println("Applet initialized");
    }

    public void start() {
        System.out.println("Applet execution started");
    }

    public void stop() {
        System.out.println("Applet execution stopped");
    }

    // to see this effect, minimize the windows and reopen
    public void paint(Graphics g) {
        System.out.println("Painting...");
        g.fillRect(20, 20, 200, 200);
        g.drawLine(20, 240, 220, 240);
        g.drawString("This pait is called " + times + " times ", 20, 260);
        times++;

    }

    public void destroy() {
        System.out.println("Applet destroyed");
    }
}