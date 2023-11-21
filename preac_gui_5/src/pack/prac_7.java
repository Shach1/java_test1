package pack;
import java.util.ArrayList;
// реализовать конструктор который инициализируется числом/пустой
// реализовать методы add get set size contains remove toArray
public class prac_7
{
    /*
    public static void main(String[] args)
    {
        ArrayList<String> states = new ArrayList<String>(); // добавим в список ряд элементов
        states.add("Германия");
        states.add("Франция");
        states.add("Великобритания");
        states.add("Испания");
        states.add(1, "Италия"); // добавляем элемент по индексу 1
        System.out.println(states.get(1));// получаем 2-й объект
        states.set(1, "Дания"); // установка нового значения для 2-го объекта
        System.out.printf("В списке %d элементов \n", states.size());
        for (String state : states)
        {
            System.out.println(state);
        }
        if (states.contains("Германия"))
        {
            System.out.println("Список содержит государство Германия");
        }
        // удалим несколько объектов
        states.remove("Германия");
        states.remove(0);
        Object[] countries = states.toArray();
        for(Object country : countries)
        {
            System.out.println(country);
        }
    }
     */
    public static void main(String[] args)
    {
        myArrayList<Integer> arr = new myArrayList<Integer>(5);
        arr.add(43);
        arr.add(235);
        arr.add(400);
        arr.add(77777);
        arr.add(1, 555);
        arr.add(2, 666);

        System.out.println("size = " + arr.size());
        arr.capacity();
        arr.print();

        System.out.println(arr.contains(555));
        arr.remove(1);
        System.out.println(arr.contains(555));

        System.out.println("size = " + arr.size());
        arr.capacity();
        arr.print();
    }
}
