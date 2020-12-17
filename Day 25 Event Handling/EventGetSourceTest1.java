import java.awt.*;
import java.awt.event.*;

class EventGetSourceTest1 extends Frame implements ActionListener {
    // create Buttons
    Button b1 = new Button("Cyan");
    Button b2 = new Button("Pink");
    Button b3 = new Button("Light Gray");

    EventGetSourceTest1() {
        setSize(600, 600);
        setTitle("EventGetSourceTest1");
        setLocation(700, 50);
        setLayout(new FlowLayout());
        add(new Label("Click Buttons to Change Background"));
        add(b1);
        add(b2);
        add(b3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == b1)
            setBackground(Color.CYAN);
        else if (obj == b2)
            setBackground(Color.PINK);
        else if (obj == b3)
            setBackground(Color.LIGHT_GRAY);

    }

    public static void main(String[] args) {
        EventGetSourceTest1 frameObject = new EventGetSourceTest1();
        frameObject.setVisible(true);

    }
}