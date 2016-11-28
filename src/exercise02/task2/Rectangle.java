package exercise02.task2;

/**
 * Created by stefan on 27.10.16.
 */
public class Rectangle {
    public double a, b;
    public int numberOfRects=0;

    public Rectangle() {
        this(1,1);
        System.out.println("Constructor without parameters");
    }

    public Rectangle(double a) {
        this(a, a);
        System.out.println("Constructor with one parameter");
    }

    public Rectangle(double a, double b) {
        this.a=a;
        this.b=b;
        numberOfRects++;
        System.out.println("Constructor with two parameters");
    }

    public double area() {
        return a*b;
    }

    public double circumference() {
        return a+a+b+b;
    }

    public double diagonal() {
        return Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
    }

    public static boolean areaIsBigger(Rectangle r1, Rectangle r2) {
        return r1.area()>r2.area();
    }

    public static boolean circimferenceIsBigger(Rectangle r1, Rectangle r2) {
        return r1.circumference()>r2.circumference();
    }
}
