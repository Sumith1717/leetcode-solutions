class Solution {

    public int ceil(int[] a, int target){
        int lo=0, hi=a.length-1, ans=0, ceilIdx=0;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(a[mid]>target){
                ceilIdx=mid;
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return ceilIdx;
    }

    public void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp; 
    }

    public void nextPermutation(int[] nums) {

        int n=nums.length, pivot=0, pivotIdx=-1;
        for(int i=n-1;i>0;i--){
            if(nums[i]<nums[i-1]) continue;
            if(nums[i]>nums[i-1]){
                pivotIdx=i-1;
                pivot=nums[pivotIdx];
                break;
            }
        }
        if (pivotIdx != -1) {
            int[] temparr=new int[n-(pivotIdx+1)];
            for(int i=pivotIdx+1;i<n;i++){
                temparr[i-(pivotIdx+1)]=nums[i];
            }
            int ceilIdx=ceil(temparr, pivot);
            swap(pivotIdx, (pivotIdx + 1)+ceilIdx, nums);
        }

        Arrays.sort(nums, pivotIdx+1, n);
    }
}