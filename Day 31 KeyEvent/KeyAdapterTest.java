import java.awt.*;
import java.awt.event.*;

class KeyAdapterTest extends Frame {
    int code;

    KeyAdapterTest() {
        setSize(600, 600);
        setTitle("KeyEventTest");
        setLocation(700, 50);
        setLayout(new FlowLayout());
        addKeyListener(new KeyTester());
    }

    class KeyTester extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            code = e.getKeyCode();
            repaint();
        }
    }

    public void paint(Graphics g) {
        if (code == KeyEvent.VK_R) {
            g.drawRect(50, 50, 100, 100);
        }
        if (code == KeyEvent.VK_C) {
            g.drawOval(50, 50, 100, 100);
        }
        if (code == KeyEvent.VK_L) {
            g.drawLine(50, 50, 100, 100);
        }
    }

    public static void main(String[] args) {
        KeyAdapterTest frameObject = new KeyAdapterTest();
        frameObject.setVisible(true);
        frameObject.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frameObject.dispose();
            }
        });

    }
}