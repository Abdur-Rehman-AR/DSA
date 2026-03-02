import java.util.Scanner;

public class DecimalToBinary {
 
    public String conversion(int n)
    {
        if(n == 0) return "";
        else return conversion(n/2) +(n%2);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        DecimalToBinary d = new DecimalToBinary();

        System.out.print("Enter the Decimal number: ");
        int n = sc.nextInt();

        System.out.print("Binary equivalent of " + n + " is: ");
        if(n == 0) System.out.print(0);
        else if(n < 0)
        {
            System.out.print("-" +d.conversion(n));
        }
        else
        {
            System.out.print(d.conversion(n));
        }
        sc.close();
    }
}