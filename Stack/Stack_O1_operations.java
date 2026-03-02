import java.util.Scanner;

public class Stack_O1_operations {

    Scanner sc = new Scanner(System.in);
    int[] stack_1 = new int[100];
    int[] stack_2 = new int[100];
    int top_1 = -1;
    int top_2 = -1;

    public void push(int n) {

        if(top_1 == 99) {
            System.out.println("Stack is full, Can't push.");
            return;
        }
        else{
            top_1++;
            stack_1[top_1] = n;
            if(top_2 != -1)
            {
                if(stack_2[top_2] > n)
                {
                    top_2 = top_2 + 1;
                    stack_2[top_2] = n;
                }
                else
                {
                    top_2 = top_2 + 1;
                    stack_2[top_2] = stack_2[top_2-1];
                }
            }
            else
            {
                top_2 = top_2 + 1;
                stack_2[top_2] = n;
            }
        }
    }

    public void pop() {

        if(top_1 == -1) {
            System.out.println("Stack is Empty, Can't pop.");
            return;
        }
        else{
            System.out.println("Poped Element is: " +stack_1[top_1]);
            top_1--;
            top_2--;
        }
    }

    public void peek() {

        if(top_1 == -1){
            System.out.println("Stack is empty.");
        }  
        else{
            System.out.println("Top element of stack is: " +stack_1[top_1]);
        } 
    }

    public void isEmpty() {

        if(top_1 == -1){
            System.out.println("Stack is empty.");
        }  
        else{
            System.out.println("Stack is not empty.");
        }     
    }

    public void getMin()
    {
        if(top_2 == -1)
        {
            System.out.println("Stack is empty.");
        }
        else
        {
            System.out.println("Smallest Element in stack is: " +stack_2[top_2]);
        }
    }
    public static void main(String[] args) {
        
        Stack_O1_operations stack = new Stack_O1_operations();
        
        while(true) {

            System.out.println("Enter 1 to push, 2 to pop, 3 to peek, 4 to check if stack is empty, 5 to get Minimum element, 0 to exit:");
            int choice = stack.sc.nextInt();
            if(choice == 0) {
                break;
            }
            else if(choice == 1) {
                System.out.println("Enter the element to be pushed into the stack:");
                int n = stack.sc.nextInt();
                stack.push(n);
            }
            else if(choice == 2) {
                stack.pop();
            }
            else if(choice == 3) {
                stack.peek();
            }
            else if(choice == 4) {
                stack.isEmpty();
            }
            else if(choice == 5) {
                stack.getMin();
            }
            else {
                System.out.println("Invalid choice. Please try again.");
            }   
        }
        stack.sc.close();
    }
}