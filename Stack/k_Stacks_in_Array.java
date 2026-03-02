import java.util.Scanner;
public class k_Stacks_in_Array {

    public void count(int[] stack, int k, int size, int[] startIndex, int[] top)
    {
        for(int i = 0; i < k; i++)
        {
            startIndex[i] = i*size;
            top[i] = i*size;
        }
        return;
    }

    public void push(int data, int k, int[] stack, int num, int[] startIndex, int[] top) {

        num = num - 1;

        if(num+1 == k)
        {
            if(top[num] == stack.length)
            {
                System.out.println("Stack " +(num+1) +" is full, Can't push.");
                return;
            }
        }
        else if(top[num] == startIndex[num+1])
        {
            System.out.println("Stack " +(num+1) +" is full, Can't push.");
            return;
        }
            
        stack[top[num]] = data;
        top[num]++;
    }

    public void pop(int[] stack, int num, int[] startIndex, int[] top) {

        if(top[num-1] == startIndex[num-1]) System.out.println("Stack is Empty, Can't Popped.");
        else{
            System.out.println("Popped Element is: " +stack[top[num-1]-1]);
            top[num-1]--;
        }
    }

    public void peek(int[] stack, int num, int[] startIndex, int[] top) {

        if(top[num-1] == startIndex[num-1]) System.out.println("Stack is empty."); 
        else System.out.println("Top element of stack is: " +stack[top[num-1]-1]);
    }

    public void isEmpty(int[] stack, int num, int[] startIndex, int[] top) {

        if(top[num-1] == startIndex[num-1]) System.out.println("Stack is empty."); 
        else System.out.println("Stack is not empty.");   
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        k_Stacks_in_Array obj = new k_Stacks_in_Array();

        boolean ok = false;

        System.out.print("Enter the size of Array: ");
        int n = sc.nextInt();

        System.out.print("Enter the number of stack: ");
        int k = sc.nextInt();
        
        int[] stack = new int[n];
        int[] startIndex = new int[k];
        int[] top = new int[k];

        int size = stack.length / k;
        obj.count(stack, k, size, startIndex, top);

        int num = 0;
        
        while(true) {

            System.out.print("Which stack do you want to use? ");
            num = sc.nextInt();

            for(int i = 1; i <= k; i++)
            {
                if(num == i)
                {
                    ok = true;
                    break;
                }
            }
            if(ok == false)
            {
                System.out.println("Invalid stack number. Please try again.");
                continue;
            }
            System.out.println("Enter 1 to push, 2 to pop, 3 to peek, 4 to check if stack is empty, 0 to exit:");
            int choice = sc.nextInt();
            if(choice == 0) {
                break;
            }
            else if(choice == 1) {
                System.out.println("Enter the element to be pushed into the stack:");
                int data = sc.nextInt();
                obj.push(data, k, stack, num, startIndex, top);
            }
            else if(choice == 2) {
                obj.pop(stack, num, startIndex, top);
            }
            else if(choice == 3) {
                obj.peek(stack, num, startIndex, top);
            }
            else if(choice == 4) {
                obj.isEmpty(stack, num, startIndex, top);
            }
            else {
                System.out.println("Invalid choice. Please try again.");
            }  
            ok = false; 
        }
        sc.close();
    }
}