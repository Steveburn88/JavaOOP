package exercise01;

/**
 * Created by stefan on 23.10.16.
 */
public class Fibonacci {

    public static int calculateFibonacci (int n) {
        int a=1, b=1;
        for (int i=2; i<=n; i++) {
            int c=a+b;
            a=b;
            b=c;
        }
        return b;
    }
}
