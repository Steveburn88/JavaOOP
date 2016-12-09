package exercise06;


/**
 * Created by stefan on 09.12.16.
 */
public class BinaryString {
    String bs;

    public BinaryString(String bs) {
        this.bs = bs;
    }

    public int toNumber() throws NoBinaryNumberException{
        char[] bins = bs.toCharArray();
        int res = 0;
        for (int i = bins.length-1; i >= 0; i--) {
            if (bins[i] == '1') {
                res += Math.pow(2, i);
            }
            if (bins[i] != '0' && bins[i] != '1') {
                throw new NoBinaryNumberException(bs, i);
            }
        }
        return res;
    }
}
