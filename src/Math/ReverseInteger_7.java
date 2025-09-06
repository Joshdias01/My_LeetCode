package Math;

public class ReverseInteger_7 {
    public int reverse(int x) {
        int rem = x;
        long no = 0;
        while (rem != 0) {
            no = 10 * no + rem % 10;
            if (no < Integer.MIN_VALUE || no > Integer.MAX_VALUE)
                return 0;
            rem = rem / 10;
        }
        return (int) no;
    }
}
