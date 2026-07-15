import java.util.ArrayList;
import java.util.HashMap;

public class CountDistinctElementsInWindow {
    public static void main(String[] args) {

        // declaring an array, helpful variables and the window size
        int[] arr = { 1, 2, 1, 3, 2, 4 };
        ArrayList<Integer> list = new ArrayList<>();
        int k = 3;
        int left = 0;
        int right = 0;

        /*
         * creating hashmap to store elements with frequencies to count dintinct
         * elements in the window and reduce number of checking each number presence
         * in window
        */

        HashMap<Integer, Integer> map = new HashMap<>();

        // Building the very first window of size K
        for(int i = 0; i < k; i++)
        {
            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);
            right++;
        }
        list.add(map.size());

        // Window will start sliding here
        for(int i = 0; i <= arr.length-k-1; i++)
        {
            // to remove the left element from the moving window
            map.put(arr[left], map.get(arr[left]) -1 );
            if(map.get(arr[left]) == 0) map.remove(arr[left]);
            left++;

            // to add the right element into the sliding window
            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);
            right++;
            list.add(map.size());
        }
        System.out.println(list);
    }
}