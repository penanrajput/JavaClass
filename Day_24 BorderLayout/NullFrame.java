import java.awt.*;

class NullFrame extends Frame {
    NullFrame() {
        setSize(300, 300);
        setTitle("MyFrame");
        setLayout(null);
        Button b1 = new Button("OK");
        Button b2 = new Button("Cancel");
        b1.setBounds(50, 50, 50, 30);
        b2.setBounds(200, 50, 50, 30);
        add(b1);
        add(b2);

    }

    public static void main(String[] args) {
        NullFrame containerObject = new NullFrame();
        containerObject.setVisible(true);

    }
}