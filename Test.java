import java.awt.*;
import java.awt.event.*;

class Test extends Frame implements MouseListener {
    Label label = new Label("This is text");

    Test() {

        setSize(600, 600);
        setTitle("Test");
        setLocation(700, 50);
        setLayout(new FlowLayout());
        add(label);
        // add(new Button("OK"));
        addMouseListener(this);
    }

    @Override
    public boolean mouseDrag(Event evt, int x, int y) {
        // TODO Auto-generated method stub

        return super.mouseDrag(evt, x, y);
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        label.setText("" + me.getX() + ", " + me.getY());
    }

    @Override
    public void mouseEntered(MouseEvent me) {

    }

    @Override
    public void mouseExited(MouseEvent me) {

    }

    @Override
    public void mousePressed(MouseEvent me) {

    }

    @Override
    public void mouseReleased(MouseEvent me) {

    }

    public static void main(String[] args) {
        Test frameObject = new Test();
        frameObject.setVisible(true);

    }
}