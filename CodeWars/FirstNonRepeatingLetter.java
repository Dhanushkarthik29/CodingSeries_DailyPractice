public class Kata {
  public static String firstNonRepeatingLetter(String s){
    // Add your code here
    String str="";
    if(s.length()<=1){
      return s;
    }
     for(int i=0;i<s.length();i++){
        int flag=0;
        for(int j=0;j<s.length();j++){
            if(i!=j && (s.charAt(i)==s.charAt(j)) || (Math.abs(s.charAt(i)-s.charAt(j)))==32){
                flag++;        
            }
        }
        if(flag==0){
            return s.charAt(i)+"";
        }
    }
    return "";
  }
}
