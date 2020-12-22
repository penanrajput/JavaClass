import java.awt.*;
import java.awt.event.*;

class MouseMotionAdapterTest extends Frame {

    MouseMotionAdapterTest() {
        setSize(600, 600);
        setTitle("MouseMotionAdapterTest");
        setLocation(700, 50);
        setLayout(new FlowLayout());
        addMouseMotionListener(new MouseMotionTester());

    }

    class MouseMotionTester extends MouseMotionAdapter {
        @Override
        public void mouseMoved(MouseEvent e) {
            int x = e.getX();
            int y = e.getY();
            System.out.println("x=" + x + " y=" + y);

        }
    }

    public static void main(String[] args) {
        MouseMotionAdapterTest frameObject = new MouseMotionAdapterTest();
        frameObject.setVisible(true);
        frameObject.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frameObject.dispose();
            }
        });

    }
}