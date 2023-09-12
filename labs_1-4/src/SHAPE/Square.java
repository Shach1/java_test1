package SHAPE;

public class Square extends Rectangle
{
    public Square(){super(0, 0);}
    public Square(double side) {super(side, side);}
    public Square(double side, String color, boolean filled) {super(side, side, color, filled);}

    public double getSide()
    {
        return width;
    }
    public void setSide(double side)
    {
        width = side;
        lenght = side;
    }
    @Override
    public void setWidth(double w) {setSide(w);}
    @Override
    public void setLenght(double l) {setSide(l);}
    @Override
    public String toString() {
        return "Квадрат со стороной = " + lenght + "\tЦвет: " + color + "\tЗаполнен: " + filled + "\nПлощадь = " + getArea() + "\tПериметр = " + getPerimeter();
    }
}
