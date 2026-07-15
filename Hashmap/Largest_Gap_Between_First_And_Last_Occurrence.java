import java.util.HashMap;

public class Largest_Gap_Between_First_And_Last_Occurrence {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 1, 4, 2, 1 };
        int max = 0;
        int distance = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        // to go through the array exactly one time
        for (int i = 0; i < arr.length; i++) {

            // // If the element has been seen before, calculate the distance
            // from its first occurrence.
            if (map.containsKey(arr[i])) {
                distance = i - map.get(arr[i]);
                if (distance > max) {
                    max = distance;
                }

            } else {
                map.put(arr[i], i);
            }
        }
        System.out.println("Largest distance is: " + max);
    }
}