package exercise06;

import java.util.Scanner;

/**
 * Created by stefan on 09.12.16.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Bitte eine Reihe von Bits eingeben");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        BinaryString binaryString = new BinaryString(s);
        int numb = 0;
        try {
            numb = binaryString.toNumber();
        }
        catch (NoBinaryNumberException e) {
            numb = -1;
            System.out.println("Exception "+e.toString());
        }
        finally {
            System.out.println(numb);
        }
    }


}
