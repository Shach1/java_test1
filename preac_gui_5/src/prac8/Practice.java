package prac8;

import java.util.ArrayList;
import java.util.Collection;

public class Practice
{
    public static void main(String[] args)
    {
            //Взаимодействие с Waitlist через интерфейс
        //Создание, заполнение и вывод iList
        IWaitList<Integer> iList = new WaitList<Integer>();
        iList.add(1);
        iList.add(3);
        iList.add(5);
        iList.add(7);
        iList.add(10);
        System.out.println(iList);

        //Создание, заполнение и вывод collection
        Collection<Integer> collection = new ArrayList<Integer>();
        collection.add(1);
        collection.add(3);
        System.out.println("Collection: " + collection);

        //Тесты iList
        System.out.println("№1 WaitList contains 1? " + iList.contains(1));
        System.out.println("№2 WaitList containsAll collection? " + iList.containsAll(collection));
        System.out.println("Removed value: " + iList.remove());
        System.out.println("№1 WaitList contains 1? " + iList.contains(1));
        System.out.println("№2 WaitList containsAll collection? " + iList.containsAll(collection));
        System.out.println(iList);



            //Взаимодействие с BoundedWaitList через  BoundedWaitList
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        BoundedWaitList<Integer> iList2 = new BoundedWaitList<Integer>(3);
        System.out.println("Capacity = " + iList2.getCapacity());
        iList2.add(10);
        iList2.add(30);
        iList2.add(50);
        iList2.add(70);
        iList2.add(100);
        System.out.println(iList2);



            //Взаимодействие с UnfairWaitList через  UnfairWaitList
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        UnfairWaitList<String> iList3 = new UnfairWaitList<String>();
        iList3.add("a");
        iList3.add("b");
        iList3.add("c");
        iList3.add("d");
        iList3.add("e");
        System.out.println(iList3);
        iList3.remove("d");
        iList3.remove("f");
        iList3.remove();
        iList3.moveToBack("b");
        System.out.println(iList3);



        iList = iList2;
        //iList.getCapacity();          не сработает
        System.out.println(iList);
    }



}
