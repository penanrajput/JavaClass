import java.awt.*;
import java.awt.event.*;
import java.util.Stack;

class CalculatorDemo extends Frame implements ActionListener {
    TextField tf = new TextField(30);
    Panel header = new Panel();
    Button clear = new Button("CLEAR");

    Panel panel = new Panel();
    Button button[][] = new Button[5][4];

    String expression = new String("");
    int ans = 0;

    CalculatorDemo() {
        setSize(300, 300);
        setTitle("CalculatorDemo");
        setLocation(700, 50);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                button[i][j] = new Button();
                button[i][j].setFont(new Font("Consolas", 0, 30));
                // button[i][j].setForeground(c);
                button[i][j].setForeground(Color.BLUE);
            }
        }

        button[0][0].setLabel("7");
        button[0][1].setLabel("8");
        button[0][2].setLabel("9");
        button[0][3].setLabel("/");
        button[1][0].setLabel("4");
        button[1][1].setLabel("5");
        button[1][2].setLabel("6");
        button[1][3].setLabel("*");
        button[2][0].setLabel("1");
        button[2][1].setLabel("2");
        button[2][2].setLabel("3");
        button[2][3].setLabel("-");
        button[3][0].setLabel(".");
        button[3][1].setLabel("0");
        button[3][2].setLabel("=");
        button[3][3].setLabel("+");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                panel.add(button[i][j]);
                button[i][j].addActionListener(this);
            }
        }

        button[3][2].addActionListener(this);

        header.setLayout(new BorderLayout());
        tf.setFont(new Font("Consolas", 0, 30));
        // tf.setEnabled(false);
        tf.setForeground(Color.RED);
        header.add(tf);
        header.add(clear, "East");
        add(header, "North");
        clear.addActionListener(this);

        panel.setLayout(new GridLayout(4, 4));
        add(panel);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand();
        if (str.equals("=")) {
            ans = findAns(tf.getText());
            tf.setText("=" + Integer.toString(ans));
            expression = Integer.toString(ans);
            System.out.println("This is new Text : " + expression);
        } else if (str.equals("CLEAR")) {
            tf.setText("");
            ans = 0;
            expression = "";
            System.out.println(expression);
        } else {
            expression += str;
            tf.setText(expression);
            System.out.println(expression);
        }

    }

    int findAns(String exp) {
        char[] tokens = expression.toCharArray();

        // Stack for numbers: 'values'
        Stack<Integer> values = new Stack<Integer>();

        // Stack for Operators: 'ops'
        Stack<Character> ops = new Stack<Character>();

        for (int i = 0; i < tokens.length; i++) {

            // Current token is a
            // whitespace, skip it
            if (tokens[i] == ' ')
                continue;

            // Current token is a number,
            // push it to stack for numbers
            if (tokens[i] >= '0' && tokens[i] <= '9') {
                StringBuffer sbuf = new StringBuffer();

                // There may be more than one
                // digits in number
                while (i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9')
                    sbuf.append(tokens[i++]);
                values.push(Integer.parseInt(sbuf.toString()));

                // right now the i points to
                // the character next to the digit,
                // since the for loop also increases
                // the i, we would skip one
                // token position; we need to
                // decrease the value of i by 1 to
                // correct the offset.
                i--;
            }

            // Current token is an opening brace,
            // push it to 'ops'
            else if (tokens[i] == '(')
                ops.push(tokens[i]);

            // Closing brace encountered,
            // solve entire brace
            else if (tokens[i] == ')') {
                while (ops.peek() != '(')
                    values.push(applyOp(ops.pop(), values.pop(), values.pop()));
                ops.pop();
            }

            // Current token is an operator.
            else if (tokens[i] == '+' || tokens[i] == '-' || tokens[i] == '*' || tokens[i] == '/') {
                // While top of 'ops' has same
                // or greater precedence to current
                // token, which is an operator.
                // Apply operator on top of 'ops'
                // to top two elements in values stack
                while (!ops.empty() && hasPrecedence(tokens[i], ops.peek()))
                    values.push(applyOp(ops.pop(), values.pop(), values.pop()));

                // Push current token to 'ops'.
                ops.push(tokens[i]);
            }
        }

        // Entire expression has been
        // parsed at this point, apply remaining
        // ops to remaining values
        while (!ops.empty())
            values.push(applyOp(ops.pop(), values.pop(), values.pop()));

        // Top of 'values' contains
        // result, return it
        return values.pop();
    }

    public static boolean hasPrecedence(char op1, char op2) {
        if (op2 == '(' || op2 == ')')
            return false;
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
            return false;
        else
            return true;
    }

    public static int applyOp(char op, int b, int a) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0)
                    throw new UnsupportedOperationException("Cannot divide by zero");
                return a / b;
        }
        return 0;
    }

    public static void main(String[] args) {
        CalculatorDemo frameObject = new CalculatorDemo();
        frameObject.setVisible(true);

    }
}