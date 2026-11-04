class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb=new StringBuilder();
        int charCount=0;

        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch!='-'){
                if(charCount>0&&charCount%k==0){
                    sb.append('-');
                }
                sb.append(Character.toUpperCase(ch));
                charCount++;
            }

        }
        return sb.reverse().toString();
    }
}