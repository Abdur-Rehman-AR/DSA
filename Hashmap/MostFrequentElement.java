import java.util.*;

public class MostFrequentElement {
    public static void main(String[] args) {

        // Creating a HashMap

        HashMap<Integer, Integer> map = new HashMap<>();

        // declaring the Array

        int[] array = { 1, 1, 2, 3, 3, 3, 4, 5, 5, 5, 6, 7, 7, 8, 8, 9, 9, 9, 10, 10 };

        // declaring the Arraylist(to store the keys with highest frequency) and
        // max variable to store the maximum frequency to compare

        ArrayList<Integer> list = new ArrayList<>();
        int max = 0;

        // Functionality to count the frequency

        for (int i : array) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        // Core functionality to find the most frequent Element

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= max) {
                if (entry.getValue() > max) {
                    list.clear();
                }
                max = entry.getValue();
                list.add(entry.getKey());
            }
        }

        System.out.println("Element(s) with most frequency are/is: " +list);
    }
}