class Solution {
    public int thirdMax(int[] nums) {
        Long first=null;
        Long second=null;
        Long third=null;

        for(int num:nums){
            long current=num;
            if((first!=null&&current==first)||
                (second!=null && current==second)||
                (third!=null&&current==third)){
                    continue;
            }
            if(first==null||current>first){
                third=second;
                second=first;
                first=current;
            } else if(second==null||current>second){
                third=second;
                second=current;
            } else if(third==null||current>third){
                third=current;
            }
        }
        return third==null?first.intValue():third.intValue();
    }
}