import java.util.*;

public class TwoArraysEqualOrNot {
    public static void main(String[] args) {

        // using boolean variable to store the result of matching arrays
        boolean result = true;

        // the actual 2 arrays
        int[] arr_1 = { 1, 2, 3, 4, 5, 1, 2, 3, 4, 5 };
        int[] arr_2 = { 1, 5, 3, 4, 2, 1, 4, 2, 5, 3 };

        // if both arrays are of different length then they are obviously not equal.
        if (arr_1.length != arr_2.length) {
            System.out.println("Arrays are not equal.");
            result = false;
        } else {

            // using hashmap to store number and its frequency for later comparison
            HashMap<Integer, Integer> map_1 = new HashMap<>();
            HashMap<Integer, Integer> map_2 = new HashMap<>();

            // Functionality to count the frequency of both arrays
            for (int i : arr_1) {
                map_1.put(i, map_1.getOrDefault(i, 0) + 1);
            }

            for (int i : arr_2) {
                map_2.put(i, map_2.getOrDefault(i, 0) + 1);
            }

            // matching entry of one arrays with other
            for (Map.Entry<Integer, Integer> entry : map_1.entrySet()) {
                if (!map_2.containsKey(entry.getKey()) ||
                        !(entry.getValue().equals(map_2.get(entry.getKey())))) {

                    System.out.println("Arrays are not Equal.");
                    result = false;
                    break;
                }
            }
            if (result)
                System.out.println("Arrays are equal.");
        }
    }
}