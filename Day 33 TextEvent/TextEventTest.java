import java.awt.*;
import java.awt.event.*;

class TextEventTest extends Frame {

    TextField te;
    TextArea ta;

    Panel panelInput = new Panel();
    Panel panelOutput = new Panel();
    Panel panel = new Panel();

    TextEventTest() {
        setSize(600, 600);
        setTitle("TextEventTest");
        setLocation(700, 50);
        setLayout(new FlowLayout());

        te = new TextField(30);
        te.addTextListener(new TextTester());
        ta = new TextArea(5, 30);

        // panelInput.add(te);
        // panelOutput.add(label);

        // add(panelInput);
        // add(panelOutput);

        // panel.setAlignmentX(Component.LEFT_ALIGNMENT);
        // panel.add(te);
        // panel.add(label);
        add(te);
        // add(label);
        add(ta, 0);

    }

    class TextTester implements TextListener {
        @Override
        public void textValueChanged(TextEvent e) {
            TextField tf = (TextField) e.getSource();
            ta.setText(tf.getText());
        }
    }

    public static void main(String[] args) {
        TextEventTest frameObject = new TextEventTest();
        frameObject.setVisible(true);
        frameObject.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frameObject.dispose();
            }
        });

    }
}