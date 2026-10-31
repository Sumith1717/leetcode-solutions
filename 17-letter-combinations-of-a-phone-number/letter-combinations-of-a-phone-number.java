class Solution {
    public List<String> letterCombinations(String digits) {
        Map<Integer,String> letters=new HashMap<>();
        letters.put(2, "abc");
        letters.put(3, "def");
        letters.put(4, "ghi");
        letters.put(5, "jkl");
        letters.put(6, "mno");
        letters.put(7, "pqrs");
        letters.put(8, "tuv");
        letters.put(9, "wxyz");

        Queue<String> comb=new LinkedList<>();
        char[] digit=digits.toCharArray();
        ArrayList<Character> temparr=new ArrayList<>();
        String totalChars = letters.get(Character.getNumericValue(digit[0]));
        for(int i=0;i<totalChars.length();i++){
            String ele=String.valueOf(totalChars.charAt(i));
            comb.offer(ele);
        }
        for(int i=1;i<digit.length;i++){
            int currentDigitVal=Character.getNumericValue(digit[i]);
            String currentChars=letters.get(currentDigitVal);

            int size=comb.size();
            for(int j=0;j<size;j++){
                String temp=comb.poll();
                for(int k=0;k<currentChars.length();k++){
                    comb.offer(temp+currentChars.charAt(k));
                }
            }
        }
        return new ArrayList<>(comb);
    }
}