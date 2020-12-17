import java.awt.*;
import java.awt.event.*;
import java.util.EventObject;

// inner Class
class ButtonInnerTest extends Frame {

    Button button = new Button("Ok");

    ButtonInnerTest() {
        setSize(600, 600);
        setTitle("ButtonInnerTest");
        setLocation(700, 50);
        setLayout(new FlowLayout());

        add(button);

        button.addActionListener(new ButtonClickListener());
    }

    // inner Class
    public class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Object eo = e.getSource();
            if (eo == button) {
                System.out.println("OK Button Pressed");
            }
        }
    }

    public static void main(String[] args) {
        ButtonInnerTest frameObject = new ButtonInnerTest();
        frameObject.setVisible(true);

    }
}