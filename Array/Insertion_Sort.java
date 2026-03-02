public class Insertion_Sort {
    public static void main(String[] args) {

        int[] arr = {5, 10, 45, 28, 23, 55, 33, 66,22,43,665,9,43,44,56,0,456,234,654,768,5678,67,34,12,0,7,4,65, 43, 54, 2, 4, 1, 3};
        int n = arr.length, current = 0, j = 0;

        System.out.print("Unsorted Array: ");
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] +" ");
        }

        // logic, shift-based version.

         for(int i = 1; i < n; i++) 
         {
            current = arr[i];
            j = i-1;

            while(j >= 0 && arr[j] > current) 
            {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }

        System.out.println();
        System.out.print("Sorted Array: ");
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] +" ");
        }
    }
}