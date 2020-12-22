import java.awt.*;
import java.awt.event.*;

class Test extends Frame {
    Button button1 = new Button("OK HELLO HI");
    Button button2 = new Button("OK HELLO HI");
    Button button3 = new Button("OK HELLO HI");

    Panel p1 = new Panel();
    Panel p2 = new Panel();
    Panel p3 = new Panel();

    Test() {
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

        button1.addActionListener(new ActionTester());
        button2.addActionListener(new ActionTester());
    }

    class ActionTester implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Button b = (Button) e.getSource();
            if (b == button1) {
                remove(p3);
            }
            if (b == button2) {
                add(p3);
            }
        }
    }

    public static void main(String[] args) {
        Test frameObject = new Test();
        frameObject.setVisible(true);
        frameObject.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frameObject.dispose();
            }
        });

    }
}