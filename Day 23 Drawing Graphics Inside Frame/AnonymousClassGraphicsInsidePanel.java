import java.awt.*;
import java.awt.event.*;

class AnonymousClassGraphicsInsidePanel extends Frame {
    Panel bottom = new Panel(); // panel without Graphics
    // Panel with Graphics, Anonymous
    Panel panel = new Panel() {
        @Override
        public void paint(Graphics g) {
            // TODO Auto-generated method stub
            super.paint(g);
            g.setColor(Color.GREEN);
            g.fillOval(10, 5, 80, 80);
            g.setColor(Color.RED);
            g.fillRect(100, 5, 80, 80);
        }
    };

    AnonymousClassGraphicsInsidePanel() {
        setSize(600, 600);
        setTitle("MyFrame");
        setLocation(700, 50);
        // setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        setLayout(new GridLayout(6, 6));
        setBackground(Color.LIGHT_GRAY);
        panel.setBackground(Color.PINK);
        panel.add(new Button("Press OK "));

        bottom.setBackground(Color.BLUE);

        add(panel);
        add(bottom);
    }

    public static void main(String[] args) {
        AnonymousClassGraphicsInsidePanel frameObject = new AnonymousClassGraphicsInsidePanel();
        frameObject.setVisible(true);

    }
}