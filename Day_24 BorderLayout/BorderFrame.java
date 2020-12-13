import java.awt.*;

class BorderFrame extends Frame {
    Button b1 = new Button("OK");

    BorderFrame() {
        setSize(600, 600);
        setTitle("MyFrame");
        add(b1);
    }

    public static void main(String[] args) {
        BorderFrame containerObject = new BorderFrame();
        containerObject.setVisible(true);

    }
}