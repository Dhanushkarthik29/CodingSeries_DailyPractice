class Solution {
    public static String whoLikesIt(String... names) {
        String str="";
        if(names.length==0){
          str="no one likes this";
        }
        else if(names.length==1){
          str+=names[0]+" likes this";
        }
        else if(names.length==2){
          str+=names[0]+" and "+names[1]+" like this";
        }
        else if(names.length==3){
          str+=names[0]+", "+names[1]+" and "+names[2]+" like this";
        }
        else{
          int len=names.length-2;
          str+=names[0]+", "+names[1]+" and "+len+" others like this";
        }
        return str;
    }
}
