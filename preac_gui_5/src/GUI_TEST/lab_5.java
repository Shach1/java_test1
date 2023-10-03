package GUI_TEST;
import static java.lang.Math.sqrt;
import static java.lang.Math.ceil;
import java.util.Scanner;

public class lab_5
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        findPrimeFactors(num, 2);
    }
    public static void findPrimeFactors(int n, int delit) {
        if (n <= 1) {return;}

        if (n % delit == 0)
        {
            while (n % delit == 0)
            {
                System.out.print(delit + " ");
                n /= delit;
            }
        }
        findPrimeFactors(n, delit + 1);
    }
}

