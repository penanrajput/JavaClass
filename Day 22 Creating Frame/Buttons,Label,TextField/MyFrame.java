import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame {

    MyFrame() {

        setSize(600, 600);
        setTitle("MyFrame");
        setLayout(new GridLayout(6, 2));

        Panel panel1 = new Panel();
        // panel1.setLayout(new FlowLayout());
        Label l1 = new Label("Enter name: ");
        TextField tf = new TextField(20);
        panel1.add(l1);
        panel1.add(tf);
        add(panel1);

        Panel panel2 = new Panel();
        // panel2.setLayout(new FlowLayout());
        Button b2 = new Button("NO");
        panel2.add(b2);
        Button l2 = new Button("YES");
        panel2.add(l2);
        add(panel2);

        Panel panel3 = new Panel();
        // panel1.setLayout(new FlowLayout());
        Label l3 = new Label("Enter the Description : ");
        TextArea ta = new TextArea("", 5, 40);
        panel3.add(l3);
        panel3.add(ta);
        add(panel3);

        Panel panel4 = new Panel();
        Checkbox checkbox1 = new Checkbox("C++");
        Checkbox checkbox2 = new Checkbox("Python");
        Checkbox checkbox3 = new Checkbox("Java");
        checkbox1.setBounds(100, 100, 50, 50);
        panel4.add(checkbox1);
        panel4.add(checkbox2);
        panel4.add(checkbox3);
        add(panel4);

        Panel panel5 = new Panel();
        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox checkbox4 = new Checkbox("Rs. 10", cbg, false);
        Checkbox checkbox5 = new Checkbox("Rs. 20", cbg, false);
        panel5.add(checkbox4);
        panel5.add(checkbox5);
        add(panel5);

        Panel panel6 = new Panel();
        Choice c = new Choice();
        c.add("AWT");
        c.add("Frame");
        c.add("Graphics");
        c.add("Events");
        c.add("Gate");
        panel6.add(c);
        add(panel6);

        Panel panel7 = new Panel();
        List l = new List();
        l.add("A");
        l.add("B");
        l.add("C");
        l.add("D");
        l.add("E");
        panel7.add(l);
        add(panel7);

        MenuBar mb = new MenuBar();
        Menu menu = new Menu("Menu");
        Menu submenu = new Menu("SubMenu");
        MenuItem i1 = new MenuItem("item 1");
        MenuItem i2 = new MenuItem("item 2");
        MenuItem i3 = new MenuItem("item 3");
        MenuItem i4 = new MenuItem("item 4");
        menu.add(i1);
        menu.add(i2);
        submenu.add(i3);
        submenu.add(i4);
        menu.add(submenu);
        mb.add(menu);
        setMenuBar(mb);

        Panel panel8 = new Panel();
        add(panel8);

    }

    public static void main(String[] args) {
        MyFrame frameObject = new MyFrame();
        frameObject.setVisible(true);

    }
}