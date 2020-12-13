import java.awt.*;

class MyFrame extends Frame {
    MyFrame() {
        setSize(600, 600);
        setTitle("MyFrame");
        setVisible(true);
    }

    public void paint(Graphics g) {
        g.drawRect(50, 50, 200, 50);
        g.drawString("Text inside Rect", 75, 75);
        g.drawOval(50, 200, 200, 200);
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}