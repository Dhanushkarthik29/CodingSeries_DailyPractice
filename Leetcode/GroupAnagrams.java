class Solution {
    public boolean checkerAnagrams(String s1,String s2){
        int hash[]=new int[26];
        for(int i=0;i<s1.length();i++){
            hash[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<s2.length();i++){
            hash[s2.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(hash[i]!=0){
                return false;
            }
        }
        return true;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> fin=new ArrayList<List<String>>();
        boolean ind[]=new boolean[strs.length];
        for(int i=0;i<strs.length;i++){
            List<String> ana=new ArrayList<String>();
            int flag=0;
            for(int j=i+1;j<strs.length;j++){
                if(checkerAnagrams(strs[i],strs[j]) && (ind[i]==false || ind[j]==false)){
                    if(flag==0){
                        ana.add(strs[i]);
                        ind[i]=true;
                    }
                    ind[j]=true;
                    ana.add(strs[j]);
                    flag=1;
                }
            }
            if(flag==0 && ind[i]==false){
                ind[i]=true;
                ana.add(strs[i]);
            }
            if(!ana.isEmpty()){
                fin.add(ana);
            }
        }
        return fin;
    }
}
