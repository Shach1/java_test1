package pack;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class prac_8
{
    public static void main(String[] args) throws IOException
    {
        Scanner scan = new Scanner(System.in);
        String text = "";

                //ЧТЕНИЕ
        FileReader fr = new FileReader("src/pack/text.txt");
        int c;
        while((c = fr.read()) != -1) text += String.valueOf(Character.toChars(c));
        fr.close();

        System.out.println(text + "Введите новые данные: ");
        String input = scan.nextLine() + "\n";

                //ЗАПИСЬ
        FileWriter fw = new FileWriter( "src/pack/text.txt", true );
        fw.write(input);
        fw.close();

                //ЧТЕНИЕ измененного файла
        text = "";
        fr = new FileReader( "src/pack/text.txt" );
        while((c = fr.read()) != -1) text += String.valueOf(Character.toChars(c));
        fr.close();

        System.out.print(text);
    }
}
