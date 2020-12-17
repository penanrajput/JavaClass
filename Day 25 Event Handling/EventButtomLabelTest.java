import java.awt.*;
import java.awt.event.*;

class EventButtomLabelTest extends Frame {
    Button button = new Button("OK");
    Label label = new Label("Not Clicked            ");

    EventButtomLabelTest() {
        setSize(600, 600);
        setTitle("MyFrame");
        setLayout(new FlowLayout());
        add(button);
        add(label);
        button.addActionListener(new ButtonEventListener());
    }

    class ButtonEventListener implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            System.out.println("Ok Button Pressed");
            label.setText("Click event occured");
        }
    }

    public static void main(String[] args) {
        EventButtomLabelTest frameObject = new EventButtomLabelTest();
        frameObject.setVisible(true);
    }
}