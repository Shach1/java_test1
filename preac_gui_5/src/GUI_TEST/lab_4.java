package GUI_TEST;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class lab_4 extends JFrame
{
    JButton butMilan= new JButton("AC Milan");
    JButton butMadrid = new JButton("Real Madrid");
    JLabel result = new JLabel("Result: 0 X 0");
    JLabel lastScorer = new JLabel("Last Scorer: N/A");
    JLabel winner = new JLabel("Winner: DRAW");

    short scMilan = 0, scMadrid = 0;
    public lab_4()
    {
        super("Game - AC Milan vs Real Madrid");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setSize(300,300);
        setLayout(new BorderLayout());
        setBounds(1000, 500, 300,300);

        add(butMilan, BorderLayout.WEST);
        add(butMadrid, BorderLayout.EAST);
        add(winner, BorderLayout.NORTH);
        add(result, BorderLayout.CENTER);
        add(lastScorer, BorderLayout.SOUTH);

        butMilan.addActionListener(new ButtonEventMilan());
        butMadrid.addActionListener(new ButtonEventMadrid());


    }
    class ButtonEventMilan implements ActionListener
    {
        public void actionPerformed (ActionEvent e)
        {
            scMilan += 1;
            result.setText("Result: " + scMilan + " X " + scMadrid);
            lastScorer.setText("Last Scorer: AC Milan");
            if(scMilan > scMadrid){winner.setText("Winner: AC Milan");}
            else if (scMilan == scMadrid){winner.setText("Winner: DRAW");}
        }
    }
    class ButtonEventMadrid implements ActionListener
    {
        public void actionPerformed (ActionEvent e)
        {
            scMadrid += 1;
            result.setText("Result: " + scMilan + " X " + scMadrid);
            lastScorer.setText("Real Madrid");
            if(scMilan < scMadrid){winner.setText("Winner: Real Madrid");}
            else if (scMilan == scMadrid){winner.setText("Winner: DRAW");}
        }
    }
}