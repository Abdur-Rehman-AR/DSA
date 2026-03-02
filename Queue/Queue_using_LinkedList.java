import java.util.Scanner;

public class Queue_using_LinkedList {

    Node front;
    Node rear;
    
    static class Node {

        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public Queue_using_LinkedList()
    {
        front = null;
        rear = null;
    }

    public void enqueue(int data)
    {
        Node temp = new Node(data);

        if(front == null && rear == null)
        {
            front = rear = temp;
        }
        else
        {
            rear.next = temp;
            rear = temp;
        }
    }

    public int dequeue()
    {
        if(front == null)
        {
            throw new RuntimeException("Queue is Empty.");
        }
        int num = front.data;
        if(front == rear) front = rear = null;
        else front = front.next;
        return num;
    }

    public int getFront()
    {
        if(front == null)
        {
            throw new RuntimeException("Queue is Empty.");
        }
        else return front.data;
    }

    public int getRear()
    {
        if(rear == null)
        {
            throw new RuntimeException("Queue is Empty.");
        }
        else return rear.data;
    }

    public boolean isEmpty()
    {
        return front == null;
    }

    public void display()
    {
        if(front == null)
        {
            System.out.println("Queue is Empty.");
            return;
        }
        Node ptr = front;
        while(ptr != null)
        {
            System.out.print(ptr.data +" --> ");
            ptr = ptr.next;
        }
        System.out.println("null");
    }

    public int menu(Scanner sc)
    {
        System.out.println("Which operation do you want to perform?");
            System.out.println("Enter 1 for Enqueue \n"
            +"2 for Dequeue \n" 
            +"3 to getFront \n" 
            +"4 to getRear \n"
            +"5 to Check if Empty\n"
            +"6 for Display \n"
            +"7 to Exit\n");
            return sc.nextInt();
    }

    public static void main(String[] args) {
        
        Queue_using_LinkedList obj = new Queue_using_LinkedList();
        Scanner sc = new Scanner(System.in);
        
        while(true) 
        {
            int choice = obj.menu(sc);
            switch(choice)
            {
                case 1:
                    System.out.print("Enter the element to Enqueue: ");
                    int element = sc.nextInt();
                    obj.enqueue(element);
                    System.out.println("Number added.");
                    break;
                case 2:
                    try 
                    {
                        int a = obj.dequeue();
                        System.out.println("Dequeued element: " + a);
                    } 
                    catch (Exception e) 
                    {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    try 
                    {
                        int b = obj.getFront();
                        System.out.println("Front Element: " + b);
                    } 
                    catch (Exception e) 
                    {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    try 
                    {
                       int c = obj.getRear();
                       System.out.println("Rear Element: " + c);
                    } 
                    catch (Exception e) 
                    {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    System.out.println("Is Queue Empty? " + obj.isEmpty());
                    break;
                case 6:
                    obj.display();
                    System.out.println();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
            }
        }
    }
}