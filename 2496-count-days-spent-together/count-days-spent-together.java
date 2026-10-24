class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] daysInMonths={31,28,31,30,31,30,31,31,30,31,30,31};
        int startA=toDays(arriveAlice, daysInMonths);
        int endA=toDays(leaveAlice, daysInMonths);
        int startB=toDays(arriveBob, daysInMonths);
        int endB=toDays(leaveBob, daysInMonths);

        int overlapstart=Math.max(startA, startB);
        int overlapend=Math.min(endA, endB);

        return Math.max(0, overlapend-overlapstart+1);
    }

    private int toDays(String datestr, int[] daysInMonths){
        int month=Integer.parseInt(datestr.substring(0,2));
        int day=Integer.parseInt(datestr.substring(3,5));

        int totaldays=0;
        for(int i=0;i<month-1;i++){
            totaldays+=daysInMonths[i];
        }

        return totaldays+day;
    }
}