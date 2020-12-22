import java.awt.*;
import java.awt.event.*;

class MouseListenerCircleRect extends Frame {
    MouseListenerCircleRect() {
        setSize(600, 600);
        setTitle("MouseListenerCircleRect");
        setLocation(700, 50);
        setLayout(new FlowLayout());

        addMouseListener(new MouseTester());

    }

    class MouseTester extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            int x = e.getX();
            int y = e.getY();
            setTitle("x=" + x + " y=" + y);
        }

    }

    public static void main(String[] args) {
        MouseListenerCircleRect frameObject = new MouseListenerCircleRect();
        frameObject.setVisible(true);
        frameObject.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frameObject.dispose();
            }
        });

    }
}