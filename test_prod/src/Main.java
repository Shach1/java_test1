import java.util.Scanner; // импортируем класс

                //1.4

//public class Main
//{
//    public static void main(String[] args)
//    {
//        int[] arr = new int[15];
//        for(int i = 0; i < arr.length; i++)     //заполняем массив
//        {
//            arr[i] = (int) (Math.random() * 100);
//        }
//
//        System.out.println("Массив до сортировки:");
//        for(int i = 0; i < arr.length;i++)      //вывод первоначального массива
//        {
//            System.out.print(arr[i] + " ");
//        }
//
//        int tmp;
//        for(int i = 0; i < arr.length - 1; i++)     //стандартная сортировка пузырьком
//        {
//            for(int j = 0; j < arr.length - 1 - i; j++)
//            {
//                if(arr[j] > arr[j+1])
//                {
//                    tmp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = tmp;
//                }
//            }
//        }
//        System.out.println("\nМассив после сортировки:");
//        for(int i = 0; i < arr.length;i++)      //вывод отсортированного массива
//        {
//            System.out.print(arr[i] + " ");
//        }
//
//    }
//}

            //4.2

public class Main
{
    public static void main(String[] args)
    {
        Priceable priceable = new Car("Tesla model X", 23000);
        System.out.println(priceable.getPrice());
        priceable = new Dog("Labrador", 500);
        System.out.println(priceable.getPrice());
    }
}
