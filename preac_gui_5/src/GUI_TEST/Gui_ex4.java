package GUI_TEST;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Gui_ex4 extends JFrame {
    JButton but1 = new JButton("One");
    JButton but2 = new JButton("two");
    JButton but3 = new JButton("three");

    public Gui_ex4() {
        super("Example_4");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(500, 500);

        but1.setBounds(150, 300, 100, 20); // added at 150,300 width = 100, height =20 ;
        but2.setSize(80, 400); // added at 0,0 width = 80, height=400
        but3.setLocation(300, 100);
        but3.setSize(200, 75);
        // those two steps can be combined in one setBounds method call
        add(but1);
        add(but2);
        add(but3);
    }
}