package exercise03.task3;

/**
 * Created by stefan on 03.11.16.
 */
public class PlanetRectangle extends Rectangle {
    public Point p;

    public PlanetRectangle() {
        super();
    }

    public PlanetRectangle(double a) {
        super(a);
    }

    public PlanetRectangle(double a, double b) {
        super(a, b);
    }

    public boolean isInside(Point p) {
        return (p.x < a && p.y < b);
    }
}
