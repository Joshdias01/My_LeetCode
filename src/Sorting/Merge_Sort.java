package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge_Sort {
    public static void main(String[] args) {
        int[] arr = {14,9,15,12,6,8,13};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    private static void mergeSort(int[] arr,int low,int high) {
        if(low>=high) return;
        int mid=(low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        int i=low;
        int j=mid+1;
        List<Integer> temp = new ArrayList<>();
        while(i<=mid && j<=high){
            if(arr[i]<=arr[j])
                temp.add(arr[i++]);
            else
                temp.add(arr[j++]);
        }
        while (i<=mid)
            temp.add(arr[i++]);
        while (j<=high)
            temp.add(arr[j++]);
        for(i=low;i<=high;i++){
            arr[i]=temp.get(i-low);
        }
    }
}
