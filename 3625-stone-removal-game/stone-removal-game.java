class Solution {
    public boolean canAliceWin(int n) {
        int stonestoremove=10;
        boolean isAliceTurn=true;

        while(n>=stonestoremove){
            n-=stonestoremove;
            stonestoremove--;
            isAliceTurn=!isAliceTurn;
        }

        return !isAliceTurn;
    }
}