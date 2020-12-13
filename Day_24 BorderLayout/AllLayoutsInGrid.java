import java.awt.*;

class AllLayoutsInGrid extends Frame {
    Panel p1 = new Panel();
    Panel p2 = new Panel();
    Panel p3 = new Panel();
    Panel p4 = new Panel();
    Panel p5 = new Panel();

    AllLayoutsInGrid() {
        setSize(600, 600);
        setTitle("MyFrame");
        setLayout(new GridLayout(6, 1, 0, 20));

        add(p1);
        p1.setLayout(new GridLayout(3, 3));
        p1.setBackground(Color.PINK);
        for (int i = 0; i <= 10; i++) {
            Button b = new Button("Button " + i);
            p1.add(b);
        }

        add(p2);
        p2.setLayout(new BorderLayout());
        p2.setBackground(Color.ORANGE);
        p2.add(new Button("Button East"), "East");
        p2.add(new Button("Button West"), "West");
        p2.add(new Button("Button Center"), "Center");
        p2.add(new Button("Button North"), "North");
        p2.add(new Button("Button South"), "South");

        add(p3);
        // p3 is by default Flow Layout
        p3.setBackground(Color.BLUE);
        for (int i = 0; i <= 10; i++) {
            Button b = new Button("Button " + i);
            p3.add(b);
        }

        add(p4);
        p4.setBackground(Color.YELLOW);
        p4.setLayout(null);
        Button b1 = new Button("OK");
        b1.setBounds(20, 10, 100, 50);
        p4.add(b1);

        Button b2 = new Button("Cancel");
        b2.setBounds(150, 10, 100, 50);
        p4.add(b2);

        Button b3 = new Button("NO");
        b3.setBounds(280, 10, 100, 50);
        p4.add(b3);

        Button b4 = new Button("YES");
        b4.setBounds(410, 10, 100, 50);
        p4.add(b4);

    }

    public static void main(String[] args) {
        AllLayoutsInGrid frameObject = new AllLayoutsInGrid();
        frameObject.setVisible(true);

    }
}