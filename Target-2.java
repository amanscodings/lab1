import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Target {
    public static void main(String[] args) {
        int[] nums = {10, 9, 5, 7, 11};
        int target = 20;

        int[] result = twoSum(target, nums);

        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }

    public static int[] twoSum(int target, int[] nums) {
    Map<Integer, Integer> num = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (num.containsKey(complement)) {
                return new int[]{num.get(complement), i};
            }

            num.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }
}