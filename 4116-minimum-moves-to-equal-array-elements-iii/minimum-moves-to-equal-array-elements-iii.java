class Solution {
    public int minMoves(int[] nums) {
        int maxVal=nums[0];
        long sum=0;

        for(int num:nums){
            if(num>maxVal){
                maxVal=num;
            }
            sum+=num;
        }

        return (int)((long)maxVal*nums.length-sum);
    }
}