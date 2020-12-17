import java.awt.*;
import java.awt.event.*;
import java.util.EventObject;

// inner Class
class EventThisTest extends Frame implements ActionListener {

    Button button = new Button("Ok");

    EventThisTest() {
        setSize(600, 600);
        setTitle("EventThisTest");
        setLocation(700, 50);
        setLayout(new FlowLayout());

        add(button);

        button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        Object eo = e.getSource();
        if (eo == button) {
            System.out.println("OK Button Pressed");
        }
    }

    public static void main(String[] args) {
        EventThisTest frameObject = new EventThisTest();
        frameObject.setVisible(true);

    }
}