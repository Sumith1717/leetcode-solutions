class Solution {
    public int longestPalindrome(String s) {
        int[] charcounts=new int[128];
        for(char c:s.toCharArray()){
            charcounts[c]++;
        }
        int length=0;
        boolean hasodd=false;

        for(int count:charcounts){
            length+=(count/2)*2;

            if(count%2==1){
                hasodd=true;
            }
        }
        return hasodd?length+1:length;
    }
}