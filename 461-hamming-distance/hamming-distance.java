class Solution {
    public int hammingDistance(int x, int y) {
        int xorresult=x^y;
        int dis=0;
        
        while(xorresult!=0){
            xorresult=xorresult&(xorresult-1);
            dis++;
        }
        return dis;
    }
}