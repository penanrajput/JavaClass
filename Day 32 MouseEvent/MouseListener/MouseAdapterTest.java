import java.awt.*;
import java.awt.event.*;

class MouseAdapterTest extends Frame {
    MouseAdapterTest() {
        setSize(600, 600);
        setTitle("MouseAdapterTest");
        setLocation(700, 50);
        setLayout(new FlowLayout());
        addMouseListener(new MouseTester());

    }

    class MouseTester extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            int x = e.getX();
            int y = e.getY();
            Graphics g = getGraphics();
            g.setColor(Color.PINK);
            g.fillRect(x, y, 50, 50);
        }
    }

    public static void main(String[] args) {
        MouseAdapterTest frameObject = new MouseAdapterTest();
        frameObject.setVisible(true);
        frameObject.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frameObject.dispose();
            }
        });

    }
}