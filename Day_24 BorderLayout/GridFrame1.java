import java.awt.*;

class GridFrame1 extends Frame {
    GridFrame1() {
        setSize(300, 300);
        setTitle("MyFrame");
        setLayout(new GridLayout(3, 4));

        for (int i = 1; i <= 20; i++) {
            Button b = new Button("Button " + i);
            add(b);
        }
    }

    public static void main(String[] args) {
        GridFrame1 containerObject = new GridFrame1();
        containerObject.setVisible(true);

    }
}