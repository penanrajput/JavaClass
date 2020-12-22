import java.awt.*;
import java.awt.event.*;

class WindowEventLeftRightClick extends Frame {
    WindowEventLeftRightClick() {
        setSize(600, 600);
        setTitle("WindowEventLeftRightClick");
        setLocation(700, 50);
        setLayout(new FlowLayout());

        addMouseListener(new MouseAdapterTest());
    }

    class MouseAdapterTest extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            int x = e.getModifiers();
            if ((x & InputEvent.BUTTON1_MASK) != 0) {
                // code for left click
                System.out.println("Left Button Clicked");
            }

            if ((x & InputEvent.BUTTON3_MASK) != 0) {
                // code for right click
                System.out.println("Right Button Clicked");
            }
        }
    }

    public static void main(String[] args) {
        WindowEventLeftRightClick frameObject = new WindowEventLeftRightClick();
        frameObject.setVisible(true);
        frameObject.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frameObject.dispose();
            }
        });

    }
}