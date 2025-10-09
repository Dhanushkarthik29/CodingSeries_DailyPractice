public class DRoot {
  public static int recursion(int a){
    if(a>=0 && a<=9){
      return a;
    }
    return recursion((a/10)+(a%10));
  }
  public static int digital_root(int n) {
    int rem=recursion(n);
    return rem;
  }
}
