import java.util.Scanner;

public class CircularQueue {
    
    int[] queue;
    int front = -1;
    int rear = -1;
    int size = 0;

    public boolean enqueue(int data)
    {
        if(front == -1)
        {
            front = rear = 0;
            queue[rear] = data;
        }
        else
        {
            if((rear + 1) % size != front)
            {
                rear = (rear + 1) % size;
                queue[rear] = data;
            }
            else return false;
        }
        return true;
    }

    public boolean dequeue()
    {
        if(front == -1) return false;
        else if(front == rear)
        {
            front = rear = -1;
            return true;
        }
        else
        {
            front = (front + 1) % size;
            return true;
        }
    }

    public boolean isEmpty()
    {
        return (front == -1 && rear == -1);
    }

    public boolean isFull()
    {
        return ((rear + 1) % size == front);
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
        if(front == -1)
        {
            System.out.println("Queue is Empty.");
            return;
        }
        else if(rear < front)
        {
            for(int i = front; i < size; i++) System.out.print(queue[i] + " ");
            for(int i = 0; i <= rear; i++) System.out.print(queue[i] + " ");
        }
        else
        {
            for(int i = front; i <= rear; i++) System.out.print(queue[i] +" ");
        }
    }

    public int menu(Scanner sc)
    {
        System.out.println("Which operation do you want to perform?");
        System.out.println(
        "1 for Enqueue \n"
        +"2 for Dequeue \n" 
        +"3 to getFront \n" 
        +"4 to getRear \n"
        +"5 to Check if Empty\n"
        +"6 to check if full\n"
        +"7 for Display \n"
        +"8 to Exit\n");
        return sc.nextInt();
    }
    public static void main(String[] args) {
        
        CircularQueue obj = new CircularQueue();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Queue: ");
        obj.size = sc.nextInt();
        obj.queue = new int[obj.size];
        while(true) 
        {
            int choice = obj.menu(sc);
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
                        System.out.println("Queue is Empty.");
                    }
                    break;
                case 3:
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
                case 4:
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
                case 5:
                    System.out.println("Is Queue Empty? " + obj.isEmpty());
                    break;
                case 6:
                    System.out.println("Is Queue Full? " + obj.isFull());
                    break;
                case 7:
                    obj.display();
                    System.out.println();
                    break;
                case 8:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
            }
        }
    }
}