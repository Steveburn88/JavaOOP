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

public class TestFigure {
    ThreeDimensionalComparator comparator = new ThreeDimensionalComparator();

    public ThreeDimensional getMinimum(ArrayList<ThreeDimensional> al) {
        Collections.sort(al, comparator);
        return al.get(0);
    }

    public ThreeDimensional getMaximum(ArrayList<ThreeDimensional> al) {
        Collections.sort(al, comparator);
        return al.get(al.size()-1);
    }

    public static void main(String[] args) {
        ArrayList<Figure> figs = new ArrayList<Figure>();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Bitte gib die gewünschte Form ein.");
            String rx = sc.nextLine();
            if (rx == "Circle" || rx == "circle") {
                System.out.println("Ein Kreis? Na gut. Bitte gib den Radius an.");
                double r = sc.nextDouble();
                figs.add(new Circle(r));
            }
            if (rx == "Sphere" || rx == "sphere") {
                System.out.println("Eine Kugel? Na gut. Bitte gib den Radius an.");
                double r = sc.nextDouble();
                figs.add(new Sphere(r));
            }
            if (rx.isEmpty()) break;
            else break;
        } while (true);

        figs.forEach((a)->a.toString());

        System.out.println("Figure with max Area");
        ThreeDimensional maxFigure = getMaximum(figs);


    }
}
