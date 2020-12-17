import java.awt.*;
import java.awt.event.*;

class OpenAppTest extends Frame implements ActionListener {
    // create Buttons
    Button b1 = new Button("Notepad");
    Button b2 = new Button("Calculator");
    Button b3 = new Button("Google");

    OpenAppTest() {
        setSize(600, 600);
        setTitle("OpenAppTest");
        setLocation(700, 50);
        setLayout(new FlowLayout());
        add(new Label("Click Buttons to Open Application"));
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
        try {
            if (obj == b1)
                Runtime.getRuntime().exec("notepad.exe");
            else if (obj == b2)
                Runtime.getRuntime().exec("calc.exe");
            else if (obj == b3)
                Runtime.getRuntime().exec(new String[] { "cmd.exe", "/C", "start", "chrome" });
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        // else if (obj == b2)
        // Runtime.exec("Open");
        // else if (obj == b3)
        // setBackground(Color.LIGHT_GRAY);

    }

    public static void main(String[] args) {
        OpenAppTest frameObject = new OpenAppTest();
        frameObject.setVisible(true);

    }
}