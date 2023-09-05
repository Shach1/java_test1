public abstract class Furniture
{
    private int width;    //ширина
    private int height;   //высота
    private int weight;   //вес
    private int length;   //длина

    Furniture(int width, int height, int weight, int length)
    {
        this.width = width;
        this.height = height;
        this.weight = weight;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public int getLength() {return length;}

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void showInfo()
    {
        System.out.println("Ширина: " + width + " Длина: " + length + "  Высота: " + height + " Масса: " + weight);
    }

}
