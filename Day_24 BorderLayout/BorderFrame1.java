import java.awt.*;

class BorderFrame1 extends Frame {
    Button b1 = new Button("CENTER");
    Button b2 = new Button("EAST");
    Button b3 = new Button("WEST");
    Button b4 = new Button("NORTH");
    Button b5 = new Button("SOUTH");

    BorderFrame1() {
        setSize(600, 600);
        setTitle("MyFrame");
        add(b1, "Center");
        add(b2, "East");
        add(b3, "West");
        add(b4, "North");
        add(b5, "South");
    }

    public static void main(String[] args) {
        BorderFrame1 containerObject = new BorderFrame1();
        containerObject.setVisible(true);

    }
}