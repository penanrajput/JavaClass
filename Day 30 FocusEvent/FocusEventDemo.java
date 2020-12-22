import java.awt.*;
import java.awt.event.*;

class FocusEventDemo extends Frame implements FocusListener {
    FocusEventDemo() {
        setSize(600, 600);
        setTitle("FocusEventDemo");
        setLocation(700, 50);
        setLayout(new FlowLayout());
        Button sureButton = new Button("Are u sure ?");
        Button button = new Button("OK");
        Button cancel = new Button("Cancel");
        add(sureButton);
        add(button);
        add(cancel);
        button.addFocusListener(this);
    }

    @Override
    public void focusGained(FocusEvent e) {
        System.out.println("Focus Gained Event");
        Button temp = (Button) e.getSource();
        temp.setForeground(Color.GREEN);
    }

    @Override
    public void focusLost(FocusEvent e) {
        System.out.println("Focus Lost Event");
        Button temp = (Button) e.getSource();
        temp.setForeground(Color.RED);
    }

    public static void main(String[] args) {
        FocusEventDemo frameObject = new FocusEventDemo();
        frameObject.setVisible(true);
        frameObject.addWindowFocusListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // TODO Auto-generated method stub
                // this.dispose();
            }
        });
    }
}