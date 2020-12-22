import java.awt.*;
import java.awt.event.*;

class RandomNumberGenerator {
    public static int randomRange(int lower, int upper) {
        int num = (int) (Math.random() * (upper + 1 - lower)) + lower;
        return num;
    }
}

class MouseMotionAdapterTest1 extends Frame {
    int initial_X;
    int initial_Y;
    int final_X;
    int final_Y;
    int dragged_X;
    int dragged_Y;

    int red;
    int green;
    int blue;

    MouseMotionAdapterTest1() {
        setSize(600, 600);
        setTitle("MouseMotionAdapterTest1");
        setLocation(700, 50);
        setLayout(new FlowLayout());
        addMouseMotionListener(new MouseMotionTester());
        addMouseListener(new MouseTester());

    }

    // @Override
    // public void paint(Graphics g) {
    // // TODO Auto-generated method stub
    // int red = RandomNumberGenerator.randomRange(0, 255);
    // int green = RandomNumberGenerator.randomRange(0, 255);
    // int blue = RandomNumberGenerator.randomRange(0, 255);
    // g.setColor(new Color(red, green, blue));
    // System.out.println("init Color " + g.getColor());
    // }

    class MouseTester extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            initial_X = e.getX();
            initial_Y = e.getY();
            Graphics g = getGraphics();
            red = RandomNumberGenerator.randomRange(0, 255);
            green = RandomNumberGenerator.randomRange(0, 255);
            blue = RandomNumberGenerator.randomRange(0, 255);

        }
    }

    class MouseMotionTester extends MouseMotionAdapter {
        @Override
        public void mouseMoved(MouseEvent e) {
            dragged_X = e.getX();
            dragged_Y = e.getY();
            Graphics g = getGraphics();
            // System.out.println(g.getColor());
            g.setColor(new Color(red, green, blue));
            g.drawLine(initial_X, initial_Y, dragged_X, dragged_Y);

        }
    }

    public static void main(String[] args) {
        MouseMotionAdapterTest1 frameObject = new MouseMotionAdapterTest1();
        frameObject.setVisible(true);
        frameObject.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frameObject.dispose();
            }
        });

    }
}