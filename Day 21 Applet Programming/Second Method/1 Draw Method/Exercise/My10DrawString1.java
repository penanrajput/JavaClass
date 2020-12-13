
/*
<applet code="My10DrawString1.java" width = 400 height = 400>
</applet>
*/

// This prints Ten lines in a row
import java.awt.*;
import java.applet.Applet;

public class My10DrawString1 extends Applet {
	public void paint(Graphics g) {

		int n = 10;
		for (int i = 1, j = 0; i <= n; i++, j += 20) {
			g.drawString("this is line number : " + i, 20, 20 + j);
		}
	}
}
