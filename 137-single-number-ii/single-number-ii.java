class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int i=0;i<=31;i++){
            int c=0;
            for(int j=0;j<nums.length;j++){
                if(checkBit(nums[j],i)){
                    c++;
                }
            }
            if(c%3!=0){
                ans+=(1<<i);
            }
        }
        return ans;
    }
    public boolean checkBit(int number, int bit){
        if(((number>>bit)&1)==1){
            return true;
        }
        return false;
    }
}