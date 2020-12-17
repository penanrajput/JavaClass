import java.awt.*;

// overflow of button
class FlowFrame1 extends Frame {

    FlowFrame1() {
        setSize(150, 150);
        setTitle("MyFrame");
        setLayout(new FlowLayout());
        for (int i = 1; i <= 12; i++) {
            Button b = new Button("Button " + i);
            add(b);
        }
    }

    public static void main(String[] args) {
        FlowFrame1 containerObject = new FlowFrame1();
        containerObject.setVisible(true);

    }
}