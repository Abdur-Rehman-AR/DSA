import java.util.Scanner;

public class Stack {

    Scanner sc = new Scanner(System.in);
    int[] stack = new int[100];
    int top = -1;

    public void push(int n) {

        if(top == 99) {
            System.out.println("Stack is full, Can't push.");
        }
        else{
            top++;
            stack[top] = n;
        }
    }

    public void pop() {

        if(top == -1) {
            System.out.println("Stack is Empty, Can't pop.");
        }
        else{
            System.out.println("Poped Element is: " +stack[top]);
            top--;
        }
    }

    public void peek() {

        if(top == -1){
            System.out.println("Stack is empty.");
        }  
        else{
            System.out.println("Top element of stack is: " +stack[top]);
        } 
    }

    public void isEmpty() {

        if(top == -1){
            System.out.println("Stack is empty.");
        }  
        else{
            System.out.println("Stack is not empty.");
        }     
    }
    public static void main(String[] args) {
        
        Stack stack = new Stack();
        
        while(true) {

            System.out.println("Enter 1 to push, 2 to pop, 3 to peek, 4 to check if stack is empty, 0 to exit:");
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
            else {
                System.out.println("Invalid choice. Please try again.");
            }   
        }
    }
}