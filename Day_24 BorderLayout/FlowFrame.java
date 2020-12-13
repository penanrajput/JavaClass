import java.awt.*;

class FlowFrame extends Frame {
    Button b1 = new Button("OK");

    FlowFrame() {
        setSize(600, 600);
        setTitle("MyFrame");
        setLayout(new FlowLayout());
        add(b1);
    }

    public static void main(String[] args) {
        FlowFrame containerObject = new FlowFrame();
        containerObject.setVisible(true);

    }
}