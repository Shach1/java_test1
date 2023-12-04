package lab9;
import java.util.Scanner;
public class ThrowsDemo
{
        //заданмие после листинг 4
    //Добавьте блок try-catch таким образом, чтобы перехватить исключение и рассмотреть его внутри метода.
/*
    public void getDetails(String key)
    {
        try
        {
            if(key == null)
            {
                throw new NullPointerException( "null key in getDetails" );
            }
        }
        catch ( NullPointerException e) { System.out.println("Ощибка обработанная внутри метода: " + e.getMessage());}
    }
*/

        //заданмие после листинг 5
    //Теперь добавьте блоки try-catch, чтобы использовать для вывода сообщений метод printMessage(),
    // таким образом, чтобы исключения обрабатывались и программа не “ломалась”.
/*
    public void printMessage(String key)
    {
        try
        {
            String message = getDetails(key);
            System.out.println( message );
        }
        catch (NullPointerException e)
         {System.out.println( "data for null does not exist" );}
    }
    public String getDetails(String key) {
        if(key == null)
        {
            throw new NullPointerException( "null key in getDetails" );
        }
        return "data for " + key; }
*/

    //заданмие после листинг 6
 /*
    public void getKey()
    {
        Scanner myScanner = new Scanner( System.in );
        String key = myScanner.next();
        try
        {
            printDetails( key );
        } catch (Exception e)
        {
            System.out.println( "Поймано исключение " + e.getMessage() );
        }
    }
    public void printDetails(String key) throws Exception
    {
        try
        {
            String message = getDetails(key);
            System.out.println( message );
        }
        catch ( Exception e)
        {
            throw e;
        }
    }
    private String getDetails(String key) throws Exception
    {
        if(key == "")
        {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key;
    }
*/

        //заданмие после листинг 7
    //Измените этот код следующим образом:
    //1.	Удалите  throws Exception из метода getKey().
    //2.	Измените метод getKey(), добавив try-catch блок для обработки исключений.
    //3.	Добавьте цикл к getKey() таким  образом,  чтобы пользователь получил еще один шанс на ввод значение ключа

    public void getKey()
    {
        Scanner myScanner = new Scanner( System.in );
        while (true)
        {
            try
            {
                System.out.print("Enter Key ");
                String key = myScanner.nextLine();
                printDetails( key );
                break;
            }
            catch (Exception e)
            {
                System.out.println( "Поймано исключение " );
            }
        }
    }
    public void printDetails(String key) throws Exception
    {
        String message = getDetails(key);
        System.out.println( message );
    }
    private String getDetails(String key) throws Exception
    {
        if(key.equals("0"))
        {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key;
    }

}
