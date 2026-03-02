import java.util.Scanner;
public class Previous_Smaller_Element {

    Scanner sc = new Scanner(System.in);
    int top = -1;
    int size = 0;
    int[] stack = new int[size];
    int[] arr = new int[size];

    public int previousSmallerElement(int data)
    {
        if(isEmpty())
        {
            return -1;
        }
        else
        {
            while(top != -1)
            {
                if(data > peek())
                {
                    return peek();
                }
                else
                {
                    pop();
                    if(isEmpty())
                    {
                        return -1;
                    }
                }
            }
        }
        return -1;
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
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        
        Previous_Smaller_Element obj = new Previous_Smaller_Element();
        int data = 0;

        System.out.print("Enter the number of elements in Array: ");  
        obj.size = obj.sc.nextInt();
        obj.arr = new int[obj.size];
        obj.stack = new int[obj.size];

        for(int i = 0; i < obj.size ; i++)
        {
            System.out.print("Enter Number " +(i+1) +" : ");
            data = obj.sc.nextInt();
            obj.arr[i] = obj.previousSmallerElement(data);
            obj.push(data);
        } 
        System.out.println();
        obj.display();
    }
}