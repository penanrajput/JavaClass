import java.awt.*;
import java.awt.event.*;

class EventGetSetSourceCommandTest extends Frame implements ActionListener {
    // create Buttons
    Button b1 = new Button("Button 1");
    Button b2 = new Button("Button 2");
    Button b3 = new Button("Button 3");
    Label label = new Label("This is default text");

    EventGetSetSourceCommandTest() {
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

        b1.setActionCommand("btn1");
        b2.setActionCommand("btn2");
        b3.setActionCommand("btn3");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand();
        if (str.equals("btn1"))
            label.setText("Button 1 is pressed");
        if (str.equals("btn2"))
            label.setText("Button 2 is pressed");
        if (str.equals("btn3"))
            label.setText("Button 3 is pressed");
    }

    public static void main(String[] args) {
        EventGetSetSourceCommandTest frameObject = new EventGetSetSourceCommandTest();
        frameObject.setVisible(true);

    }
}