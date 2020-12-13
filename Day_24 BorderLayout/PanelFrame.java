import java.awt.*;

class PanelFrame extends Frame {
    PanelFrame() {
        setSize(600, 600);
        setTitle("MyFrame");
        setLayout(new GridLayout(3, 1));
        Panel p1 = new Panel();
        p1.setBackground(Color.PINK);
        p1.setLayout(new FlowLayout());
        p1.add(new Button("RED"));
        p1.add(new Button("GREEN"));
        p1.add(new Button("BLUE"));

        Panel p2 = new Panel();
        p2.setBackground(Color.RED);
        p2.setLayout(new FlowLayout());
        p2.add(new Button("OK"));
        p2.add(new Button("cancel"));
        // add(p1, "North");
        // add(p2, "South");
        add(p1);
        add(p2);
    }

    public static void main(String[] args) {
        PanelFrame containerObject = new PanelFrame();
        containerObject.setVisible(true);

    }
}