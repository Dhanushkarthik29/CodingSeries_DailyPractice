// Question Number--->3271

class StringHash {
    public String hasher(String str){
        int sum=0;
        for(int i=0;i<str.length();i++){
            sum+=(str.charAt(i)-'a');
        }
        return ((char)((sum%26)+97))+"";
    }
    public String stringHash(String s, int k) {
        String str="";
        String fin="";
        for(int i=0;i<s.length();i++){
            str+=s.charAt(i);
            if(str.length()==k){
                fin+=hasher(str);
                str="";
            }
        }
        return fin;
    }
}
