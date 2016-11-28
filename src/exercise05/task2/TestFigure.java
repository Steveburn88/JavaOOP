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
    static TwoDimensionalComparator comparator2 = new TwoDimensionalComparator();
    static ThreeDimensionalComparator comparator3 = new ThreeDimensionalComparator();

    public static TwoDimensional getMinimumArea(ArrayList<TwoDimensional> al) {
        Collections.sort(al, comparator2);
        return al.get(0);
    }

    public static TwoDimensional getMaximumArea(ArrayList<TwoDimensional> al) {
        Collections.sort(al, comparator2);
        return al.get(al.size()-1);
    }

    public static ThreeDimensional getMinimumVolume(ArrayList<ThreeDimensional> al) {
        Collections.sort(al, comparator3);
        return al.get(0);
    }

    public static ThreeDimensional getMaximumVolume(ArrayList<ThreeDimensional> al) {
        Collections.sort(al, comparator3);
        return al.get(al.size()-1);
    }

    public static void main(String[] args) {
        ArrayList<Figure> figs = new ArrayList<Figure>();
        ArrayList<TwoDimensional> figs2 = new ArrayList<TwoDimensional>();
        ArrayList<ThreeDimensional> figs3 = new ArrayList<ThreeDimensional>();
        /*figs3.add(new Sphere(4));
        figs3.add(new Sphere(5));
        figs3.add(new Sphere(6));*/
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Bitte gib die gewünschte Form ein.");
            String rx = sc.nextLine();
            if (rx.equals("Circle") || rx.equals("circle")) {
                System.out.println("Ein Kreis? Na gut. Bitte gib den Radius an.");
                double r = sc.nextDouble();
                figs.add(new Circle(r));
            }
            if (rx.equals("Sphere") || rx.equals("sphere")) {
                System.out.println("Eine Kugel? Na gut. Bitte gib den Radius an.");
                double r = sc.nextDouble();
                figs.add(new Sphere(r));
            }
            if (rx.equals("exit") || rx.equals("quit")) break;
        } while (true);

        for (int i=0; i<figs.size(); i++) {
            if (figs.get(i) instanceof TwoDimensional) {
                figs2.add((TwoDimensional) figs.get(i));
            }
            if (figs.get(i) instanceof ThreeDimensional) {
                figs3.add((ThreeDimensional) figs.get(i));
            }
        }

        System.out.println("2D Figures in figs3:");
        for (int j=0; j<figs2.size(); j++) {
            figs2.get(j).toString();
        }

        System.out.println("3D Figures in figs3:");
        for (int k=0; k<figs3.size(); k++) {
            figs3.get(k).toString();
        }

        System.out.println("Figure with max Area");
        TwoDimensional max2 = getMaximumArea(figs2);
        System.out.print(max2.toString());

        System.out.println("Figure with max Volume");
        ThreeDimensional max3 = getMaximumVolume(figs3);
        System.out.print(max3.toString());

    }
}
