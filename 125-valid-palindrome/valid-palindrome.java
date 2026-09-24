class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(!Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            else if(!Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            else{
                char leftChar=Character.toLowerCase(s.charAt(left));
                char rightChar=Character.toLowerCase(s.charAt(right));

                if(leftChar!=rightChar){
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}