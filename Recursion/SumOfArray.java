public class SumOfArray {
 
    public int sum(int[] arr, int n)
    {
        if(n == arr.length)
        {
            return 0;
        }
        else
        {
            return arr[n] + sum(arr, n+1);
        }
    }

    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5};

        SumOfArray s = new SumOfArray();
        int result = s.sum(arr, 0);
        System.out.println("Sum of Array is: "+result);
    }
}