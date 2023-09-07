package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
Учитывая массив целых чисел num и целочисленное целевое значение,
 верните индексы двух чисел таким образом, чтобы они складывались в target.
Вы можете предположить, что каждый ввод будет иметь ровно одно решение,
 и вы не можете использовать один и тот же элемент дважды.
Вы можете вернуть ответ в любом порядке.

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 */
public class Task1 {
    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[1] = i;
                result[0] = map.get(target - nums[i]);
                break;
            }
            map.put(nums[i], i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {15, 11, 13, 7, 25, 38, 47, 105};
        int target = 120;
        int[] result = twoSum(nums, target);

        System.out.println(Arrays.toString(result));

    }
}
