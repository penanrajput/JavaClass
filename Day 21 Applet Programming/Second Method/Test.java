/*
<applet code="Test.class" width="400" height="600">
</applet>

*/

import java.applet.Applet;
import java.awt.Graphics;

public class Test extends Applet {

    public void init() {
        System.out.println("Applet initialized");
    }

    public void start() {
        System.out.println("Applet execution started");
    }

    public void stop() {
        System.out.println("Applet execution stopped");
    }

    public void paint(Graphics g) {
        System.out.println("Painting...")
    }

    public void destroy() {
        System.out.println("Applet destroyed");
    }
}