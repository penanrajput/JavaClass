import java.awt.*;
import java.awt.event.*;

class RandomNumberGenerator {
    public static int randomRange(int lower, int upper) {
        int num = (int) (Math.random() * (upper + 1 - lower)) + lower;
        return num;
    }
}

class MouseMotionAdapterTest3 extends Frame {
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

    MouseMotionAdapterTest3() {
        setSize(600, 600);
        setTitle("MouseMotionAdapterTest3");
        setLocation(700, 50);
        setLayout(new FlowLayout());
        addMouseMotionListener(new MouseMotionTester());
        addMouseListener(new MouseTester());

    }

    @Override
    public void paint(Graphics g) {
        // g.drawOval(initial_X, initial_Y, moved_X - initial_X, moved_Y - initial_Y);
        g.drawRect(initial_X, initial_Y, moved_X - initial_X, moved_Y - initial_Y);
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
                Graphics g = getGraphics();
                // g.fillOval(initial_X, initial_Y, moved_X - initial_X, moved_Y - initial_Y);
                g.fillRect(initial_X, initial_Y, moved_X - initial_X, moved_Y - initial_Y);

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
        MouseMotionAdapterTest3 frameObject = new MouseMotionAdapterTest3();
        frameObject.setVisible(true);
        frameObject.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frameObject.dispose();
            }
        });

    }
}