import java.awt.*;
import java.awt.event.*;

class UpperLowerCaseDemo extends Frame implements ActionListener {
    Panel center = new Panel();
    // TextField tf = new TextField(20);
    TextArea tf = new TextArea(5, 20);
    Button lower = new Button("lower");
    Button upper = new Button("UPPER");

    UpperLowerCaseDemo() {
        setSize(200, 300);
        setTitle("UpperLowerCaseDemo");
        setLocation(700, 50);

        // add(new Button("North Button"), "North");

        center.add(tf);
        center.add(lower);
        center.add(upper);
        add(center);

        lower.addActionListener(this);
        upper.addActionListener(this);

        // add(new Button("South Button"), "South");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand();
        tf.setText(str.equals("lower") ? tf.getText().toLowerCase() : tf.getText().toUpperCase());
    }

    public static void main(String[] args) {
        UpperLowerCaseDemo frameObject = new UpperLowerCaseDemo();
        frameObject.setVisible(true);

    }
}