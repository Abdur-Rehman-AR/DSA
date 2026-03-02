import java.util.Scanner;

public class Queue_using_Array {
    
    int[] queue;
    int front = -1;
    int rear = -1;
    int size = 0;

    public boolean enqueue(int data)
    {
        if(front == -1) front = 0;
        if(rear == size-1) return false;
        else
        {
            rear++;
            queue[rear] = data;
        }
        return true;
    }

    public boolean dequeue()
    {
        if(front == -1 || front > rear) return false;
        else if(front == rear)
        {
            front = rear = -1;
            return true;
        }
        else
        {
            front++;
            return true;
        }
    }

    public boolean isEmpty()
    {
        if(front == -1 && rear == -1) return true;
        else return false;
    }

    public boolean isFull()
    {
        if(rear == size-1) return true;
        else return false;
    }

    public int getFront()
    {
        if(front == -1) return -1;
        else return queue[front];
    }

    public int getRear()
    {
        if(rear == -1) return -1;
        else return queue[rear];
    }

    public void display()
    {
        if(front == -1 || front > rear)
        {
            System.out.println("Queue is Empty.");
            return;
        }
        for(int i = front; i <= rear; i++)
        {
            System.out.print(queue[i] +" ");
        }
    }
    public static void main(String[] args) {
        
        Queue_using_Array obj = new Queue_using_Array();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Queue: ");
        obj.size = sc.nextInt();
        obj.queue = new int[obj.size];
        while(true) 
        {
            System.out.println("Which operation do you want to perform?");
            System.out.println("Enter 1 for Enqueue, 2 for Dequeue, 3 for Display, 4 to getFront, 5 to getRear, 6 to Check if Empty, 7 to Check if Full, 8 to Exit");
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.print("Enter the element to Enqueue: ");
                    int element = sc.nextInt();
                    if(obj.enqueue(element))
                    {
                        System.out.println("Number added.");
                    }
                    else
                    {
                        System.out.println("Queue is full.");
                    }
                    break;
                case 2:
                    if(obj.dequeue())
                    {
                        System.out.println("Element removed Successfully.");
                    }
                    else
                    {
                        System.out.println("List is Empty.");
                    }
                    break;
                case 3:
                    obj.display();
                    System.out.println();
                    break;
                case 4:
                    int result = obj.getFront();
                    if(result == -1)
                    {
                        System.out.println("Queue is Empty.");
                    }
                    else
                    {
                        System.out.println("Front Element: " + result);
                    }
                    break;
                case 5:
                    int result2 = obj.getRear();
                    if(result2 == -1)
                    {
                        System.out.println("Queue is Empty.");
                    }
                    else
                    {
                        System.out.println("Rear Element: " + result2);
                    }
                    break;
                case 6:
                    System.out.println("Is Queue Empty? " + obj.isEmpty());
                    break;
                case 7:
                    System.out.println("Is Queue Full? " + obj.isFull());
                    break;
                case 8:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
            }
        }
    }
}