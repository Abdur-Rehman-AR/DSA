import java.util.HashMap;

public class Longest_Subarray_with_Sum_Divisible_by_K {
    public static void main(String[] args) {

        int[] arr = { 2, 7, 6, 1, 4 };
        int k = 3;
        int sum = 0;
        int remainder = 0;
        int length = 0;
        int max = 0;
        int start = 0;
        int end = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, -1);
        // prefix sum
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            remainder = sum % k;

            // to handle negative prefixes sum we use this formula to convert number
            // back into the range of 0 - k
            if (remainder < 0) {
                remainder = (remainder + k) % k;
            }

            if (map.containsKey(remainder)) {
                length = i - map.get(remainder);
                if (length > max) {
                    max = length;
                    start = map.get(remainder) + 1;
                    end = i;
                }
            } else {
                map.put(remainder, i);
            }
        }
        System.out.println("Largest Sub-Array divided by " + k + " starts from " + start + " to " + end
                + " with length of " + max);
    }
}