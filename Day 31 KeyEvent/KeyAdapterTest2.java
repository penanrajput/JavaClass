import java.awt.*;
import java.awt.event.*;

class KeyAdapterTest2 extends Frame {
    int code;
    int x = 50;
    int y = 50;
    int step = 15;

    KeyAdapterTest2() {
        setSize(600, 600);
        setTitle("KeyEventTest");
        setLocation(700, 50);
        setLayout(new FlowLayout());
        addKeyListener(new KeyTester());
    }

    class KeyTester extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            Graphics g = getGraphics();

            code = e.getKeyCode();
            if (code == KeyEvent.VK_DOWN) {
                g.setColor(new Color(255, 0, 0));
                g.drawLine(x, y, x, y + step);
                y += step;
            }
            if (code == KeyEvent.VK_UP) {
                g.setColor(new Color(0, 255, 0));
                g.drawLine(x, y, x, y - step);
                y -= step;
            }
            if (code == KeyEvent.VK_LEFT) {
                g.setColor(new Color(0, 0, 255));
                g.drawLine(x, y, x - step, y);
                x -= step;
            }
            if (code == KeyEvent.VK_RIGHT) {
                g.setColor(new Color(0, 0, 0));
                g.drawLine(x, y, x + step, y);
                x += step;
            }

        }
    }

    public static void main(String[] args) {
        KeyAdapterTest2 frameObject = new KeyAdapterTest2();
        frameObject.setVisible(true);
        frameObject.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frameObject.dispose();
            }
        });

    }
}