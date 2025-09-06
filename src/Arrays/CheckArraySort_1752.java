package Arrays;

import java.util.Arrays;

public class CheckArraySort_1752 {
    public boolean check(int[] nums) {
        int[] b = Arrays.copyOf(nums, nums.length);
        Arrays.sort(b);
        int k = 0;
        while (k < nums.length) {
            b = Arrays.copyOf(nums, nums.length);
            Arrays.sort(b);
            reverse(b, 0, b.length - 1);
            reverse(b, 0, k - 1);
            reverse(b, k, b.length - 1);
            System.out.println(Arrays.toString(b));
            if (Arrays.equals(nums, b))
                return true;
            else
                k++;
        }
        return false;
    }

    public static void reverse(int[] b, int start, int end) {
        while (start < end) {
            int temp = b[start];
            b[start] = b[end];
            b[end] = temp;
            start++;
            end--;
        }
    }


// Optimal solution


// class Solution {
//     public boolean check(int[] nums) {
//         int count = 0, n = nums.length;

//         for (int i = 0; i < n; i++) {
//             if (nums[i] > nums[(i + 1) % n])
//                 count++;
//             if (count > 1)
//                 return false;
//         }

//         return true;
//     }
// }
}
