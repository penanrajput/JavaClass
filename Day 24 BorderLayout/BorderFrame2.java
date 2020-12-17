import java.awt.*;

class BorderFrame2 extends Frame {
    Button b1 = new Button("CENTRE");
    Button b2 = new Button("EAST");
    Button b3 = new Button("WEST");

    Button b4 = new Button("Penan");
    Button b41 = new Button("Rajput");

    Button b5 = new Button("SOUTH");

    BorderFrame2() {
        setSize(600, 600);
        setTitle("MyFrame");
        add(b1, "Center");
        add(b2, "East");
        add(b3, "West");
        add(b4, "North");
        add(b41, "North");
        add(b5, "South");
    }

    public static void main(String[] args) {
        BorderFrame2 containerObject = new BorderFrame2();
        containerObject.setVisible(true);

    }
}