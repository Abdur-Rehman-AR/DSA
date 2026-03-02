import java.util.Scanner;

public class QueueUsingStacks {

    Scanner sc = new Scanner(System.in);
    int[] stack = new int[100];
    int[] stack2 = new int[100];
    int top = -1;
    int top2 = -1;

    public boolean push(int n) {

        if(top == stack.length-1) return false;
        else{
            top++;
            stack[top] = n;
            return true;
        }
    }

    public boolean pop() {

        if(top == -1 && top2 == -1) return false;
        else{
            if(top2 == -1)
            {
                while(top != -1)
                {
                    top2++;
                    stack2[top2] = stack[top];
                    top--;
                }
            }
                top2--;
                return true;
        }
    }

    public int peek() {

        if(top == -1 && top2 == -1) return -1;
        else
        {
            if(top2 == -1)
            {
                while(top != -1)
                {
                    top2++;
                    stack2[top2] = stack[top];
                    top--;
                }
            }
        }
        return stack2[top2];
    }

    public boolean isEmpty() {

        if(top == -1 && top2 == -1) return true;
        else return false; 
    }

    public void display()
    {
        int tempTop2 = top2;
        if(tempTop2 != -1)
        {
            while(tempTop2 != -1)
            {
                System.out.print(stack2[tempTop2] +" ");
                tempTop2--;
            }
        }

        int tempTop = 0;
        if(top != -1)
        {
            while(tempTop <= top)
            {
                System.out.print(stack[tempTop] +" ");
                tempTop++;
            }
        }
    }

    public int menu(Scanner sc)
    {
        System.out.println("Which operation do you want to perform?");
        System.out.println(
        "1 for Enqueue \n"
        +"2 for Dequeue \n" 
        +"3 to getFront \n" 
        +"4 to Check if Empty\n"
        +"5 for Display \n"
        +"6 to Exit\n");
        return sc.nextInt();
    }
    public static void main(String[] args) {
        
        QueueUsingStacks obj = new QueueUsingStacks();
        Scanner sc = new Scanner(System.in);
        
        while(true) 
        {
            int choice = obj.menu(sc);
            switch(choice)
            {
                case 1:
                    System.out.print("Enter the element to Enqueue: ");
                    int element = sc.nextInt();
                    if(obj.push(element))
                    {
                        System.out.println("Number added.");
                    }
                    else
                    {
                        System.out.println("Queue is full.");
                    }
                    break;
                case 2:
                    if(obj.pop())
                    {
                        System.out.println("Element removed Successfully.");
                    }
                    else
                    {
                        System.out.println("Queue is Empty.");
                    }
                    break;
                case 3:
                    int result = obj.peek();
                    if(result == -1)
                    {
                        System.out.println("Queue is Empty.");
                    }
                    else
                    {
                        System.out.println("Front Element: " + result);
                    }
                    break;
                case 4:
                    System.out.println("Is Queue Empty? " + obj.isEmpty());
                    break;
                case 5:
                    obj.display();
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
            }
        }
    }
}