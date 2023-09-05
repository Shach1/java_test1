public class Dog implements Priceable
{
    private String species;
    private float price;

    Dog(String species, float price)
    {
        this.species = species;
        this.price = price;
    }
    public float getPrice(){return price;}
}
