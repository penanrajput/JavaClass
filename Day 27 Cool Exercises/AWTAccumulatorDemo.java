import java.awt.*;
import java.awt.event.*;

class AWTAccumulatorDemo extends Frame implements ActionListener {
    Label label1 = new Label("Enter the number : ");
    Label label2 = new Label("AccumulatedSum : ");
    Button btn = new Button("Add");
    TextField tf1 = new TextField(20);
    TextField tf2 = new TextField("0", 20);
    int sum = 0;

    AWTAccumulatorDemo() {
        setSize(300, 200);
        setTitle("AWTAccumulatorDemo");
        setLocation(700, 50);
        setLayout(new FlowLayout());

        add(label1);
        add(tf1);
        add(btn);
        add(label2);
        add(tf2);

        tf2.setEnabled(false);
        btn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == btn) {
            int num = Integer.parseInt(tf1.getText());
            tf1.setText("");
            sum += num;
            tf2.setText("" + sum);
        }
    }

    public static void main(String[] args) {
        AWTAccumulatorDemo frameObject = new AWTAccumulatorDemo();
        frameObject.setVisible(true);

    }
}