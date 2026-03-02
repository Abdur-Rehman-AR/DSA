import java.util.Scanner;

public class Reverse_Stack_using_recursion {

    Scanner sc = new Scanner(System.in);
    int[] stack = new int[100];
    int top = -1;

    public void push(int n) {
        if(top < 99) {
            top++;
            stack[top] = n;
        }
    }

    public int pop() {
        if(top != -1) {
            return stack[top--];
        }
        return -1;
    }

    public int peek() {
        if(top != -1) return stack[top];
        return -1; 
    }

    public void insertAtBottom(int n) {
        if(top == -1) 
        { 
            push(n);
            return;
        }
        int temp = pop();
        insertAtBottom(n);
        push(temp);
    }

    public void reverseStack() {
        if(top == -1) return;
        int temp = pop();
        reverseStack();
        insertAtBottom(temp);
    }

    public void displayStack() {
        for(int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Reverse_Stack_using_recursion obj = new Reverse_Stack_using_recursion();
        Scanner sc = new Scanner(System.in);

        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);

        System.out.print("Original Stack: ");
        obj.displayStack();

        obj.reverseStack();

        System.out.print("Reversed Stack: ");
        obj.displayStack();
        sc.close();
    }
}