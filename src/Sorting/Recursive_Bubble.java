package Sorting;

import java.util.Arrays;

public class Recursive_Bubble {
    public static void main(String[] args) {
        int[] arr={14,9,15,12,6,8,13};
        bubbleSort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr, int n) {
        if(n==1) return;
        int flag=0;
        for(int j=0;j<n-1;j++){
            if(arr[j]>arr[j+1]){
                flag=1;
                Selection_sort.swap(arr,j,j+1);
            }
        }
        if(flag==0) return;
        bubbleSort(arr,n-1);
    }
}
