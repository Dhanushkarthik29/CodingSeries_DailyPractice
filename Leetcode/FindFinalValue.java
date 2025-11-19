class Solution {
    public int findFinalValue(int[] nums, int original) {
        boolean flag=true;
        int checker=original;
        while(flag){
            int pass=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]==checker){
                    checker=nums[i]*2;
                    pass=1;
                }
            }
            if(checker==original || pass==0){
                flag=false;
            }
        }
        return checker;
    }
}
