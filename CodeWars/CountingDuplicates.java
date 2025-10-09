import java.util.*;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        int hashing[]=new int[36];
        for(int i=0;i<text.length();i++){
          if((text.charAt(i)>='A' && text.charAt(i)<='Z')){
              hashing[text.charAt(i)-'A']++;
          }
          else if((text.charAt(i)>='a' && text.charAt(i)<='z')){
              int chars=(int)text.charAt(i)-97;
              System.out.println(chars);
              hashing[chars]++;
          }
          else{
            hashing[26+((text.charAt(i)-'0')-0)]++;
          }
        }
      int count=0;
      for(int i=0;i<36;i++){
          if(!(hashing[i]>=0 && hashing[i]<=1)){
            count++;
          }
      }
      return count;
    }
}
