import java.util.Scanner;

public class PrintNumberToOne {
 
    public void printNumbers(int num)
    {
        if(num == 1)
        {
            System.out.print(num +" ");
            return;
        }
        else
        {
            System.out.print(num +" ");
            printNumbers(num-1);
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = 0;

        while(true){
            System.out.print("Enter number to print from number to one: ");
            num = sc.nextInt();

            if(num <= 0) System.out.println("Please enter number greater than 0.");
            else break;
        }

        PrintNumberToOne p = new PrintNumberToOne();
        p.printNumbers(num);
        sc.close();
    }
}