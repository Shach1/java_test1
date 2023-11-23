package pack;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

//Напишите программу, которая объединяет два списка данных о студентах
//в один отсортированный списках с использованием алгоритма сортировки
//слиянием.

public class lab_6
{
    public static void main(String[] args)
    {
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Student> list1 = new ArrayList<>();
        ArrayList<Student> list2 = new ArrayList<>();
        ArrayList<Student> studentsSorted;
        list1.add(new Student("John", 3));
        list1.add(new Student("Tom", 7));
        list1.add(new Student("Din", 9));
        list1.add(new Student("Sam", 11));
        list2.add(new Student("Shrek", 2));
        list2.add(new Student("Grass", 0));
        list2.add(new Student("Tor", 12));
        students.addAll(list1);
        students.addAll(list2);

        studentsSorted = sortingStudents.mergeSort(students);

        for (Student student : studentsSorted)
        {
            System.out.println(student.getName() + ": " + student.getScore());
        }
    }
}
