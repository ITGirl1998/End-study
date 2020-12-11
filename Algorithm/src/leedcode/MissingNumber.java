package leedcode;


public class MissingNumber {
    public int missingNumber(int[] nums) {
        int l=0,r=nums.length,m=0;
        while(l<=r){
            m = ((r-l)/2)+1;
            if(m<=nums[m]){
                l = m;
            }else if(m>nums[m]){
                r = m;
            }
        }
        return m;
    }
}
