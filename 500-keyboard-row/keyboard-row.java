class Solution {
    public String[] findWords(String[] words) {
        int[] letterToRowMap=new int[26];
        String row1="qwertyuiop";
        String row2="asdfghjkl";
        String row3="zxcvbnm";

        for(char ch:row1.toCharArray()) letterToRowMap[ch-'a']=1;
        for(char ch:row2.toCharArray()) letterToRowMap[ch-'a']=2;
        for(char ch:row3.toCharArray()) letterToRowMap[ch-'a']=3;

        List<String> validWords=new ArrayList<>();
        for(String word:words){
            if(isValidSingleRowWord(word, letterToRowMap)){
                validWords.add(word);
            }
        }

        return validWords.toArray(new String[0]);
    }

    private boolean isValidSingleRowWord(String word, int[] letterToRowMap){
        int target=letterToRowMap[Character.toLowerCase(word.charAt(0)) -'a'];
        for(int i=1;i<word.length();i++){
            int current=letterToRowMap[Character.toLowerCase(word.charAt(i)) -'a'];
            if(current!=target){
                return false;
            }
        }
        return true;
    }

}