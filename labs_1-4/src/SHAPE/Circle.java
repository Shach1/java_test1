package SHAPE;
public class Circle extends Shape
{
    protected double radius = 0;
    public Circle(){}
    public Circle(double radius)
    {
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled)
    {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    @Override
    public String toString() {
        return "Круг с радиусом = " + radius + "\tЦвет: " + color + "\tЗаполнен: " + filled + "\nПлощадь = " + getArea() + "\tПериметр = " + getPerimeter();
    }
}
