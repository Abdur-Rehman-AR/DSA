import java.util.Scanner;

public class Linear_Search {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 2, 2, 4, 5, 2, 5, 7, 2, 2};

        System.out.print("Array: ");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] +" ");
        }
        System.out.println();

        System.out.print("Enter the number you want to search: ");
        int n = sc.nextInt();

        int result = search(arr, n);
        System.out.println("Number found at index: " +result);

        sc.close();
    }

    public static int search(int[] arr, int n) {

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == n)
            {
                return i;
            }
        }
        return -1;
    }
}