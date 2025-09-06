package Math;

public class PalindromeNumber_9 {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        int rem = 0;

        int n = x;
        while (n != 0) {
            rem = 10 * rem + n % 10;
            n = n / 10;
        }
        System.out.print(rem);
        if (rem != x)
            return false;
        return true;
    }
}
