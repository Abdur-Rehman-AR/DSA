import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {

        // 1. Creating a hashmap in memory

        HashMap<Integer, String> map = new HashMap<>();

        // 2. Adding key-value pairs to the HashMap

        for (int i = 0; i < 6; i++) {
            map.put(i, "Person_" + i);
        }

        // 3. Retrieve the pair

        System.out.println("Value within key 2 is: " + map.get(2));

        // 4. Delete the pair

        String result = map.remove(2);
        System.out.println("Value within key 2 deleted: " + result);

        // 5. finding the size of hashmap

        System.out.println("Size of HashMap: " + map.size());

        // 6. Checking a specific key

        if (map.containsKey(2))
            System.out.println("HashMap contains key '2'.");
        else
            System.out.println("HashMap does not contains key '2'.");

        // 7. Checking a specific value

        if (map.containsValue("Person_1"))
            System.out.println("HashMap contains value 'Person_1'.");
        else
            System.out.println("HashMap does not contains value 'Person_1'.");

        // 8. Showing all keys in hashmap

        Set<Integer> set = map.keySet();
        System.out.println(set);

        // 9. Showing all values in hashmap

        Collection<String> collection = map.values();
        System.out.println(collection);

        // 10. Showing all key-value entries in hashmap

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        System.out.println(entries);

        // 11. try to get a value if its key is not present

        System.out.println("Value of key 7 is: " + map.getOrDefault(7, "Key 7 is not present, hence key is this."));

        // 12. if key 7 is not present then this will be put

        result = map.putIfAbsent(7, "Person_7");
        if (result == null)
            System.out.println("Entry added.");
        else
            System.out.println("Entry already present.");

        // 13. remove the element if the specified value is present

        if (map.remove(7, "Person_7"))
            System.out.println("Entry Deleted.");
        else
            System.out.println("Entry cannot be deleted.");

        // 14. to replace a value with new value

        result = map.replace(1, "Person_111");
        if (result == null)
            System.out.println("Key does not present.");
        else
            System.out.println("Value changed successfully.");

        // 15. Advance form of replace method

        if (map.replace(1, "Person_111", "Person_1"))
            System.out.println("Value changed successfully.");
        else
            System.out.println("Value does not change.");

        // 16. Making hashmap empty

        map.clear();
        if (map.isEmpty())
            System.out.println("HashMap is empty.");
        else
            System.out.println("HashMap is not empty.");
    }
}