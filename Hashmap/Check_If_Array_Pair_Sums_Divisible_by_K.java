import java.util.HashMap;

public class Check_If_Array_Pair_Sums_Divisible_by_K {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4 };
        int k = 5;
        int num = 0;

        // if size of array is odd then it is obvious that pairs are not possible
        if (arr.length % 2 != 0) {
            System.out.println("False");
            return;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            num = arr[i];

            // if array element is negetive then we will convert it into positive number
            if (num < 0)
                int remainder = ((num % k) + k) % k;

            map.put((num % k), map.getOrDefault(num, 0) + 1);
        }
        // if size of hashmap is odd then it is obvious that pairs are not possible
        if (map.size() % 2 != 0) {
            System.out.println("False");
            return;
        } else {
            System.out.println("True");
        }
    }
}