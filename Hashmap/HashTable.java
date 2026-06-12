import java.util.ArrayList;

public class HashTable {

    /*
     * Annotation, that tells Java compiler that I know about what i am doing
     * here So turn off the warning message for this specific line of code.
     */

    @SuppressWarnings("unchecked")

    // declaring any array of 10 arraylists
    private static ArrayList<String>[] hashset = new ArrayList[10];

    // function that finds the index for the values to be add.
    private static int hashFunction(String value) {
        int count = 0;

        for (int i = 0; i < value.length(); i++) {
            count += (int) value.charAt(i);
        }

        return count % 10;
    }

    // function that put value in the specified bucket.
    private static void insertIntoHashTable(String value) {
        int index = hashFunction(value);
        ArrayList<String> bucket = hashset[index];

        if (!bucket.contains(value)) {
            bucket.add(value);
        }
    }

    private static void display() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Bucket " + (i) + " : " + hashset[i]);
        }
    }

    // function that checks either the value is present or not
    private static void checkLookups(String value) {
        int index = hashFunction(value);
        ArrayList<String> bucket = hashset[index];
        if (bucket.contains(value)) {
            System.out.println(value + " exists.");
        } else {
            System.out.println(value + " does not exists.");
        }
    }

    public static void main(String[] args) {

        // initializing buckets with empty and dynamic size arraylists
        for (int i = 0; i < hashset.length; i++) {
            hashset[i] = new ArrayList<String>();
        }

        insertIntoHashTable("Jones");
        insertIntoHashTable("Bob");
        insertIntoHashTable("Siri");
        insertIntoHashTable("Pete");
        insertIntoHashTable("Lisa");

        // here, we are trying to check the collision
        insertIntoHashTable("Stuart");

        System.out.println();
        display();
        System.out.println();

        checkLookups("Lisa");
        checkLookups("Alex");
    }
}