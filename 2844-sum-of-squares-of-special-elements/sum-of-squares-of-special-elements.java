class Solution {
    public int sumOfSquares(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            int onebasedidx=i+1;
            if(n%onebasedidx==0){
                sum+=nums[i]*nums[i];
            }
        }
        return sum;
    }
}