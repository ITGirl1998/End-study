package sortingAlgorithm;

public class BubbleSort {
    public static void main(String[] args) {
        int nums[] = new int[10000];
        for (int i = 1000; i > 0; i--) {
            nums[1000 - i] = i;
        }
        System.out.println("Arrays.toString(BubbleSort(nums))");
    }

    public static int[] BubbleSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            boolean swap = false;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int num = nums[i];
                    nums[i] = nums[j];
                    nums[j] = num;
                    swap = true;
                }
            }
            //优化点： // 如果某次未发生数据交换，说明数据已排序
            if (!swap) {
                break;
            }
        }
        return nums;
    }
}
