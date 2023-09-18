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
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
        setBounds(1000, 500, 360,160);
        setLayout(new GridBagLayout());


        GridBagConstraints constraints = new GridBagConstraints();

        constraints.gridx = 2;                                               // ячейка по х
        constraints.gridy = 0;                                               // ячейка по  y
        constraints.gridwidth = 1;                                           // сколько ячеек занимает по х
        constraints.gridheight = 1;                                          // сколько ячеек занимает по y
        constraints.anchor = GridBagConstraints.NORTH;                       // ориентация к северу
        constraints.insets = new Insets(2,2,2,2);       // отступы
        constraints.weightx = 0;
        constraints.weighty = 0.1;
        add(winner, constraints);

        constraints.gridx = 2;
        constraints.gridy = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        add(result, constraints);

        constraints.gridx = 2;
        constraints.gridy = 4;
        constraints.anchor = GridBagConstraints.SOUTH;

        add(lastScorer, constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.anchor = GridBagConstraints.WEST;
        constraints.weightx = 0.3;
        constraints.weighty = 0.1;
        add(butMilan, constraints);

        constraints.gridx = 4;
        constraints.gridy = 2;
        constraints.anchor = GridBagConstraints.EAST;
        add(butMadrid, constraints);

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
            lastScorer.setText("Last Scorer: Real Madrid");
            if(scMilan < scMadrid){winner.setText("Winner: Real Madrid");}
            else if (scMilan == scMadrid){winner.setText("Winner: DRAW");}
        }
    }
}