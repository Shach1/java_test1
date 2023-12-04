package lab9;
import java.util.Scanner;

public class Exception2
{
    public void exceptionDemo()
    {
        Scanner myScanner = new Scanner( System.in );
        System.out.println( "Enter an integer ");
        String intString = myScanner.next();
        try
        {
            int i = Integer.parseInt(intString);
            System.out.println( 2 / i );
        }
        catch (NumberFormatException e)
        {
            System.out.println( "Нельзя преобразовать к целому числу ");
        }
        catch (ArithmeticException e)
        {
            System.out.println( "Нельзя поделить на 0 ");
        }
        catch (Exception e)
        {
            System.out.println("Общее исключение");
        }
        finally
        {
            System.out.println("Я буду выполняться anyway");
        }
    }

}
