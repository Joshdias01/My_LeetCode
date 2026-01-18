package Sorting;

import java.util.Arrays;

public class Recursive_Insertion {
    public static void main(String[] args) {
        int[] arr={14,9,15,12,6,8,13};
        insertionSort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr, int i, int n) {
        if(i==n) return;
        int j=i;
        while(j>0 && arr[j]<arr[j-1] ){
            Selection_sort.swap(arr,j-1,j);
            j--;
        }
        insertionSort(arr,i+1,n);
    }
}
