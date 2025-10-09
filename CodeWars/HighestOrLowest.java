public class Kata {
  public static String highAndLow(String numbers) {
    String arr[]=numbers.split(" ");
    int low=Integer.parseInt(arr[0]);
    int high=Integer.parseInt(arr[0]);   
    for(int i=1;i<arr.length;i++){
      int check=Integer.parseInt(arr[i]);
      if(check < low){
        low=check;
      }
      else if(check > high){
        high=check;
      }
    }
    return high + " " + low;
  }
}
