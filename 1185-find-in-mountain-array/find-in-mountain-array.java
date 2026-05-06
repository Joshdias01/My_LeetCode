/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray nums) {
        int low=1,high=nums.length()-2;
        if(nums.get(0)==target) return 0;
        int peak=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int curr=nums.get(mid);
            int prev=nums.get(mid-1);
            if(curr>prev && nums.get(mid+1)<curr)
            {
                peak=mid;
                break;
            }
            else if(curr<prev)
                high=mid-1;
            else
            low=mid+1;
        }
        int idx=-1;
        low=0;high=peak;
        while(low<=high){
            int mid=(low+high)/2;
            int val=nums.get(mid);
            if(val==target){
                idx=mid;
                high=mid-1;
            }else if(val>target){
                high=mid-1;
            }else 
            low=mid+1;
        }
        if(idx!=-1)
            return idx;
        low=peak;high=nums.length()-1;
        while(low<=high){
            int mid=(low+high)/2;
            int val=nums.get(mid);
            if(val==target){
                return mid;
            }else if(val>target){
                low=mid+1;
            }else 
            high=mid-1;
        }
        return idx;
    }
}