// Raksha Penan
// File_6_Implement_Callback_Method.java


import javax.swing.Timer;

import java.awt.event.*;
// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

import java.util.Date;
import javax.swing.JOptionPane;

class NamePrinter implements ActionListener
{
      public void actionPerformed(ActionEvent e)
      {
            Date d = new Date();
            System.out.println("Raksha \t" + d);
      }
}

class Test
{
      public static void main(String[] args) {
            Timer t = new Timer(1000, new NamePrinter());
            t.start();
            JOptionPane.showMessageDialog(null, "Exit Program");
            System.exit(0);
      }
}
