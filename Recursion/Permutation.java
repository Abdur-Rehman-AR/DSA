import java.util.Scanner;

public class Permutation {

    public long per(int n, int r) {
        
        if(r == 0) return 1;
        return n * per(n-1, r-1);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 0;
        int r = 0;

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

        Permutation p = new Permutation();

        long result = p.per(n, r);
        System.out.println("Permutation of " +n +" and " +r +" is: " +result);
        sc.close();
    }
}