import java.awt.*;

class BorderFrame3 extends Frame {
    Panel p1 = new Panel();
    Panel p2 = new Panel();
    Panel p3 = new Panel();
    Panel p4 = new Panel();
    Panel p5 = new Panel();

    BorderFrame3() {
        // setLocation(600, 600);
        setSize(600, 600);
        setLayout(new BorderLayout(50, 50));
        add(p3, "West");
        add(p2, "East");
        add(p1, "Center");
        add(p4, "North");
        add(p5, "South");

        p1.setLayout(new BorderLayout(15, 15));
        p1.add(new Button("Line Start"), "East");
        p1.add(new Button("Line End"), "West");
        p1.add(new Button("Center"), "Center");
        p1.add(new Button("North"), "North");
        p1.add(new Button("South"), "South");
        p1.setBackground(Color.BLUE);
        setBackground(Color.GRAY);
    }

    public static void main(String[] args) {
        BorderFrame3 frameObject = new BorderFrame3();
        frameObject.setVisible(true);
    }
}