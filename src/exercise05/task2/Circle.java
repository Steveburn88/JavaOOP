package exercise05.task2;

/**
 * Created by stefan on 17.11.16.
 */
public class Circle extends TwoDimensional {
    double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return this.r * this.r * Math.PI;
    }

    @Override
    public double getCircumference() {
        return 2 * Math.PI * this.r;
    }

    @Override
    public String toString() {
        return "Circle with Radius " + this.r;
    }
}
