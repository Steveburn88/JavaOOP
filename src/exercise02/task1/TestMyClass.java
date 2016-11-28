package exercise02.task1;

/**
 * Created by stefan on 27.10.16.
 */
public class TestMyClass {
    public static void main(String[] args) {
        MyClass[] a = new MyClass[10];
        a[0]=new MyClass();
        a[1]=new MyClass(3);
        a[2]=new MyClass(3.14);
        a[3]=new MyClass(3,4.5);
        System.out.println("Number of Objects: "+MyClass.numberOfObjects);
        for(int i=0; i < MyClass.numberOfObjects; i++){
            System.out.println("Object no. "+(i+1)+" : "+a[i].toString());
        }
    }
}
