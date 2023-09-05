public class Car implements Priceable
{
    private String model;
    private float price;

    Car(String model, float price)
    {
        this.model = model;
        this.price = price;
    }
    public float getPrice(){return price;}
}
