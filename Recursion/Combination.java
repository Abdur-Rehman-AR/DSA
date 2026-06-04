import java.util.Scanner;

public class Combination {

    public long com(int n, int r) {
        
        if(r == 0) return 1;
        return n * com(n-1, r-1);
    }

    public long fac(int n) {

        if(n == 0 || n == 1) return 1;
        else return n * fac(n-1);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 0;
        int r = 0;
        long result = 0;

        while(true){
            System.out.print("Enter the value of n: ");
            n = sc.nextInt();

            if(n < 0){
                System.out.println("n should be positive number.");
            } else {
                break;
            }
        }

        while(true){
            System.out.print("Enter the value of r: ");
            r = sc.nextInt();

            if(n < r){
                System.out.println("r should be lesser than n.");
            } 
            else if(r < 0){
                System.out.println("r should be positive number.");
            }
            else {
                break;
            }
        }

        Combination c = new Combination();

        if(r > n-r) result = c.com(n, n-r) / c.fac(n-r);
        else result = c.com(n, r) / c.fac(r);
        System.out.println("Combination of " +n +" and " +r +" is: " +result);
        sc.close();
    }
}