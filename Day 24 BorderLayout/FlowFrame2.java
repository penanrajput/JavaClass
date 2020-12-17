import java.awt.*;

// overflow of button
class FlowFrame2 extends Frame {

    FlowFrame2() {
        setSize(600, 600);
        setTitle("MyFrame");
        // setLayout(new FlowLayout(FlowLayout.CENTER)); // hgap = vgap = 5
        setLayout(new FlowLayout(FlowLayout.CENTER, 15, 40)); // hgap 15, vgap = 40
        setBackground(Color.BLUE);
        for (int i = 1; i <= 12; i++) {
            Button b = new Button("Button " + i);
            b.setSize(100, 50);
            add(b);
        }
    }

    public static void main(String[] args) {
        FlowFrame2 containerObject = new FlowFrame2();
        containerObject.setVisible(true);

    }
}