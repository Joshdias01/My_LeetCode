package Recursion;

public class FibonacciSeries {
    public static void main(String[] args) {
        int i=fib(5);
        System.out.println(i);
    }

    private static int fib(int i) {
        if(i<=1)
            return i;
        return (i-1)+(i-2);
    }
}