package exercise05.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by stefan on 17.11.16.
 */
class ThreeDimensionalComparator implements Comparator<ThreeDimensional> {
    public int compare(ThreeDimensional f1, ThreeDimensional f2) {
        return Double.compare(f1.getVolume(), f2.getVolume());
    }
}

class TwoDimensionalComparator implements Comparator<TwoDimensional> {
    public int compare(TwoDimensional f1, TwoDimensional f2) {
        return Double.compare(f1.getArea(), f2.getArea());
    }
}

public class TestFigure {
    private static TwoDimensionalComparator comparator2 = new TwoDimensionalComparator();
    private static ThreeDimensionalComparator comparator3 = new ThreeDimensionalComparator();

    private static TwoDimensional getMinimumArea(ArrayList<TwoDimensional> al) {
        Collections.sort(al, comparator2);
        return al.get(0);
    }

    private static TwoDimensional getMaximumArea(ArrayList<TwoDimensional> al) {
        Collections.sort(al, comparator2);
        return al.get(al.size()-1);
    }

    private static ThreeDimensional getMinimumVolume(ArrayList<ThreeDimensional> al) {
        Collections.sort(al, comparator3);
        return al.get(0);
    }

    private static ThreeDimensional getMaximumVolume(ArrayList<ThreeDimensional> al) {
        Collections.sort(al, comparator3);
        return al.get(al.size()-1);
    }

    public static void main(String[] args) {
        ArrayList<Figure> figs = new ArrayList<>();
        ArrayList<TwoDimensional> figs2 = new ArrayList<>();
        ArrayList<ThreeDimensional> figs3 = new ArrayList<>();
        /*figs3.add(new Sphere(4));
        figs3.add(new Sphere(5));
        figs3.add(new Sphere(6));*/
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Bitte gib die gewünschte Form ein. Oder \'exit\' zum beenden.");
            String rx = sc.nextLine();
            if (rx.equals("Circle") || rx.equals("circle")) {
                System.out.println("Ein Kreis? Na gut. Bitte gib den Radius an.");
                double r = sc.nextDouble();
                sc.nextLine();      //otherwise the "\n" won't be read and the first println will be executed twice
                figs.add(new Circle(r));
            }
            if (rx.equals("Rectangle") || rx.equals("rectangle")) {
                System.out.println("Ein Rechteck? Na gut. Bitte gib Länge und Breite an.");
                System.out.println("Zuerst die Länge");
                double a = sc.nextDouble();
                sc.nextLine();      //otherwise the "\n" won't be read and the first println will be executed twice
                System.out.println("Jetzt die Breite");
                double b = sc.nextDouble();
                sc.nextLine();      //otherwise the "\n" won't be read and the first println will be executed twice
                figs.add(new Rectangle(a, b));
            }
            if (rx.equals("Sphere") || rx.equals("sphere")) {
                System.out.println("Eine Kugel? Na gut. Bitte gib den Radius an.");
                double r = sc.nextDouble();
                sc.nextLine();      //otherwise the "\n" won't be read and the first println will be executed twice
                figs.add(new Sphere(r));
            }
            if (rx.equals("exit") || rx.equals("quit")) break;
        } while (true);

        for (Figure fig : figs) {
            if (fig instanceof TwoDimensional) {
                figs2.add((TwoDimensional) fig);
            }
            if (fig instanceof ThreeDimensional) {
                figs3.add((ThreeDimensional) fig);
            }
        }

        System.out.println("2D Figures in figs2: ");
        if (figs2.isEmpty()) {
            System.out.println("None");
        }
        else {
            for (TwoDimensional aFigs2 : figs2) {
                System.out.println(aFigs2.toString());
            }
        }

        System.out.println("3D Figures in figs3: ");
        if (figs3.isEmpty()) {
            System.out.println("None");
        }
        else {
            for (ThreeDimensional aFigs3 : figs3) {
                System.out.println(aFigs3.toString());
            }
        }

        System.out.println();
        System.out.println("MAXIMAL Figures");
        System.out.println("Figure with max Area: ");
        if (figs2.isEmpty()) {
            System.out.println("None");
        }
        else {
            TwoDimensional max2 = getMaximumArea(figs2);
            System.out.println(max2.toString());
        }

        System.out.println("Figure with max Volume: ");
        if (figs3.isEmpty()) {
            System.out.println("None");
        }
        else {
            ThreeDimensional max3 = getMaximumVolume(figs3);
            System.out.println(max3.toString());
        }

        System.out.println();
        System.out.println("MINIMAL Figures");
        System.out.println("Figure with min Area: ");
        if (figs2.isEmpty()) {
            System.out.println("None");
        }
        else {
            TwoDimensional min2 = getMinimumArea(figs2);
            System.out.println(min2.toString());
        }

        System.out.println("Figure with min Volume: ");
        if (figs3.isEmpty()) {
            System.out.println("None");
        }
        else {
            ThreeDimensional min3 = getMinimumVolume(figs3);
            System.out.println(min3.toString());
        }
    }
}
