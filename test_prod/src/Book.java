public class Book
{
    private String author = "incognito";
    private String name = "~~~";
    private int date;

    public Book(String author, String name, int date )
    {
        this.author = author;
        this.name = name;
        this.date = date;
    }
    public Book( String name, int date )
    {
        this.name = name;
        this.date = date;
    }

    public String getAuthor(){ return author; };
    public String getName(){ return name; };
    public int getDate(){ return date; };

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
