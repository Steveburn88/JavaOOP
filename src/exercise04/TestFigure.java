package exercise04;

/**
 * Created by stefan on 17.11.16.
 */
public class TestFigure {
    public static void main(String[] args) {
        Figure[] figures = new Figure[5];
        figures[0] = new Circle(1.0);
        figures[1] = new Rectangle(2.0, 3.0);
        figures[2] = new Sphere(3.0);
        figures[3] = new Cylinder(1.0, 5.0);
        figures[4] = new Cuboid(3.0, 5.0, 2.0);

        for (int i=0; i<figures.length; i++) {
            if (figures[i] instanceof Circle) {
                System.out.println("Figure Nr." + i + ": " + figures[i].toString());
                System.out.println("Circumference: "+((Circle)figures[i]).getCircumference());
                System.out.println("Area: "+((Circle)figures[i]).getArea());
                System.out.println();
            }
            if (figures[i] instanceof Rectangle) {
                System.out.println("Figure Nr." + i + ": " + figures[i].toString());
                System.out.println("Circumference: "+((Rectangle)figures[i]).getCircumference());
                System.out.println("Area: "+((Rectangle)figures[i]).getArea());
                System.out.println();
            }
            if (figures[i] instanceof Sphere) {
                System.out.println("Figure Nr." + i + ": " + figures[i].toString());
                System.out.println("Surface: "+((Sphere)figures[i]).getSurface());
                System.out.println("Volume: "+((Sphere)figures[i]).getVolume());
                System.out.println();
            }
            if (figures[i] instanceof Cylinder) {
                System.out.println("Figure Nr." + i + ": " + figures[i].toString());
                System.out.println("Surface: " + ((Cylinder) figures[i]).getSurface());
                System.out.println("Volume: " + ((Cylinder) figures[i]).getVolume());
                System.out.println();
            }
            if (figures[i] instanceof Cuboid) {
                System.out.println("Figure Nr." + i + ": " + figures[i].toString());
                System.out.println("Surface: " + ((Cuboid) figures[i]).getSurface());
                System.out.println("Volume: " + ((Cuboid) figures[i]).getVolume());
                System.out.println();
            }
        }

    }

}
