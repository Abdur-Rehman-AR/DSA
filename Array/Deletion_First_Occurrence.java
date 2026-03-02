import java.util.Scanner;

public class Deletion_First_Occurrence {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = 0;

        int[] arr = {1, 2, 2, 4, 5, 8, 5, 7, 2, 8};

        System.out.print("Array: ");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] +" ");
        }

        System.out.println();

        System.out.print("Enter the number you want to delete: ");
        n = sc.nextInt();

        System.out.print("Before deleting first occurance: ");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] +" ");
        }

        System.out.println();

        System.out.print("After deleting first occurance: ");

        // Logic

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == n)
            {
                for(int k = i; k < arr.length-1; k++)
                {
                    arr[k] = arr[k+1];
                }
                break;
            }
        }

        for(int i = 0; i < arr.length-1; i++)
        {
            System.out.print(arr[i] +" ");
        }
        sc.close();
    }
}