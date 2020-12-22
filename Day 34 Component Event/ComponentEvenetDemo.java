import java.awt.*;
import java.awt.event.*;

class ComponentEvenetDemo extends Frame {

    ScrollPane scroll = new ScrollPane();
    Label msg = new Label("This is my ScrollPane Label msg and msg and msg and msg and msg");

    ComponentEvenetDemo() {
        setSize(600, 600);
        setTitle("ComponentEvenetDemo");
        setLocation(700, 50);
        setLayout(new FlowLayout());
        scroll.add(msg);
        scroll.setSize(300, 100);
        add(scroll);
        msg.addComponentListener(new ComponentComponentEvenetDemoer());
    }

    class ComponentComponentEvenetDemoer extends ComponentAdapter {

        public void componentResized(ComponentEvent e) {
            System.out.println("Component Resized");
        }

        public void componentMoved(ComponentEvent e) {
            System.out.println("Component Moved");
        }

        public void componentShown(ComponentEvent e) {
            System.out.println("Component Shown");
        }

        public void componentHidden(ComponentEvent e) {
            System.out.println("Component Hidden");
        }

    }

    public static void main(String[] args) {
        ComponentEvenetDemo frameObject = new ComponentEvenetDemo();
        frameObject.setVisible(true);
        frameObject.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frameObject.dispose();
            }
        });

    }
}