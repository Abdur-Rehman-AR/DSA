public class Deletion_at_end {
    
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        System.out.print("Before Deletion: ");

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] +" ");
        }

        System.out.println();

        // Deletion Logic

        System.out.println();
        System.out.print("After Deletion: ");

        for(int i = 0; i < arr.length-1; i++)
        {
            System.out.print(arr[i] +" ");
        }
    }
}
