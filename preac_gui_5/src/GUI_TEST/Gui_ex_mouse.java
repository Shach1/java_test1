package GUI_TEST;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Gui_ex_mouse extends JFrame
{
    JLabel lbl = new JLabel("");
    public Gui_ex_mouse()
    {
        super("Dude! Where's my mouse ?");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setLayout(new BorderLayout());
        add(lbl,BorderLayout.SOUTH);
        addMouseListener(new MouseListener()
        {
            public void mouseExited(MouseEvent a){}
            public void mouseClicked(MouseEvent a)
            {lbl.setText("X="+a.getX()+" Y="+a.getY());}
            public void mouseEntered(MouseEvent a) {}
            public void mouseReleased(MouseEvent a) {}
            public void mousePressed(MouseEvent a) {}
        });
    }
}