package Arrays;

public class MaxAverageSubArray_643 {
    public double findMaxAverage(int[] nums, int k) {

        int sum = 0, maxSum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        maxSum = sum;
        System.out.println(sum);
        for (int i = k; i < nums.length; i++) {
            sum -= nums[i - k];
            sum += nums[i];
            System.out.println(sum);
            maxSum = Math.max(maxSum, sum);
        }
        return (double) maxSum / k;
    }
}
