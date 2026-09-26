class Solution {
    public boolean isHappy(int n) {
    
        Set<Integer> seen=new HashSet<>();

        while(n!=1&&!seen.contains(n)){
            seen.add(n);
            n=getNext(n);
        }
        return n==1;
    }

    private static int getNext(int n){
        int totalsum=0;
        while(n>0){
            int digit=n%10;
            totalsum+=digit*digit;
            n/=10;
        }
        return totalsum;
    }
}