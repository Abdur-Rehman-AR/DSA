import java.util.Scanner;

public class Factorial {

    public int factorial(int n){

        if(n == 0) return 1;
        else return n * factorial(n - 1);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 0;

        while(true){
            System.out.print("Enter number to find Factorial: ");
            n = sc.nextInt();

            if(n < 0){
                System.out.println("Factorial is not defined for negative numbers.");
            } else {
                break;
            }
        }

        Factorial f = new Factorial();
        int result = f.factorial(n);
        System.out.println("Factorial of " +n +" is: " +result);
        sc.close();
    }
}