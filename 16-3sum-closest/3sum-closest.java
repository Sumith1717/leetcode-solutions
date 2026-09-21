class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = nums[0]+nums[1]+nums[2]; //first triplet

        for(int i=0;i<nums.length-2;i++){
            int left = i+1;
            int right = nums.length-1;

            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];

                //update the answer if it is closer
                if(Math.abs(target-sum)<Math.abs(target-ans)){
                    ans=sum;
                }

                //move pointers
                if(sum>target){
                    right--;
                }
                else if(sum<target){
                    left++;
                }
                else{
                    return sum;
                }
            }
        }
        return ans;
    }
}