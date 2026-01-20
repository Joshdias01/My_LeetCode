package Arrays;

public class Second_Largest {
    public static void main(String[] args) {
        int[] arr = {19,9,15,12,6,8,13};
        secLargest(arr);
    }

    private static void secLargest(int[] arr) {
        int largest=arr[0];
        int secLarg=Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                secLarg=largest;
                largest=arr[i];
            }else if(arr[i]<largest && arr[i]>secLarg){
                secLarg=arr[i];
            }
        }
        System.out.println(secLarg);
    }
}
