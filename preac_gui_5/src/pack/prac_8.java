package pack;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//Добавить в конец исходного файла текст, введённый с клавиатуры
public class prac_8
{
    public static void main(String[] args) throws IOException
    {
        Scanner scan = new Scanner(System.in);
        String text = "";

        loop: while(true)
        {
            System.out.println("Введите одну из команд:\n\t1 - Чтение файла\n\t2 - Дозапись файла\n\t3 - Перезапись файла\n\t0 - Выход из программы");
            switch (scan.nextLine())
            {
                case ("1"):
                {
                    FileReader fr = new FileReader("src/pack/text.txt");
                    int c;
                    while((c = fr.read()) != -1) text += String.valueOf(Character.toChars(c));
                    fr.close();
                    System.out.println("Текст из файла:\n" + text);
                    text = "";
                    break;
                }
                case ("2"):
                {
                    String input = scan.nextLine() + "\n";
                    FileWriter fw = new FileWriter( "src/pack/text.txt", true );
                    fw.write(input);
                    fw.close();
                    break;
                }
                case ("3"):
                {
                    String input = scan.nextLine() + "\n";
                    FileWriter fw = new FileWriter( "src/pack/text.txt", false );
                    fw.write(input);
                    fw.close();
                    break;
                }
                case ("0"): break loop;
                default:
                    System.out.println("Введена неизвестная комнда!");
                    break;
            }
        }
    }
}
