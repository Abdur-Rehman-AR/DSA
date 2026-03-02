import java.util.Scanner;
public class Stock_span {

    Scanner sc = new Scanner(System.in);
    int top = -1;
    int size = 0;
    int[] stack;
    int[] arr1;
    int[] arr2;

    public void stockSpan()
    {
        for(int i = 0; i < arr1.length; i++)
        {
            int sum = 1;
            if(top == -1 || arr1[i] < arr1[stack[top]])
            {
                push(i);
                arr2[i] = 1;
            }
            else
            {
                while(top != -1 && arr1[i] >= arr1[stack[top]])
                {
                    sum += arr2[pop()];
                }
                push(i);
                arr2[i] = sum;
            }
        }
    }

    public void push(int data) {

        if(top != size-1) {
            top++;
            stack[top] = data;
        }
    }

    public int pop() {

        if(top == -1) return -1;
        else return stack[top--];        
    }

    public int peek() {

        if(top == -1) return -1;
        else return stack[top];
    }

    public boolean isEmpty() {

        if(top == -1) return true;
        else return false;
    }

    public void display()
    {
        for(int i = 0; i < arr2.length; i++)
        {
            System.out.print(arr2[i] +" ");
        }
    }
    public static void main(String[] args) {
        
        Stock_span obj = new Stock_span();
        int data = 0;

        System.out.print("Enter the number of elements in Array: ");  
        obj.size = obj.sc.nextInt();
        obj.arr1 = new int[obj.size];
        obj.arr2 = new int[obj.size];
        obj.stack = new int[obj.size];

        for(int i = 0; i < obj.size ; i++)
        {
            System.out.print("Enter Number " +(i+1) +" : ");
            data = obj.sc.nextInt();
            obj.arr1[i] = data;
        } 
        obj.stockSpan();
        obj.display();
    }
}