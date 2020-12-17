import java.awt.*;
import java.awt.event.*;
import java.util.Random;

class GuessNumberDemo extends Frame implements TextListener {
    TextField tf = new TextField(20);
    Label msg = new Label("Lets start game");
    int guessedInt = 0;

    GuessNumberDemo() {
        setSize(200, 150);
        setTitle("GuessNumberDemo");
        setLocation(800, 50);
        setLayout(new FlowLayout());

        add(new Label("Enter the number: "));
        add(tf);

        tf.addTextListener(this);

        guessedInt = (int) (Math.random() * (100));
        add(msg);
    }

    @Override
    public void textValueChanged(TextEvent e) {
        TextField temp = (TextField) e.getSource();
        String str = temp.getText().trim().split(" ")[0];
        System.out.println(str);
        if (!str.equals("")) {
            int num = Integer.parseInt(str);
            if (num == guessedInt)
                msg.setText("You guessed it right bro");
            else if (num < guessedInt)
                msg.setText("go higher");
            else
                msg.setText("go lower");
        }
    }

    public static void main(String[] args) {
        GuessNumberDemo frameObject = new GuessNumberDemo();
        frameObject.setVisible(true);

    }
}