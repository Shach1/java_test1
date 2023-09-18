package GUI_TEST;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Gui_ex2 extends JFrame
{
    JTextField jta1 = new JTextField(10);
    JTextField jta2 = new JTextField(10);
    JButton button = new JButton(" Add them up");
    Font fnt = new Font("Times new roman", Font.BOLD | Font.ITALIC, 20);
    public Gui_ex2()
    {
        super("Example_2");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(250, 200);
        add(new JLabel("1st Number"));
        jta1.setFont(fnt);
        jta2.setFont(fnt);
        add(jta1);
        add(new JLabel("2nd Number"));
        add(jta2);
        add(button);
        button.addActionListener(new ButtonEventListener());
        setVisible(true);
    }

    class ButtonEventListener implements ActionListener
    {
        public void actionPerformed (ActionEvent event)
        {
            try
            {
                double x1 = Double.parseDouble(jta1.getText().trim());
                double x2 = Double.parseDouble(jta2.getText().trim());

                JOptionPane.showMessageDialog(null, "Result = " + (x1 + x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, "Error in Numbers !", "Alert!!!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}