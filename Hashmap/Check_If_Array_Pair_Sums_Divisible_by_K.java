import java.util.HashMap;
import java.util.Map;

public class Check_If_Array_Pair_Sums_Divisible_by_K {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4 };
        int k = 5;
        int num = 0;
        int remainder = 0;
        int key = 0;

        // if size of array is odd then it is obvious that pairs are not possible
        if (arr.length % 2 != 0) {
            System.out.println("False");
            return;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            num = arr[i];
            remainder = num % k;

            // if array element is negetive then we will convert it into positive number
            if (num < 0)
                remainder = ((num % k) + k) % k;

            map.put((remainder), map.getOrDefault(remainder, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            key = entry.getKey();
            int count = entry.getValue();

            if (key == 0) {
                // Remainder 0 elements must pair with themselves (count must be even)
                if (count % 2 != 0) {
                    System.out.println("False");
                    return;
                }
            } else {
                // All other remainders must match with their partner 'k - key'
                if (!map.containsKey(k - key) || !map.get(k - key).equals(count)) {
                    System.out.println("False");
                    return;
                }
            }
        }
        System.out.println("True");
    }
}