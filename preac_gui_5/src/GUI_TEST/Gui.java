package GUI_TEST;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Gui extends JFrame
{
    private  JButton button = new JButton("Кнопка хуепка"); //кнопка
    private JTextField input = new JTextField("Вводите сюда", 5);   //текстовое поле
    private JLabel label = new JLabel("Ввод:"); //лабель
    private JRadioButton radio1 = new JRadioButton("Женщин");   //круглая кнопочка
    private JRadioButton radio2 = new JRadioButton("Мужчин");
    private JCheckBox checkBox = new JCheckBox("я студент", true);  //поле выбора

    public Gui()    //конструктор
    {
        super("Первое окно");   //создание окна
        this.setBounds(200,200,250,100);      //размеры и позиция окна
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //дефолтное закрытие

        Container container = this.getContentPane();            //контейнер для кнопок
        container.setLayout(new GridLayout(3,2, 2, 2 ));    //разметка
        container.add(label);
        container.add(input);

        ButtonGroup buttonGroup = new ButtonGroup();    //групировка круглых кнопок
        buttonGroup.add(radio1);
        buttonGroup.add(radio2);

        container.add(radio1);
        container.add(radio2);
        radio1.setSelected(true);

        container.add(checkBox);

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
















