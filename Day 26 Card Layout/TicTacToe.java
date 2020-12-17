import java.awt.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;

class TicTacToe extends Frame {
    Panel panel[][] = new Panel[3][3];
    Button button[][] = new Button[3][3];
    String arr[][] = new String[3][3];
    String playerString = "O";
    // static Dialogue d = new Dialog(f, "Dialog Example", true);

    TicTacToe() {
        setSize(600, 600);
        setTitle("***TicTacToe By Penan***");
        setLocation(700, 50);
        // GridLayout(int rows, int columns, int hgap, int vgap)
        setLayout(new GridLayout(3, 3, 20, 20));

        int count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = "" + (++count);
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                panel[i][j] = new Panel();
                panel[i][j].setLayout(new BorderLayout());

                button[i][j] = new Button();
                button[i][j].setBackground(Color.PINK);
                button[i][j].addActionListener(new MakeMove());

                panel[i][j].add(button[i][j]);
                add(panel[i][j]);
            }
        }

    }

    class MakeMove implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Object obj = e.getSource();
            Button b = (Button) obj;
            boolean found = false;

            int row = 0;
            int col = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (button[i][j] == b) {
                        row = i;
                        col = j;
                        found = true;
                    }
                }
                if (found == true) {
                    break;
                }
            }

            b.setFont(new Font("Consolas", 1, 50));
            b.setForeground(Color.BLUE);

            // arr[row][col] = ? playerString : "X";
            if (!(arr[row][col].equals("X") || arr[row][col].equals("O"))) {
                arr[row][col] = playerString;
                b.setLabel(playerString);
                // toggle the player String
                playerString = playerString.equals("X") ? "O" : "X";
            }

            // print board to console
            // print();

            String winner = checkWinner();
            if (!winner.equals("")) {
                System.out.println("****** " + winner + " ******");
                // Popup saying if whois winner
                showMessageDialog(null, "" + winner + " Wins!");

                // Exit frame
                System.exit(0);

            }

            boolean isDraw = checkDraw();
            if (isDraw == true) {
                // Popup saying if draw condtion is trye
                showMessageDialog(null, "Game Draw!");

                // Exit frame
                System.exit(0);
            }

        }
    }

    public String checkWinner() {
        // row wise solution
        for (int i = 0; i < 3; i++) {
            if (arr[i][0].equals(arr[i][1]) && arr[i][1].equals(arr[i][2])) {
                return arr[i][0];
            }
        }

        // column wise solution
        for (int i = 0; i < 3; i++) {
            if (arr[0][i].equals(arr[1][i]) && arr[1][i].equals(arr[2][i])) {
                return arr[0][i];
            }
        }

        // diagonal wise solution
        if (arr[0][0].equals(arr[1][1]) && arr[1][1].equals(arr[2][2]))
            return arr[0][0];
        if (arr[2][0].equals(arr[1][1]) && arr[1][1].equals(arr[0][2]))
            return arr[2][0];

        return "";
    }

    public void print() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                String temp = arr[i][j];
                temp = temp == "" ? "-" : temp;
                System.out.print(temp + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public boolean checkDraw() {
        int count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j].equals("X") || arr[i][j].equals("O"))
                    count++;
            }
        }
        if (count == 9)
            return true;
        return false;
    }

    public static void main(String[] args) {
        TicTacToe frameObject = new TicTacToe();
        frameObject.setVisible(true);

    }
}

// Draw
// 0 X 0
// 0 X X
// X 0 0