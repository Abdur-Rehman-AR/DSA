import java.util.Scanner;

public class ReverseAString {
 
    public void reverse(String s, int n)
    {
        if(n == 0) return;
        else
        {
            System.out.print(s.charAt(n-1));
            reverse(s, n-1);
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ReverseAString r = new ReverseAString();

        System.out.print("Enter the string to reverse: ");
        String s = sc.nextLine();

        r.reverse(s, s.length());
        sc.close();
    }
}