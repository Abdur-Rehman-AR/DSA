import java.util.Scanner;

public class SumOfDigits {

    public int sum(int n){

        if(n == 0) return 0;
        else return n%10 + sum(n/10);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 0;

        while(true){
            System.out.print("Enter number to find sum of digits: ");
            n = sc.nextInt();

            if(n < 0){
                System.out.println("Sum of digits is not defined for negative numbers.");
            } else {
                break;
            }
        }

        SumOfDigits s = new SumOfDigits();
        int result = s.sum(n);
        System.out.println("Sum of digits of " +n +" is: " +result);
        sc.close();
    }
}