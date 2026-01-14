package Recursion;

public class SumOfNFunctional {
    public static void main(String[] args) {
        int sol=sumOfN(5);
        System.out.println(sol);
    }

    private static int sumOfN(int i) {
        if(i<=0)
            return i;
        return i+sumOfN(i-1);
    }
}
