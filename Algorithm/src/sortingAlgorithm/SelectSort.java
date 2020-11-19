package sortingAlgorithm;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int nums[] = new int[]{6, 3, 1, 5, 2, 7, 8, 0};

        System.out.println(Arrays.toString(SelectSort(nums)));
    }

    public static int[] SelectSort(int[] nums) {
        int len = nums.length;
        int index, temp;
        for (int i = 0; i < len - 1; i++) {
            index = i;
            for (int j = i + 1; j < len; j++) {
                if (nums[j] < nums[index]) {
                    index = j;
                }
            }
            if (index != i) {
                temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
            }
        }
        return nums;
    }


}
