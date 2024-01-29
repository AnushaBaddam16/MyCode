package maps;
import java.util.HashMap;
import java.util.Map;

public class Sum {
    public static int[] twoSumIndices(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if the complement exists in the HashMap
            if (map.containsKey(complement)) {
                // Return the indices of the two numbers
                return new int[]{map.get(complement), i};
            }

            // Put the current number and its index into the HashMap
            map.put(nums[i], i);
        }

        // If no solution is found
        return new int[]{-1, -1};
    }
}