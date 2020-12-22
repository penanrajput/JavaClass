import java.awt.*;
import java.awt.event.*;

class ShiftF2toExit extends Frame {
    ShiftF2toExit() {
        setSize(600, 600);
        setTitle("ShiftF2toExit");
        setLocation(700, 50);
        setLayout(new FlowLayout());
        addKeyListener(new KeyTester());

    }

    class KeyTester extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            int code = e.getKeyCode();
            if (code == KeyEvent.VK_F2 && e.isShiftDown()) {
                System.out.println("Pressed F2");
                dispose();
            }
        }
    }

    public static void main(String[] args) {
        ShiftF2toExit frameObject = new ShiftF2toExit();
        frameObject.setVisible(true);
        frameObject.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frameObject.dispose();
            }
        });

    }
}