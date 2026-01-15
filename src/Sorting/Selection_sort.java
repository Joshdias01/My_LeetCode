package Sorting;

import java.util.Arrays;

public class Selection_sort {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void selectionSort(int[] arr) {
        for(int i=0;i< arr.length;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]) {
                    min = j;

                }
            }
            swap(arr,i,min);
            System.out.println("did swap");
        }
    }

    private static void swap(int[] arr, int i, int min) {
        int temp=arr[i];
        arr[i]=arr[min];
        arr[min]=temp;
    }
}
