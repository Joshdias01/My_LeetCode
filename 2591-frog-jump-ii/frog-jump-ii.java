class Solution {
    public int maxJump(int[] nums) {
        int diff=0;
        for(int i=0;i<nums.length-1;i++){
            diff=Math.max(diff,nums[i+1]-nums[i]);
        }
        int low=diff,high=nums[nums.length-1]-nums[0];
        while(low<=high){
            int mid=(low+high)/2;
            if(check(nums,mid)){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    public boolean check(int[] nums,int mid){
    int n=nums.length;
    boolean[] used = new boolean[nums.length];

    // -- Forward
    int curr=0;

    while (curr!=n-1) {
        int next=curr;

        for (int i=curr+1;i<n;i++) {
            if (nums[i]-nums[curr]<=mid)
                next=i;
            else
                break;
        }

        if (next==curr)
            return false;
        if (next!=0 && next!=n-1)
            used[next]=true;
        curr=next;
    }
    // -- back return time..
    curr=n-1;
    while (curr != 0) {
        int next=curr;
        for (int i=curr-1;i>=0;i--) {
            if (used[i])
                continue;
            if (nums[curr]-nums[i]<=mid)
                next = i;
            else
                break;
        }
        if (next==curr)
            return false;
        curr=next;
    }
    return true;
}
}