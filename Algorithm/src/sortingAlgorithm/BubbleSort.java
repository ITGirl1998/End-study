package sortingAlgorithm;

public class BubbleSort {
    public static void main(String[] args) {
        int nums[] = new int[10000];
        for (int i = 1000; i >0 ; i--) {
            nums[1000-i]=i;
        }
        System.out.println( "Arrays.toString(BubbleSort(nums))");
    }

    public static int[] BubbleSort(int[] nums) {
        long startTime=System.currentTimeMillis();
        for (int i = 0; i <nums.length-1 ; i++) {
            int swap = 0;
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]>nums[j]){
                    swap++;
                    int num = nums[i];
                    nums[i] = nums[j];
                    nums[j] = num;
                }
            }
            if(swap==0){
                break;
            }
        }
        long endTime=System.currentTimeMillis();
        System.out.println("运行时间"+(endTime-startTime));
        return nums;
    }
}
