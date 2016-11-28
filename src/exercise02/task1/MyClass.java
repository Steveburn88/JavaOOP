package exercise02.task1;

/**
 * Created by stefan on 27.10.16.
 */
public class MyClass {
    public static int numberOfObjects=0;
    public int n;
    public double d;

    public MyClass() {
        this(0);
        System.out.println("first constructor called");
    }

    public MyClass(int n) {
        this(n,0);
        System.out.println("second constructor called");
    }

    public MyClass(double d){
        this(0,d);
        System.out.println("third constructor called");
    }

    public MyClass(int n, double d){
        System.out.println("fourth constructor called");
        this.n=n;
        this.d=d;
        numberOfObjects++;
    }

    public String toString() {
        return("n="+n+" d="+d);
    }
}
