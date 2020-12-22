import java.awt.*;
import java.awt.event.*;

class RandomNumberGenerator {
    public static int randomRange(int lower, int upper) {
        int num = (int) (Math.random() * (upper + 1 - lower)) + lower;
        return num;
    }
}

class MouseMotionAdapterTest2 extends Frame {
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

    MouseMotionAdapterTest2() {
        setSize(600, 600);
        setTitle("MouseMotionAdapterTest2");
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
        public void mouseClicked(MouseEvent e) {
            count++;
            if (count % 2 == 1) {
                initial_X = e.getX();
                initial_Y = e.getY();
                System.out.println(String.format("initial point line X=%d Y=%d", initial_X, initial_Y));

            } else {
                final_X = e.getX();
                final_Y = e.getY();
                System.out.println(String.format("  final point line X=%d Y=%d", final_X, final_Y));
                count = 0;
            }
            // count++;

            Graphics g = getGraphics();
            // red = RandomNumberGenerator.randomRange(0, 255);
            // green = RandomNumberGenerator.randomRange(0, 255);
            // blue = RandomNumberGenerator.randomRange(0, 255);

        }
    }

    class MouseMotionTester extends MouseMotionAdapter {
        @Override
        public void mouseMoved(MouseEvent e) {
            moved_X = e.getX();
            moved_Y = e.getY();
            // Graphics g = getGraphics();
            // System.out.println(g.getColor());
            // g.setColor(new Color(red, green, blue));
            if (count > 0 && count % 2 == 1)
                repaint();

        }
    }

    public static void main(String[] args) {
        MouseMotionAdapterTest2 frameObject = new MouseMotionAdapterTest2();
        frameObject.setVisible(true);
        frameObject.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frameObject.dispose();
            }
        });

    }
}