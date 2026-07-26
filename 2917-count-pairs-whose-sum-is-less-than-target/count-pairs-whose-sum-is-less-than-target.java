class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int count=0;
        // for(int i=0;i<nums.size();i++){
        //     int find=(target-1)-nums.get(i);
        //     count=check(nums,find);
        // }
        // return count;
        int i=0,j=nums.size()-1;
        for(i=0;i<nums.size();i++){
            j=nums.size()-1;
            while(i<j){
                if(nums.get(i)+nums.get(j)<target){
                    count+=j-i;
                    break;
                }
                j--;
            }
        }
        return count;
    }
    int check(List<Integer> nums,int target){
        int low=0,high=nums.size()-1;
        while(low<=high){
            int mid=(low+high)/2;
            int ele=nums.get(mid);
            if(ele==target){
                return mid;
            }else if(ele<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return 0;
    }
}