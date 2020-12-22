import java.awt.*;
import java.awt.event.*;

class ComponentEventDemo extends Frame {
    Button button1 = new Button("OK HELLO HI");
    Button button2 = new Button("OK HELLO HI");
    Button button3 = new Button("OK HELLO HI");

    Panel p1 = new Panel();
    Panel p2 = new Panel();
    Panel p3 = new Panel();

    ComponentEventDemo() {
        setSize(600, 600);
        setTitle("MyFrame");
        setLocation(700, 50);
        setLayout(new GridLayout(3, 1));
        // add(button1);
        // add(button2);
        // add(button3);

        p1.add(button1);
        p2.add(button2);
        p3.add(button3);

        add(p1);
        add(p2);
        add(p3);

        p1.addComponentListener(new ComponentComponentEventDemoer());
    }

    class ComponentComponentEventDemoer implements ComponentListener {

        public void componentShown(ComponentEvent e) {
            System.out.println("Component Shown");
        }

        public void componentHidden(ComponentEvent e) {
            System.out.println("Component Hidden");
        }

        public void componentResized(ComponentEvent e) {
            System.out.println("Component Resized");
        }

        public void componentMoved(ComponentEvent e) {
            System.out.println("Component Moved");
        }

    }

    public static void main(String[] args) {
        ComponentEventDemo frameObject = new ComponentEventDemo();
        frameObject.setVisible(true);
        frameObject.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frameObject.dispose();
            }
        });

    }
}