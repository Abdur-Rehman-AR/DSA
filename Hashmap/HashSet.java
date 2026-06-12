import java.util.ArrayList;
public class HashSet {
 
    // initiating the array 'buckets' with ArrayList as a datatype

    private ArrayList<String>[] buckets;
    private int size;

    /* 
    * we are assigning the right side of generic array to the left side 
    * of array(which can hold only strings), so compiler gets confused
    * bcz it thinks what happen if someone assign e.g, integer to the string
    * so system will crash, so we give annotation of @SuppressWarnings which 
    * means that we know what we are gonna to do.
    */
    @SuppressWarnings("unchecked")

    // Constructor

    public HashSet(int n)
    {
        this.size = n;
        this.buckets = new ArrayList[size];

        for(int i = 0; i < size; i++)
        {
            buckets[i] = new ArrayList<String>();
        }
    }

    // HashFunction to calculate hash value for each entry

    public int hashFunction(String value)
    {
        int sum = 0;

        for(int i = 0; i < value.length(); i++)
        {
            sum += (int) value.charAt(i);
        }
        return sum % size;
    }

    // Add Function

    public void add(String value)
    {
        int index = hashFunction(value);

        ArrayList<String> ptr = buckets[index];
        if(!ptr.contains(value))
        {
            ptr.add(value);
            System.out.println(value +" added.");
        }        
    }

    // remove function

    public boolean remove(String value)
    {
        int index = hashFunction(value);

        ArrayList<String> ptr = buckets[index];
        if(ptr.contains(value))
        {
            ptr.remove(value);
            return true;
        }
        return false;
    }

    // Lookup Function

    public boolean lookup(String value)
    {
        int index = hashFunction(value);

        ArrayList<String> ptr = buckets[index];
        if(ptr.contains(value))
        {
            return true;
        }
        return false;
    }

    // main method
    public static void main(String[] args) {
        
        HashSet obj = new HashSet(10);

        // add function test

        obj.add("sara");
        obj.add("rohan");
        obj.add("moiz");
        obj.add("shaheer");
        obj.add("anaya");

        // lookup and removal test

        if(obj.lookup("rohan")) System.out.println("Value present.");
        else System.out.println("Not present.");

        if(obj.remove("anaya")) System.out.println("value removed.");
        else System.out.println("value not present.");
    }
}