import java.awt.*;
import java.awt.event.*;

class MouseListenerDemo1 extends Frame {
    MouseListenerDemo1() {
        setSize(600, 600);
        setTitle("MouseListenerDemo1");
        setLocation(700, 50);
        setLayout(new FlowLayout());
        addMouseListener(new MouseTester());
    }

    class MouseTester implements MouseListener {
        public void mousePressed(MouseEvent e) {

        }

        public void mouseReleased(MouseEvent e) {

        }

        public void mouseClicked(MouseEvent e) {
            int x = e.getX();
            int y = e.getY();
            setTitle("x=" + x + " y=" + y);
        }

        public void mouseEntered(MouseEvent e) {

        }

        public void mouseExited(MouseEvent e) {

        }

    }

    public static void main(String[] args) {
        MouseListenerDemo1 frameObject = new MouseListenerDemo1();
        frameObject.setVisible(true);
        frameObject.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frameObject.dispose();
            }
        });

    }
}