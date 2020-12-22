import java.awt.*;
import java.awt.event.*;

class MouseAdapterTest1 extends Frame {
    MouseAdapterTest1() {
        setSize(600, 600);
        setTitle("MouseAdapterTest1");
        setLocation(700, 50);
        setLayout(new FlowLayout());
        addMouseListener(new MouseTester());

    }

    class MouseTester extends MouseAdapter {
        @Override
        public void mouseReleased(MouseEvent e) {
            int x = e.getX();
            int y = e.getY();
            int c = e.getClickCount();
            Graphics g = getGraphics();
            if (c == 1) {
                g.setColor(Color.BLUE);
                g.drawRect(x, y, 50, 50);
            }
            if (c == 2) {
                g.setColor(Color.PINK);
                g.fillOval(x, y, 50, 50);
            }
        }
    }

    public static void main(String[] args) {
        MouseAdapterTest1 frameObject = new MouseAdapterTest1();
        frameObject.setVisible(true);
        frameObject.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frameObject.dispose();
            }
        });

    }
}