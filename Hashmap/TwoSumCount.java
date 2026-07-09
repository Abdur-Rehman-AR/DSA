import java.util.HashMap;
import java.util.Map;

public class TwoSumCount {

    public static void main(String[] args) {

        int[] arr = {1, 2, 1};
        int target = 3;

        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : arr) {

            int complement = target - num;

            if (map.containsKey(complement)) {
                count += map.get(complement);
            }

            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println("Total Pairs: " + count);
    }
}