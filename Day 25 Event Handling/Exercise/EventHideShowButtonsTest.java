import java.awt.*;
import java.awt.event.*;

class EventHideShowButtonsTest extends Frame {
    Button ok = new Button("Ok");
    Button b1 = new Button("Info Planet");

    EventHideShowButtonsTest() {
        setSize(600, 600);
        setTitle("MyFrame");
        setLocation(700, 50);
        setLayout(new FlowLayout());

        add(ok);
        add(b1);

        ok.addActionListener(new ActionListener() {
            // b1.getVisible();
            @Override
            public void actionPerformed(ActionEvent e) {
                b1.setVisible(!b1.isVisible());
            }
        });

    }

    public static void main(String[] args) {
        EventHideShowButtonsTest frameObject = new EventHideShowButtonsTest();
        frameObject.setVisible(true);

    }
}