import java.awt.*;
import java.awt.event.*;

class WindowEventTest1 extends Frame {

    WindowEventTest1() {
        setSize(600, 600);
        setTitle("WindowEventTest1");
        setLocation(700, 50);
        setLayout(new FlowLayout());
        addWindowListener(new WindowTester());

    }

    // inner class
    class WindowTester implements WindowListener {
        @Override
        public void windowOpened(WindowEvent e) {
            System.out.println("Window Opened");
        }

        @Override
        public void windowClosing(WindowEvent e) {
            dispose();
        }

        @Override
        public void windowClosed(WindowEvent e) {
            System.out.println("Window Closed");
        }

        @Override
        public void windowIconified(WindowEvent e) {
            System.out.println("Window Iconified");
        }

        @Override
        public void windowDeiconified(WindowEvent e) {
            System.out.println("Window Deiconofied");
        }

        @Override
        public void windowActivated(WindowEvent e) {
            System.out.println("Window Activated");
        }

        @Override
        public void windowDeactivated(WindowEvent e) {
            System.out.println("Window Deactivated");

        }

    }

    public static void main(String[] args) {
        WindowEventTest1 frameObject = new WindowEventTest1();
        frameObject.setVisible(true);

    }
}