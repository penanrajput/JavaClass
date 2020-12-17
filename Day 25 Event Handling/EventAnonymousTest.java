import java.awt.*;
import java.awt.event.*;
import java.util.EventObject;

// inner Class
class EventAnonymousTest extends Frame {

    Button button = new Button("Ok");

    EventAnonymousTest() {
        setSize(600, 600);
        setTitle("EventAnonymousTest");
        setLocation(700, 50);
        setLayout(new FlowLayout());

        add(button);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Object eo = e.getSource();
                if (eo == button) {
                    System.out.println("OK Button Pressed");
                }
            }
        });
    }

    public static void main(String[] args) {
        EventAnonymousTest frameObject = new EventAnonymousTest();
        frameObject.setVisible(true);

    }
}