package lab8;
import java.util.Scanner;
public class ThrowsDemo
{
    //заданмие после листинг 4
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
        // do something with the key
    }
*/

    //заданмие после листинг 5
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

    public void getKey()
    {
        Scanner myScanner = new Scanner( System.in );
        String key = myScanner.next();
        printDetails( key );
    }
    public void printDetails(String key) {
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
    private String getDetails(String key) {
        if(key == "") {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key; }


}
