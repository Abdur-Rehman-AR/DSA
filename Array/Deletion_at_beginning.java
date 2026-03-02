import java.util.Scanner;

public class Deletion_at_beginning {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 2, 3, 4, 5};

        System.out.print("Before Deletion: ");

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] +" ");
        }

        // Deletion Logic

        for(int i = 0; i < arr.length-1; i++)
        {
            arr[i] = arr[i+1];
        }

        System.out.println();
        System.out.print("After Deletion: ");

        for(int i = 0; i < arr.length-1; i++)
        {
            System.out.print(arr[i] +" ");
        }
        
        sc.close();
    }
}