import java.util.*;
public class FindOutlier {
  static int find(int[] integers) {
      ArrayList<Integer> even=new ArrayList<Integer>();
      ArrayList<Integer> odd=new ArrayList<Integer>();
      for(int i=0;i<integers.length;i++){
        if(integers[i]%2==0){
          even.add(integers[i]);
        }
        else{
          odd.add(integers[i]);
        }
      }
      if(even.size()>odd.size()){
        return odd.get(0);
      }
      return even.get(0);
  }
}
