import java.awt.*;

class GridFrame extends Frame {
    GridFrame() {
        setSize(300, 300);
        setTitle("MyFrame");
        setLayout(new GridLayout(3, 4));

        for (int i = 1; i <= 12; i++) {
            Button b = new Button("Button " + i);
            add(b);
        }
    }

    public static void main(String[] args) {
        GridFrame containerObject = new GridFrame();
        containerObject.setVisible(true);

    }
}