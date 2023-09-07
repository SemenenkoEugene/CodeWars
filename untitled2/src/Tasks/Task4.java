package Tasks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] testArray = {0, 1, 2, 3, 0, 2, 3, 1, 0, 2, 3};
        System.out.println(Arrays.toString(removeElement(testArray, 3)));

    }

    public static int[] removeElement(int[] nums, int val) {
        int offset = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                offset++;
            } else {
                nums[i - offset] = nums[i];
            }
        }
        return Arrays.copyOf(nums, nums.length - offset);
    }
}
