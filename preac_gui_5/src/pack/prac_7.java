package pack;
import java.util.ArrayList;
// реализовать конструктор который инициализируется числом/пустой
// реализовать методы add get set size contains remove
public class prac_7
{
    public static void main(String[] args)
    {

        myArrayList arr = new myArrayList(5);
        arr.add(43);
        arr.add(235);
        arr.add(400);
        arr.add(77777);
        arr.add(1, 555);
        arr.add(2, 666);

        System.out.println("size = " + arr.size());
        System.out.println("capacity = " + arr.capacity());
        arr.print();

        System.out.println("Содержится 555 в arr? " + arr.contains(555));
        arr.remove(1);
        System.out.println("Содержится 555 в arr? " + arr.contains(555));

        arr.set(0, 100);
        System.out.println("size = " + arr.size());
        System.out.println("capacity = " + arr.capacity());
        arr.print();

    }
}
