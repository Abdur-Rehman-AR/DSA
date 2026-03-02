public class Bubble_Sort {
    public static void main(String[] args) {
        
        int[] arr = {5, 2, 4, 1, 3};
        int n = arr.length;
        int temp = 0;

        System.out.print("Unsorted Array: ");
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] +" ");
        }

        for(int i = 0; i < n-1; i++)
        {
            for(int j = 0; j < n-1-i; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
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