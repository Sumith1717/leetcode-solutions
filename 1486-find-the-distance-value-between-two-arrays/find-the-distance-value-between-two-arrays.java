class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int distanceValue=0;
        for(int x:arr1){
            if(isValid(arr2,x-d,x+d)){
                distanceValue++;
            }
        }
        return distanceValue;
    }

    private boolean isValid(int[] arr, int lower, int upper){
        int lo=0;
        int hi=arr.length-1;

        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]>=lower&&arr[mid]<=upper){
                return false;
            }

            if(arr[mid]<lower){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return true;
    }
}