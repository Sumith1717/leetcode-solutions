class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> counts=new HashMap<>();
        for(int num:nums1){
            counts.put(num, counts.getOrDefault(num,0)+1);
        }

        List<Integer> resList=new ArrayList<>();

        for(int num:nums2){
            if(counts.getOrDefault(num,0)>0){
                resList.add(num);
                counts.put(num, counts.get(num)-1);
            }
        }

        int[] resArr=new int[resList.size()];
        for(int i=0;i<resList.size();i++){
            resArr[i]=resList.get(i);
        }
        return resArr;
    }
}