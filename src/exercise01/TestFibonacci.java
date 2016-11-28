package exercise01;

import java.util.Scanner;

/**
 * Created by stefan on 23.10.16.
 */
public class TestFibonacci {

    public static void main(String[] args){
        System.out.println("Welche Fibonacci-Zahl soll berechnet werden?");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int fibnum=Fibonacci.calculateFibonacci(k);
        System.out.println(fibnum);
    }
}
