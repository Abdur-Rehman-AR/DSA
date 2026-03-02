import java.util.Scanner;

public class Two_stacks_in_array {

    Scanner sc = new Scanner(System.in);
    int[] array = new int[100];
    int top_1 = -1;
    int top_2 = array.length;

    public void push(int n, int stack_num) {

        if(stack_num == 1)
        {
            if(top_1+1 == top_2) {
                System.out.println("Stack is full, Can't push.");
            }
            else{
                top_1++;
                array[top_1] = n;
            }
        }
        else
        {
            if(top_2-1 == top_1)
            {
                System.out.println("Stack is full, Can't push.");
            }
            else
            {
                top_2--;
                array[top_2] = n;
            }
        }
    }

    public void pop(int stack_num) {

        if(stack_num == 1)
        {
            if(top_1 == -1) {
            System.out.println("Stack is Empty, Can't pop.");
            }
            else{
                System.out.println("Popped Element is: " +array[top_1]);
                top_1--;
            }
        }
        else
        {
            if(top_2 == array.length) {
            System.out.println("Stack is Empty, Can't pop.");
            }
            else{
                System.out.println("Popped Element is: " +array[top_2]);
                top_2++;
            }
        }
    }

    public void peek(int stack_num) {

        if(stack_num == 1)
        {
            if(top_1 == -1){
            System.out.println("Stack is empty.");
            }  
            else{
                System.out.println("Top element of stack is: " +array[top_1]);
            }
        }
        else
        {
            if(top_2 == array.length){
            System.out.println("Stack is empty.");
            }  
            else{
                System.out.println("Top element of stack is: " +array[top_2]);
            }
        } 
    }

    public void isEmpty(int stack_num) {

        if(stack_num == 1)
        {
            if(top_1 == -1){
            System.out.println("Stack is empty.");
            }  
            else{
                System.out.println("Stack is not empty.");
            }
        }
        else
        {
            if(top_2 == array.length){
            System.out.println("Stack is empty.");
            }  
            else{
                System.out.println("Stack is not empty.");
            }
        }     
    }
    public static void main(String[] args) {
        
        Two_stacks_in_array stack = new Two_stacks_in_array();
        int stack_num = 0, choice = 0, n = 0;

        while(true) {

            while(true)
        {
            System.out.print("Enter 1 to choose stack 1 and 2 to choose stack 2.");
            stack_num = stack.sc.nextInt();

            if(stack_num == 1 || stack_num == 2)
            {
                break;
            }
            else
            {
                System.out.println("Invalid Choice.");
            }
        }

            System.out.println("Enter 1 to push, 2 to pop, 3 to peek, 4 to check if stack is empty, 0 to exit:");
            choice = stack.sc.nextInt();
            if(choice == 0) {
                break;
            }
            else if(choice == 1) {
                System.out.println("Enter the element to be pushed into the stack:");
                n = stack.sc.nextInt();
                stack.push(n, stack_num);
            }
            else if(choice == 2) {
                stack.pop(stack_num);
            }
            else if(choice == 3) {
                stack.peek(stack_num);
            }
            else if(choice == 4) {
                stack.isEmpty(stack_num);
            }
            else {
                System.out.println("Invalid choice. Please try again.");
            }   
        }
        stack.sc.close();
    }
}