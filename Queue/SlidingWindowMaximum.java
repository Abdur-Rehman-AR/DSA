import java.util.Scanner;

public class SlidingWindowMaximum {

   public void slidingWindow(Dequeue d, int[] arr, int k, int[] result) {

    int n = arr.length;
    int r = 0;

    for (int i = 0; i < k; i++) 
    {
        while (!d.isEmpty() && arr[i] >= arr[d.getRear()]) 
        {
            d.dequeueAtRear();
        }
        d.enqueueAtRear(i);
    }
    result[r++] = arr[d.getFront()];

    for (int i = k; i < n; i++) 
        {

        // Remove elements outside the window
        while (!d.isEmpty() && d.getFront() <= i - k) 
        {
            d.dequeueAtFront();
        }

        // Remove smaller elements from rear
        while (!d.isEmpty() && arr[i] >= arr[d.getRear()]) 
        {
            d.dequeueAtRear();
        }
        d.enqueueAtRear(i);

        result[r++] = arr[d.getFront()];
    }
}
    public static void main(String[] args) {

        SlidingWindowMaximum swm = new SlidingWindowMaximum();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of Elements: ");
        int size = sc.nextInt();

        System.out.print("Enter the window size please: ");
        int k = sc.nextInt();

        int[] queue = new int[size];
        int[] result = new int[size - k + 1];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter Element no " + (i + 1) + " : ");
            queue[i] = sc.nextInt();
        }

        Dequeue d = new Dequeue(size);
        swm.slidingWindow(d, queue, k, result);

        System.out.println("The maximum elements in each sliding window are:");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        sc.close();
    }
}