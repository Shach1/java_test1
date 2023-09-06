                //2.3
public class FurnitureShop
{
    public static void main(String[] args)
    {
        Sofa s1 = new Sofa(200, 100, 500, 300, (short) 7);
        Sofa s2 = new Sofa(300, 120, 400, 300, (short) 8);
        Sofa[] sofas = new Sofa[2];

        Closet c1 = new Closet(80,250, 200, 600, (short) 4, true);
        Closet c2 = new Closet(100,300, 50, 300, (short) 2, false);
        Closet[] closets = new Closet[2];

        System.out.println("\tВывод до изменений");
        s1.showInfo();
        c1.showInfo();

        c1.setMirror(false);
        s1.setLegs((short)5);
        System.out.println("\tВывод после изменений");
        s1.showInfo();
        c1.showInfo();

        System.out.print("\tВторой шкаф весит: " + c2.getWeight());

    }
}
