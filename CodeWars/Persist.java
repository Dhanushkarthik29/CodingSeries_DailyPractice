class Persist {  
  int count=0;
  public int bugger(long k){
    long v=1;
    if(k>=0 && k<=9){
      return count;
    }
    else{
      while(k!=0){
        v*=k%10;
        k=k/10;
        //System.out.println(v);
      }
      count++;
      bugger(v);
    }
    return count;
  }
  
	public static int persistence(long n) {
    Persist p=new Persist();
		return p.bugger(n); // your code
	}
}
