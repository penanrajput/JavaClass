import java.awt.Frame;

class MyFrame2 {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setSize(400, 600);
        f.setTitle("My First Frame");
        f.setLocation(100, 50);
        f.setVisible(true);
        f.setResizable(false);
    }
}
