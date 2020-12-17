import java.awt.*;
import java.awt.event.*;

class EventGetSourceTest extends Frame implements ActionListener {
    // create Buttons
    Button b1 = new Button("Button 1");
    Button b2 = new Button("Button 2");
    Button b3 = new Button("Button 3");
    Label label = new Label("This is default text");

    EventGetSourceTest() {
        setSize(600, 600);
        setTitle("MyFrame");
        setLocation(700, 50);
        setLayout(new FlowLayout());

        add(b1);
        add(b2);
        add(b3);
        add(label);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == b1)
            label.setText("Button 1 is pressed");
        else if (obj == b2)
            label.setText("Button 2 is pressed");
        else if (obj == b3)
            label.setText("Button 3 is pressed");

    }

    public static void main(String[] args) {
        EventGetSourceTest frameObject = new EventGetSourceTest();
        frameObject.setVisible(true);

    }
}