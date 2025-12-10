// Question Number ---->409


class LongestPalindrome {
    public int longestPalindrome(String s) {
        if(s.length()<=1){
            return 1;
        }
        int hash[]=new int[52];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                hash[s.charAt(i)-'a']++;
            }
            else if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                hash[(s.charAt(i)-'A')+26]++;
            }
        }
        int odd=0;
        int max=Integer.MIN_VALUE;
        int index=0;
        for(int i=0;i<52;i++){
            if(hash[i]%2==1){
                if(hash[i]>max){
                    max=hash[i];
                    index=i;
                }
            }
        }
        int overall=0;
        for(int i=0;i<52;i++){
            if(hash[i]%2==1 && i!=index){
                overall+=(hash[i]-1);
            }
            else{
                overall+=hash[i];
            }
        }
        System.out.println(overall);
        System.out.println(max);
        return overall;
    }
}
