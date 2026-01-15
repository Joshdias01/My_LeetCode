package Sorting;

import java.util.Arrays;

public class Bubble_sort {
    public static void main(String[] args) {
        int[] arr={14,9,15,12,6,8,13};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {
        for(int i=arr.length-1;i>=0;i--){
            int flag=0;
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    Selection_sort.swap(arr,j,j+1);
                    flag=1;
                }
            }
            if(flag==0) break;
            System.out.println("swapped");
        }
    }
}
