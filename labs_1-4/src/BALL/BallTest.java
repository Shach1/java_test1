package BALL;

public class BallTest
{
    public static void main(String[] args) {
        Ball b1 = new Ball(100, 100);
        System.out.println(b1);

        b1.move(30, 15);
        System.out.println(b1);

        Ball b2 = new Ball();
        b2.setXY(55, 30);
        System.out.println(b2);
    }
}
