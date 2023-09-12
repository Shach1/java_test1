package SHAPE;

public class Rectangle extends Shape
{
    protected double width;
    protected double lenght;
    public Rectangle(){width = 0.0; lenght = 0.0;}
    public Rectangle(double w, double l) {width = w; lenght = l;}
    public Rectangle(double w, double l, String c, boolean f){width = w; lenght = l; color = c; filled = f;}

    public double getWidth() {
        return width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    @Override
    public double getArea() {
        return width * lenght;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + lenght);
    }

    @Override
    public String toString() {
        return "Прямоугольник с длинной = " + lenght + " и шириной = " + width + "\tЦвет: " + color + "\tЗаполнен: " + filled + "\nПлощадь = " + getArea() + "\tПериметр = " + getPerimeter();
    }
}
