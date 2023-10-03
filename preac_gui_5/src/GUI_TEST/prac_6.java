package GUI_TEST;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class prac_6 extends JFrame
{
    JTextArea textArea = new JTextArea("Введите текст сюда");
    JScrollPane scrool = new JScrollPane();
    JMenuBar menuBar = new JMenuBar();
    JMenu font = new JMenu("Шрифт");
    JMenu color = new JMenu("Цвет текста");
    JMenuItem colorBlue = new JMenuItem("Синий");
    JMenuItem colorRed = new JMenuItem("Красный");
    JMenuItem colorBlack = new JMenuItem("Черный");
    JMenuItem fontTnr = new JMenuItem("Times New Roman");
    JMenuItem fontMSSS = new JMenuItem("MS Sans Serif");
    JMenuItem fontCn = new JMenuItem("Courier New");

    prac_6()
    {
        super("Лаба №6");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(1000,500,600,350);
        setLayout(null);

        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setBounds(5,5,574,270);

        scrool.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrool.setBounds(5,5,574,270);
        scrool.getViewport().add(textArea);
        add(scrool);

        setJMenuBar(menuBar);
        menuBar.add(font);
        menuBar.add(color);

        color.add(colorBlack);
        color.add(colorRed);
        color.add(colorBlue);
        colorBlack.addActionListener(new ButtonEventColorBlack());
        colorRed.addActionListener(new ButtonEventColorRed());
        colorBlue.addActionListener(new ButtonEventColorBlue());

        font.add(fontTnr);
        font.add(fontMSSS);
        font.add(fontCn);
        fontTnr.addActionListener(new ButtonEventFontTnr());
        fontMSSS.addActionListener(new ButtonEventFontMSSS());
        fontCn.addActionListener(new ButtonEventFontCn());
    }
    class ButtonEventColorBlack implements ActionListener
    {
        public void actionPerformed (ActionEvent e)
        {
            textArea.setForeground(Color.black);
        }
    }
    class ButtonEventColorRed implements ActionListener
    {
        public void actionPerformed (ActionEvent e)
        {
            textArea.setForeground(Color.red);
        }
    }
    class ButtonEventColorBlue implements ActionListener
    {
        public void actionPerformed (ActionEvent e)
        {
            textArea.setForeground(Color.blue);
        }
    }
    class ButtonEventFontTnr implements ActionListener
    {
        public void actionPerformed (ActionEvent e)
        {
            textArea.setFont(new Font("Times New Roman", Font.PLAIN, 14 ));
        }
    }
    class ButtonEventFontMSSS implements ActionListener
    {
        public void actionPerformed (ActionEvent e)
        {
            textArea.setFont(new Font("MS Sans Serif", Font.PLAIN, 14 ));
        }
    }
    class ButtonEventFontCn implements ActionListener
    {
        public void actionPerformed (ActionEvent e)
        {
            textArea.setFont(new Font("Courier New", Font.PLAIN, 14 ));
        }
    }

}
