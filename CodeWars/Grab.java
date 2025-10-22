import java.util.List;
import java.util.ArrayList;


public class Grab {
  
  public static boolean checking(int arr1[],int arr2[],String check){
    for(int i=0;i<check.length();i++){
      if((arr1[check.charAt(i)-'a'])!=(arr2[check.charAt(i)-'a'])){
        return false;
      }
    }
    return true;
      
  }
  public static int[] hasher(String temp){
      int hashing[]=new int[26];
      for(int i=0;i<temp.length();i++){
        hashing[temp.charAt(i)-'a']++;
      }
      return hashing;
  }
  
  public static List<String> grabscrab(String s, List<String> words){
      List<String> res=new ArrayList<String>();
      for(int i=0;i<words.size();i++){
        if(s.length()==words.get(i).length() && checking(hasher(s),hasher(words.get(i)),s)){
          res.add(words.get(i));
        }
      }
      return res;
  }
}
