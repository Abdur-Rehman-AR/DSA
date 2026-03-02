import java.util.Scanner;

public class PrintNumberToN {
 
    public void printNumbers(int num, int n)
    {
        if(n == num)
        {
            System.out.print(num +" ");
            return;
        }
        else
        {
            System.out.print(n +" ");
            printNumbers(num, n+1);
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = 0;

        while(true){
            System.out.print("Enter number to print 1 to number: ");
            num = sc.nextInt();

            if(num <= 0) System.out.println("Please enter number greater than 0.");
            else break;
        }

        PrintNumberToN p = new PrintNumberToN();
        int n = 1;
        p.printNumbers(num, n);
        sc.close();
    }
}