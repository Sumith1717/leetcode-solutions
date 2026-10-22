class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n=score.length;
        String[] ans=new String[n];

        Integer[] idx=new Integer[n];
        for(int i=0;i<n;i++){
            idx[i]=i;
        }
        Arrays.sort(idx, (a,b)->Integer.compare(score[b],score[a]));
        for(int i=0;i<n;i++){
            int originalidx=idx[i];
            if(i==0){
                ans[originalidx]="Gold Medal";
            }
            else if(i==1){
                ans[originalidx]="Silver Medal";
            }
            else if(i==2){
                ans[originalidx]="Bronze Medal";
            }
            else{
                ans[originalidx]=String.valueOf(i+1);
            }
        }
        return ans;
    }
}