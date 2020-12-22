import java.awt.*;
import java.awt.event.*;

class KeyAdapterTest1 extends Frame {
    int code;
    int x = 50;
    int y = 50;
    int step = 15;

    KeyAdapterTest1() {
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
                g.drawLine(x, y, x, y + step);
                y += step;
            }
            if (code == KeyEvent.VK_UP) {
                g.drawLine(x, y, x, y - step);
                y -= step;
            }
            if (code == KeyEvent.VK_LEFT) {
                g.drawLine(x, y, x - step, y);
                x -= step;
            }
            if (code == KeyEvent.VK_RIGHT) {
                g.drawLine(x, y, x + step, y);
                x += step;
            }

        }
    }

    public static void main(String[] args) {
        KeyAdapterTest1 frameObject = new KeyAdapterTest1();
        frameObject.setVisible(true);
        frameObject.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frameObject.dispose();
            }
        });

    }
}