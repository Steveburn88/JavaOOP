package exercise06;

/**
 * Created by stefan on 09.12.16.
 */
public class NoBinaryNumberException extends Exception {
    public NoBinaryNumberException() {super();}
    public NoBinaryNumberException(String s) {super(s);}
    public NoBinaryNumberException(String s, int pos) {System.out.println(s+" is not a binary number, position #"+(pos+1)+" is wrong!");}
}
