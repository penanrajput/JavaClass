import java.awt.*;
import java.awt.event.*;

class CardLayoutTest extends Frame {
    int panelNumber = 1;
    Panel center = new Panel();
    Panel bottom = new Panel();

    Button first = new Button("first");
    Button last = new Button("last");
    Button prev = new Button("prev");
    Button next = new Button("next");

    Label msg = new Label("" + panelNumber + " / 5");

    CardLayoutTest() {
        setSize(600, 600);
        setTitle("MyFrame");
        setLocation(700, 50);

        add(bottom, "South");
        add(center);

        // bottom.setLayout(new GridLayout(1, 8));
        bottom.add(msg);
        bottom.add(prev);
        bottom.add(next);
        bottom.add(first);
        bottom.add(last);

        msg.setFont(new Font("Consolas", 0, 25));
        msg.setForeground(Color.BLUE);

        Panel p1 = new Panel() {
            @Override
            public void paint(Graphics g) {
                // TODO Auto-generated method stub
                super.paint(g);
                g.drawString("Inside First Card : String", 100, 100);
                g.drawString("Inside First Card : String", 50, 50);
                g.drawString("Inside First Card : String", 10, 10);
                g.drawOval(0, 0, 80, 80);

            }
        };
        p1.setBackground(Color.RED);
        p1.add(new Button("Press here"));
        Panel p2 = new Panel();
        p2.setBackground(Color.BLUE);
        Panel p3 = new Panel();
        p3.setBackground(Color.GREEN);
        Panel p4 = new Panel();
        p4.setBackground(Color.PINK);
        Panel p5 = new Panel();
        p5.setBackground(Color.DARK_GRAY);

        CardLayout c = new CardLayout(20, 20);

        first.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.first(center);
                panelNumber = 1;

                msg.setText("" + panelNumber + " / 5");
            }
        });

        last.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.last(center);
                panelNumber = 5;
                msg.setText("" + panelNumber + " / 5");
            }
        });

        prev.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                --panelNumber;
                panelNumber = panelNumber == 0 ? 5 : panelNumber;
                msg.setText("" + panelNumber + " / 5");
                c.previous(center);
            }
        });

        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ++panelNumber;
                panelNumber = panelNumber == 6 ? 1 : panelNumber;
                msg.setText("" + panelNumber + " / 5");
                c.next(center);
            }
        });

        bottom.setBackground(Color.PINK);
        center.setBackground(Color.LIGHT_GRAY);
        center.setLayout(c);

        center.add(p1);
        center.add(p2);
        center.add(p3);
        center.add(p4);
        center.add(p5);

    }

    public static void main(String[] args) {
        CardLayoutTest frameObject = new CardLayoutTest();
        frameObject.setVisible(true);

    }
}