public class Sofa extends Furniture
{
    private short legs;
    Sofa(int width, int height, int weight, int length, short legs)
    {
        super(width, height, weight, length);
        this.legs = legs;
    }

    public short getLegs() {
        return legs;
    }

    public void setLegs(short legs) {
        this.legs = legs;
    }
    public void showInfo()
    {
        System.out.println("Диван");
        super.showInfo();
        System.out.println("Кол-во ножек: " + legs);
    }
}
