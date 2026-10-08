class Solution {
    public int pivotIndex(int[] nums) {
        int totalsum=0;
        int leftsum=0;
        for(int num:nums){
            totalsum+=num;
        }
        for(int i=0;i<nums.length;i++){
            if(leftsum==totalsum-leftsum-nums[i]){
                return i;
            }
            leftsum+=nums[i];
        }
        return -1;
    }
}