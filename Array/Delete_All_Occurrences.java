import java.util.Scanner;

public class Delete_All_Occurrences {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int k = 0;

        int[] arr = {1, 2, 2, 4, 5, 2, 5, 7, 2, 2};

        System.out.print("Array: ");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] +" ");
        }
        System.out.println();

        System.out.print("Enter the occurance you want to delete: ");
        n = sc.nextInt();

        // Logic

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] != n)
            {
                arr[k] = arr[i];
                k = k+1;
            }
        }

        System.out.print("After deleting all occurance: ");
        for(int i = 0; i < k; i++)
        {
            System.out.print(arr[i] +" ");
        }

        System.out.println();
        System.out.println("Output: " +(k));
        sc.close();
    }
}