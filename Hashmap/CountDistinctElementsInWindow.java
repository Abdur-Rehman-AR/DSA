import java.util.ArrayList;
import java.util.HashMap;

public class CountDistinctElementsInWindow {
    public static void main(String[] args) {
        
        // declaring an array, helpfull variables and the window size
        int[] arr = {1, 2, 3, 2, 4, 1, 3, 2, 4, 2, 1, 3, 1, 4, 3};
        ArrayList<Integer> list = new ArrayList<>();
        int k = 3;
        int left = 0;
        int right = 0;

        // creating hashmap to store elements with frequencies to count dintinct elements
        // in the window and reduce number of checking each number presence in window
        HashMap<Integer, Integer> map = new HashMap<>();

        int j = 0;
        while(j != arr.length-k-1)
        {
            for(int i = 0; i < k; i++)
            {
                map.put(arr[right], map.getOrDefault(arr[right], 0) +1);
                right++;
            }
            list.add(map.size());
            left++;
            right = left;
            j++;
        }
    }
}