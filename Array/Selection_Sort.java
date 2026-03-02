public class Selection_Sort {
    public static void main(String[] args) {
        
        int[] arr = {5, 10, 45, 28, 23, 43, 54, 2, 4, 1, 3};
        int n = arr.length;
        int smallest = 0;
        int k = 0;

        System.out.print("Unsorted Array: ");
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] +" ");
        }

        // logic, Swap-based version.

        for(int i = 0; i < n-1; i++)
        {
            smallest = Integer.MAX_VALUE;

            for(int j = i+1; j < n; j++)
            {
                if(arr[j] < smallest)
                {
                    smallest = arr[j];
                    k = j;
                }
            }
            if(arr[i] > smallest)
            {
                arr[k] = arr[i];
                arr[i] = smallest;
            }
        }

        System.out.println();
        System.out.print("Sorted Array: ");
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] +" ");
        }
    } 
}