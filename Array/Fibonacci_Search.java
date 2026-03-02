public class Fibonacci_Search {

    public static int search(int[] arr, int x) {

        int n = arr.length;
        int a = 0, b = 1, c = 1;
        int offset = -1;

        while (c < n) 
        {
            a = b;
            b = c;
            c = a + b;
        }

        while (c > 1) 
        {
            int i = Math.min(offset + a, n - 1);

            if (arr[i] < x) 
            {
                c = b;
                b = a;
                a = c - b;
                offset = i;
            }
            else if (arr[i] > x) 
            {
                c = a;
                b = b - a;
                a = c - b;
            }
            else
            {
                return i;
            }
        }

        if (b != 0 && arr[offset + 1] == x)
        {
            return offset + 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90};
        int x = 10;
        System.out.println(search(arr, x));
    }
}