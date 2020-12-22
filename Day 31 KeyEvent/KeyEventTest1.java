import java.awt.*;
import java.awt.event.*;

class KeyEventTest1 extends Frame implements KeyListener {

    KeyEventTest1() {
        setSize(600, 600);
        setTitle("KeyEventTest1");
        setLocation(700, 50);
        setLayout(new FlowLayout());

        addKeyListener(this);

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        Graphics g = getGraphics();
        g.drawRect(50, 50, 100, 100);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        Graphics g = getGraphics();
        g.drawOval(50, 50, 100, 100);
    }

    public static void main(String[] args) {
        KeyEventTest1 frameObject = new KeyEventTest1();
        frameObject.setVisible(true);

        frameObject.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frameObject.dispose();
            }
        });

    }
}