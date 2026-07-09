import java.util.*;

public class CountFrequencies {
    public static void main(String[] args) {

        // Creating a HashMap

        HashMap<Integer, Integer> map = new HashMap<>();

        // declaring the Array

        int[] array = { 1, 2, 3, 3, 2, 1, 3, 1 };

        // Core functionality to count the frequency

        for (int i : array) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        // printing the whole HashMap

        System.out.println("Number    Frequency");
        for (Map.Entry<Integer, Integer> entry : map.entrySet())
            System.out.println("  " + entry.getKey() + ("   ->   ") + entry.getValue());
    }
}