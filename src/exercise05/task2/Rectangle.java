package exercise05.task2;

/**
 * Created by stefan on 28.11.16.
 */
public class Rectangle extends TwoDimensional {
    double a, b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return this.a * this.b;
    }

    @Override
    public double getCircumference() {
        return 2 * this.a + 2 * this.b;
    }

    @Override
    public String toString() {
        return "Rectangle with Length " + this.a + " and Width " + this.b;
    }
}