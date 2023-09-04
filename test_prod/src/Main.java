import java.util.Scanner; // импортируем класс

                //1
/*
public class Main
{
    public static void main(String[] args)
    {
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++)     //Создание и заполнение массива
        {
            arr[i] = i + 1;
        }

        int sum = 0;
        for(int i = 0; i < arr.length; i++)     //циклом for
        {
            sum += arr[i];
        }
        System.out.println("Через цикл for сумма = " + sum);
        sum = 0;

        int j = 0;
        while(j < arr.length)
        {
            sum += arr[j];
            j++;
        }
        System.out.println("Через цикл while сумма = " + sum);
        sum = 0;

        int k = 0;
        do {
            sum += arr[k];
            k++;

        }while (k < arr.length);
        System.out.println("Через цикл do while сумма = " + sum);
    }
}
*/

                //3
public class Main
{
    public static void main(String[] args)
    {
        double sum_row = 0;
        for(int i = 1; i <= 10; i++)
        {
            sum_row += 1.0 / i;
        }
        System.out.println(sum_row);
    }
}

