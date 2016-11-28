package exercise05.task1;

import com.sun.javafx.css.converters.StringConverter;
import javafx.beans.binding.IntegerExpression;

import java.util.*;
import java.util.Scanner;
/**
 * Created by stefan on 17.11.16.
 */
public class Main {

    public static ArrayList<Integer> sortInteger(ArrayList<Integer> al) {
        Collections.sort(al);
        return al;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList<Integer>();
        ArrayList<Integer> sortedarraylist;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte gib deine Zahlen ein.");
        do {
            String rx = sc.nextLine();

            if (rx.isEmpty()) break;
            else arraylist.add(Integer.valueOf(rx));
        } while (true);
        System.out.println("unsortierte Liste");
        arraylist.forEach(System.out::println);

        sortedarraylist = sortInteger(arraylist);

        System.out.println("sortierte Liste");
        sortedarraylist.forEach(System.out::println);
    }
}
