package GUI_TEST;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Gui1 extends JFrame
{
    Font fnt = new Font("Times new roman",Font.BOLD,20);
    private  JButton button = new JButton("Кнопка жмакалка"); //кнопка
    private JTextField input = new JTextField("Вводите сюда", 5);   //текстовое поле
    private JLabel label = new JLabel("Ввод:"); //лабель
    private JRadioButton radio1 = new JRadioButton("Женщин");   //круглая кнопочка
    private JRadioButton radio2 = new JRadioButton("Мужчин");
    private JCheckBox checkBox = new JCheckBox("Знаю о возможности краша системы после нажатия кнопки", true);  //поле выбора

    public Gui1()    //конструктор
    {
        super("Первое окно");   //создание окна
        this.setBounds(1000,500,800,600);      //позиция и размеры
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //остановка программы после закрытия главного окна

        Container container = this.getContentPane();            //контейнер для кнопок
        container.setLayout(new GridLayout(3,2, 10, 5 ));     //разметка 3 строки, 2 колонны,
                                                                                    // отсутп друг от друга по шиоине 10, по высоте 5
        container.add(label);
        container.add(input);
        input.setFont(fnt);
        input.setForeground(Color.GREEN);

        ButtonGroup buttonGroup = new ButtonGroup();    //групировка круглых кнопок
        buttonGroup.add(radio1);
        buttonGroup.add(radio2);

        container.add(radio1);
        container.add(radio2);
        radio1.setSelected(false);       //по дефолту  кнопка не нажата

        container.add(checkBox);
        checkBox.setSelected(false);

        button.addActionListener(new ButtonEventListener());
        container.add(button);
    }

    class ButtonEventListener implements ActionListener
    {
        public void actionPerformed (ActionEvent event)
        {
            String msg = "";
            msg += "Button was presed\n";
            msg += "Text is " + input.getText() + "\n";
            msg += (radio1.isSelected() ? "Radio №1 " : "Radio №2 ") + " is selected!\n";
            msg += "Checkbox is " + (checkBox.isSelected() ? "cheek" : "uncheek");
            JOptionPane.showMessageDialog(null, msg, "Output", JOptionPane.PLAIN_MESSAGE);
        }
    }

}
















