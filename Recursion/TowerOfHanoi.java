import java.util.Scanner;

public class TowerOfHanoi {

    public void towerOfHanoi(int n, char source, char auxiliary, char target) {
        if (n == 1) 
        {
            System.out.println("Move disk 1 from " + source + " to " + target);
            return;
        }

        towerOfHanoi(n - 1, source, target, auxiliary);
        System.out.println("Move disk " + n + " from " + source + " to " + target);
        towerOfHanoi(n - 1, auxiliary, source, target);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TowerOfHanoi toh = new TowerOfHanoi();

        System.out.print("Enter the number of disks: ");
        int n = sc.nextInt();

        System.out.println("The sequence of moves are:");
        toh.towerOfHanoi(n, 'A', 'B', 'C');

        sc.close();
    }
}