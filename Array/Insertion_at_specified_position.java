import java.util.Scanner;

public class Insertion_at_specified_position {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int p = 0;

        int[] arr = {1, 2, 3, 4, 0};

        System.out.print("Before Insertion: ");

        for(int i = 0; i < arr.length-1; i++)
        {
            System.out.print(arr[i] +" ");
        }

        System.out.println();

        System.out.print("Enter the number you want to insert: ");
        n = sc.nextInt();

        System.out.print("Enter the position at where you want to insert: ");
        p = sc.nextInt();

        // Insertion Logic

        for(int i = arr.length-1; i >= p; i--)
        {
            arr[i] = arr[i-1];
        }

        arr[p-1] = n;

        System.out.println();
        System.out.print("After Insertion: ");

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] +" ");
        }

        sc.close();

    }    
}
