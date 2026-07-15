import java.util.HashMap;
import java.util.Map;

public class Subarray_with_Given_Sum {
    public static void main(String[] args) {

        int[] arr = { 2, -1, 3, 4, -2 };
        int target_sum = 5;
        int pre_sum = 0, key = 0, start = 0, end = 0;
        boolean found = false;

        Map<Integer, Integer> map = new HashMap<>();

        // base case to check if the target sum is present at the beginning

        if (arr[0] == target_sum) {
            System.out.println("Target sum is find at the begining of the array.");
            return;
        }

        // base case: handles the sum if number started to appear from begining

        map.put(0, -1);

        // first we have to find prefix sum to build foundation of solution

        for (int i = 0; i < arr.length; i++) {
            pre_sum = arr[i] + pre_sum;
            key = pre_sum - target_sum;

            if (map.containsKey(key)) {
                start = map.get(key);
                end = i;
                found = true;
                break;
            }

            /*
             * putIfAbsent() prevents overwriting the first occurrence of a prefix sum,
             * which is exactly the occurrence needed to correctly identify the subarray's
             * starting index.
             */
            map.putIfAbsent(pre_sum, i);
        }
        if (found) {
            System.out.println("Sub-Array with given sum " + target_sum + " found in array from index " + (start + 1)
                    + " to " + end + ".");
        } else {
            System.out.println("No subarray with sum " + target_sum + " exists in this array.");
        }
    }
}