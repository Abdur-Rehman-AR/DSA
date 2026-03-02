import java.util.Scanner;

public class Arrayminmax {

    static class MinMax {
        int min;
        int max;

        MinMax(int min, int max) {
            this.min = min;
            this.max = max;
        }
    }

    public void findMinMax(int[] arr, int n, MinMax m){
        
        if(n == arr.length) return;
        else
        {
            if(m.min > arr[n]) m.min = arr[n];
            if(m.max < arr[n]) m.max = arr[n];
        }
        findMinMax(arr, n+1, m);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 0;

        while(true){
            System.out.print("Enter size of Array: ");
            n = sc.nextInt();

            if(n <= 0){
                System.out.println("Size of array is only defined for numbers greater than 0.");
            } else {
                break;
            }
        }

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        
        MinMax m = new MinMax(arr[0], arr[0]);
        
        Arrayminmax s = new Arrayminmax();
        s.findMinMax(arr, 1, m);
        System.out.println("Minimum Number from Array is: "+m.min);
        System.out.println("Maximum Number from Array is: "+m.max);
        sc.close();
    }
}