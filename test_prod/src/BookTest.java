        //2.3
public class BookTest
{
    public static void main(String[] args)
    {
        Book b1 = new Book("Пушкин", "Капитанская дочка", 1890);
        System.out.println(b1.getName() + '\n' + b1.getAuthor()+ "\t" + b1.getDate());

        Book b2 = new Book ("Самый богатый человек в Вавилоне", 2020);
        System.out.println(b2.getName() + '\n' + b2.getAuthor()+ "\t" + b2.getDate());

        b1.setDate(2049);
        b1.setName("Киберпанк");
        b2.setAuthor("asdadf");

        System.out.println("\nВывод после взаимодействия с экзэмплярами класса Book \n" + b1.getName() + '\n' + b1.getAuthor()+ "\t" + b1.getDate());
        System.out.println(b2.getName() + '\n' + b2.getAuthor()+ "\t" + b2.getDate());
    }
}
