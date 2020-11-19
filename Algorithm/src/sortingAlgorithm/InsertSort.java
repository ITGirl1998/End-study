package sortingAlgorithm;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int nums[] = new int[]{6, 3, 1, 5, 2, 7, 8, 0};
        System.out.println(Arrays.toString(InsertSort(nums)));
    }

    public static int[] InsertSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int temp = nums[i];
            int j = i;
            while (j > 0 && temp < nums[j - 1]) {
                nums[j] = nums[j - 1];
                j--;
            }
            if (j != i) {
                nums[j] = temp;
            }
        }
        return nums;
    }
}
