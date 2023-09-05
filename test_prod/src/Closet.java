public class Closet extends Furniture
{
    private boolean mirror;
    private short doors;

    public Closet(int width, int height, int weight, int length, short doors, boolean mirror)
    {
        super(width, height, weight, length);
        this.doors = doors;
        this.mirror = mirror;
    }

    public void setDoors(short doors) {
        this.doors = doors;
    }

    public void setMirror(boolean mirror) {
        this.mirror = mirror;
    }

    public short getDoors() {
        return doors;
    }

    public boolean isMirror() {
        return mirror;
    }
    public void showInfo()
    {
        System.out.println("Шкаф");
        super.showInfo();
        System.out.print("Кол-во дверец: " + doors + " Зеркало: ");
        if (isMirror()){System.out.println("Есть");}
        else {System.out.println("Нет");}
    }
}
