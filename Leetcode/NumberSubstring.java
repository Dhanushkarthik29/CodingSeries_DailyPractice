class Solution {
    int MOD = 1_000_000_007;
    public int numSub(String s) {
        double result = 0;
        double count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '1'){
                count++;
            }
            else{
                result = result + helper(count) % MOD;
                System.out.println("count"+count+" result"+result);
                count = 0;
            }
        }
        if(count > 0){
            result += helper(count)%MOD;
        }
        return (int)result;
    }
    public double helper(double c){
        double ans = 0;
        while(c > 0){
            ans =ans + c;
            c--;
        }
        return ans;
    }
 
}


///1513. Number of Substrings With Only 1s
