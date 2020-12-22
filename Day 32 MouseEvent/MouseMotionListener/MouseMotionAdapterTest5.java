import java.awt.*;
import java.awt.event.*;

class RandomNumberGenerator {
    public static int randomRange(int lower, int upper) {
        int num = (int) (Math.random() * (upper + 1 - lower)) + lower;
        return num;
    }
}

class MouseMotionAdapterTest5 extends Frame {
    int initial_X;
    int initial_Y;
    int final_X;
    int final_Y;
    int moved_X;
    int moved_Y;

    int red;
    int green;
    int blue;

    int count;

    MouseMotionAdapterTest5() {
        setSize(600, 600);
        setTitle("MouseMotionAdapterTest5");
        setLocation(700, 50);
        setLayout(new FlowLayout());
        addMouseMotionListener(new MouseMotionTester());
        addMouseListener(new MouseTester());
    }

    @Override
    public void paint(Graphics g) {
        g.drawLine(initial_X, initial_Y, moved_X, moved_Y);
    }

    class MouseTester extends MouseAdapter {

        @Override
        public void mousePressed(MouseEvent e) {
            initial_X = e.getX();
            initial_Y = e.getY();
            System.out.println(String.format("initial point line X=%d Y=%d", initial_X, initial_Y));
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            // TODO Auto-generated method stub
            final_X = e.getX();
            final_Y = e.getY();
            System.out.println(String.format("  final point line X=%d Y=%d", final_X, final_Y));
            Graphics g = getGraphics();
            // g.fillOval(initial_X, initial_Y, moved_X - initial_X, moved_Y - initial_Y);
            g.drawLine(initial_X, initial_Y, final_X, final_Y);
        }
    }

    class MouseMotionTester extends MouseMotionAdapter {
        @Override
        public void mouseDragged(MouseEvent e) {

            moved_X = e.getX();
            moved_Y = e.getY();

            // System.out.println(g.getColor());
            // g.setColor(new Color(red, green, blue));

            repaint();

            // Graphics g = getGraphics();
            // g.drawLine(initial_X, initial_Y, moved_X, moved_Y);
        }
    }

    public static void main(String[] args) {
        MouseMotionAdapterTest5 frameObject = new MouseMotionAdapterTest5();
        frameObject.setVisible(true);
        frameObject.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frameObject.dispose();
            }
        });

    }
}