class Solution {
    public String longestCommonPrefix(String[] strs) {

        StringBuilder ans = new StringBuilder();

        //Sort array of strings
        Arrays.sort(strs);

        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length-1].toCharArray();

        //Compare the alphabets of the first and last string as it is sorted already.
        for(int i=0; i < first.length; i++){
            if(first[i] != last[i])
                break;
            ans.append(last[i]);
        }

        return ans.toString();
    }
}