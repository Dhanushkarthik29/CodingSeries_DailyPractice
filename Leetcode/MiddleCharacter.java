class Kata {
  public static String getMiddle(String word) {
    int r=word.length()-1;
    if(word.length()%2==0){
      return word.charAt((word.length()/2)-1)+""+word.charAt(word.length()/2);
    }
    return word.charAt(word.length()/2)+"";
  }
}