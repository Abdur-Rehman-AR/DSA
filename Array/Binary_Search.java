import java.util.Scanner;

public class Binary_Search {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 2, 3, 4, 5};
        int low = 0;
        int high = arr.length-1;

        System.out.print("Array: ");

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
        
        System.out.print("Enter the number you want to search: ");
        int n = sc.nextInt();

        System.out.println("Number found at index: " +Search(arr, n, low, high));

        sc.close();
    }

    public static int Search(int[] arr, int n, int low, int high)
    {
        if(high < low)
            return -1;

        int mid = (low + high)/2;

        if(arr[mid] == n)
        {
            return mid;
        }

        if(arr[mid] < n)
        {
            return Search(arr, n, mid+1, high);
        }
        else
        {
            return Search(arr, n, low, mid-1);
        }
    }
}
