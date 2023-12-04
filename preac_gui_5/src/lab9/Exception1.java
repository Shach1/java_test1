package lab9;
                            //1
public class Exception1
{
    public void exceptionDemo()
    {
        //System.out.println( 2 / 0 );    //при делении 2.0 на 0.0 получается бесконечность
        try
        {
            System.out.println( 2 / 0 );
        } catch ( ArithmeticException e )
        {
            System.out.println("Attempted division by zero");
        }
    }

}
