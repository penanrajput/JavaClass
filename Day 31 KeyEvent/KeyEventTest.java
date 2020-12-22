import java.awt.*;
import java.awt.event.*;

class KeyEventTest extends Frame implements KeyListener {

    KeyEventTest() {
        setSize(600, 600);
        setTitle("KeyEventTest");
        setLocation(700, 50);
        setLayout(new FlowLayout());

        addKeyListener(this);

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Key Pressed");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Key Released");
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("Key Typed");
        // setBackground(Color.PINK);
    }

    public static void main(String[] args) {
        KeyEventTest frameObject = new KeyEventTest();
        frameObject.setVisible(true);

        frameObject.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frameObject.dispose();
            }
        });

    }
}