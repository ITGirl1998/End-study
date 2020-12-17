package byteDance;

/**
 * 题目描述：
 * 一个长度为n-1的递增排序数组中的所有数字都是唯一的，并且每个数字都在范围0～n-1之内。
 * 在范围0～n-1内的n个数字中有且只有一个数字不在该数组中，请找出这个数字。
 *
 *输入: [0,1,3] 输出: 2
 *
 *输入: [0,1,2,3,4,5,6,7,9] 输出: 8
 */
public class Offer53 {
    public static void main(String[] args) {
        int[] arr = new int[] {0,1,2,3,4,5,6,7,9};
        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int[] nums) {
//        for(int i=0;i<nums.length;i++){
//            if(nums[i]!=i){
//                return i;
//            }
//        }
//        return nums.length;

        int r = nums.length-1, l=0, mid=0;
        while (r>=l){
            mid = (r+l)>> 1;
            if(mid >= nums[mid]){
                l= mid+1 ;
            }else{
                r= mid-1 ;
            }
        }
        return l;

//        int num = 0;
//        for (int i = 0; i < nums.length; i++) {
//            num = num ^ i;
//            num = num ^ nums[i];
//        }
//        return num^nums.length;
    }
}
