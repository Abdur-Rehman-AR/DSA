import java.util.Scanner;

public class Reversed_Traversal {

    public static void main(String[] args) {
        
        int n = 0;
        int[] arr;

        Scanner sc = new Scanner(System.in);

        System.out.println("How many numbers do you want to put in Array ?");
        n = sc.nextInt();

        arr = new int[n];

        for(int i = 0; i < n; i++)
        {
            System.out.print("Enter element no " +(i+1) +" in Array : ");
            arr[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Reversed Traversal of Array ");
        System.out.println();

        for(int i = n-1 ; i >= 0; i--)
        {
            System.out.println("Element no " +(i+1) +" in Array is : " +arr[i]);
        }

        sc.close();
    }
}