package exercise03.task3;

/**
 * Created by stefan on 03.11.16.
 */
public class TestPlanetRectangle {
    public static void main(String[] args) {
        PlanetRectangle rect1 = new PlanetRectangle(3, 5);
        Point p = new Point(2, 1);
        boolean isIt = rect1.isInside(p);
        System.out.println(isIt);
    }
}
