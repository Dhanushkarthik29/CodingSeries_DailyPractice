import java.util.*;
class Kata {
   public static List<String> friend(List<String> x){
     List<String> res=new ArrayList<String>();
     for(int i=0;i<x.size();i++){
       String get=x.get(i);
       if(get.length()==4){
         res.add(get);
      }
    }
     return res;
   }
}
