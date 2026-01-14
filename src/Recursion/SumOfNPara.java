package Recursion;

public class SumOfNPara {
    public static void main(String[] args) {
        sumOfnPara(5,0);
    }

    private static void sumOfnPara(int i,int sum) {
        if(i<=0){
            System.out.println(sum);
            return;
        }
        sumOfnPara(i-1,sum+i);
    }
}
