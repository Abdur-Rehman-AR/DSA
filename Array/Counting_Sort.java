import java.util.Arrays;

public class Counting_Sort {
    public static void main(String[] args) {
        
        int cnt = 0;
        int[] arr_1 = {3,4,4,1,2};
        int n = arr_1.length;
        int k = Arrays.stream(arr_1).max().getAsInt();
        int[] arr_2 = new int[k+1];

        // showing Unsorted Array

        System.out.print("Unsorted Array: ");
        for(int i : arr_1)
        {
            System.out.print(i +" ");
        }
        System.out.println();

        // Logic

        for(int i = 0; i < n; i++)
        {
            arr_2[arr_1[i]]++;
        }

        for(int i = 0; i <= k; i++)
        {
            if(arr_2[i] > 0)
            {
                for(int j = 0; j < arr_2[i]; j++)
                {
                    arr_1[cnt] = i;
                    cnt++;
                }
            }
        }

        // showing Sorted Array

        System.out.print("Sorted Array: ");
        for(int i : arr_1)
        {
            System.out.print(i +" ");
        }
    }
}