package Recursion;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7};
        reverse(arr,0);

        System.out.println(Arrays.toString(arr));
    }

    private static void reverse(int[] arr, int i) {
        if(i>=arr.length/2)
            return;
        swap(arr,i,arr.length-i-1);
        reverse(arr,i+1);
    }

    private static void swap(int[] arr, int i, int j) {
        arr[i]=arr[i]+arr[j];
        arr[j]=arr[i]-arr[j];
        arr[i]=arr[i]-arr[j];
    }
}