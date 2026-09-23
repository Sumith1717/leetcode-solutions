class Solution {
    public String getPermutation(int n, int k) {
        int[] fact=new int[n+1];
        fact[0]=1;
        for(int i=1;i<=n;i++){
            fact[i]=i*fact[i-1];
        }

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numbers.add(i+1);
        }

        int totaldigits=(int)Math.log10(n)+1;
        StringBuilder ans=new StringBuilder();
        k--;
        while(n>0){
            int num=k/fact[n-1];
            ans.append(numbers.get(num));
            numbers.remove(num);
            k=k%fact[n-1]; 
            n--;
        }
        return ans.toString();
    }
}