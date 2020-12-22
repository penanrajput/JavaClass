import java.awt.*;
import java.awt.event.*;

class MouseListenerDemo extends Frame implements MouseListener {
    MouseListenerDemo() {
        setSize(600, 600);
        setTitle("MouseListenerDemo");
        setLocation(700, 50);
        setLayout(new FlowLayout());
        addMouseListener(this);
    }

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

    public static void main(String[] args) {
        MouseListenerDemo frameObject = new MouseListenerDemo();
        frameObject.setVisible(true);
        frameObject.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frameObject.dispose();
            }
        });

    }
}