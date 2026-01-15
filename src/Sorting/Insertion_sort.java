package Sorting;

import java.util.Arrays;

public class Insertion_sort {
    public static void main(String[] args) {
        int[] arr={14,9,15,12,6,8,13};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {
        for(int i=1;i< arr.length;i++){
            int j=i;
            while (j>0 && arr[j-1]>arr[j])
            {
                Selection_sort.swap(arr,j,j-1);
                j--;
            }
        }
    }
}
