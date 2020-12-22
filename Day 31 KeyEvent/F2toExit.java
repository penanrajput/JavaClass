import java.awt.*;
import java.awt.event.*;

class F2toExit extends Frame {
    F2toExit() {
        setSize(600, 600);
        setTitle("F2toExit");
        setLocation(700, 50);
        setLayout(new FlowLayout());
        addKeyListener(new KeyTester());

    }

    class KeyTester extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            int code = e.getKeyCode();
            if (code == KeyEvent.VK_F2) {
                System.out.println("Pressed F2");
                dispose();
            }
        }
    }

    public static void main(String[] args) {
        F2toExit frameObject = new F2toExit();
        frameObject.setVisible(true);
        frameObject.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frameObject.dispose();
            }
        });

    }
}