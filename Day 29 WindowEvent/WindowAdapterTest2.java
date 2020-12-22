import java.awt.*;
import java.awt.event.*;

class WindowAdapterTest2 extends Frame {

    WindowAdapterTest2() {
        setSize(600, 600);
        setTitle("WindowAdapterTest2");
        setLocation(700, 50);
        addWindowListener(new WindowTester());
    }

    class WindowTester extends WindowAdapter {

        @Override
        public void windowDeactivated(WindowEvent e) {
            setBackground(Color.RED);
        }

        @Override
        public void windowActivated(WindowEvent e) {
            setBackground(Color.GREEN);
        }

        @Override
        public void windowClosing(WindowEvent e) {
            setBackground(Color.PINK);
            System.out.println("Window closing");

        }
    }

    public static void main(String[] args) {
        WindowAdapterTest2 frameObject = new WindowAdapterTest2();
        frameObject.setVisible(true);

    }
}