import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame {

    final TextField tf = new TextField();

    MyFrame() {
        setSize(600, 600);
        setTitle("MyFrame");
        // setExtendedState(Frame.MAXIMIZED_BOTH);
        // tf.setForeground(Color.RED);
        tf.setFont(new Font("Consolas", 0, 40));
        add(tf);

    }

    public static void main(String[] args) {
        MyFrame frameObject = new MyFrame();
        frameObject.setVisible(true);

    }
}