public class Circular_Doubly_Linked_List {

    static class Node 
    {
        Node previous;
        int data;
        Node next;

        Node(int data) 
        {
            this.previous = null;
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;

    public Circular_Doubly_Linked_List() 
    {
        head = null;
        tail = null;
    }

    public void addNode(int data) 
    {
        Node temp = new Node(data);
        if (head == null) 
        {
            head = temp;
            tail = temp;
            head.previous = tail;
            head.next = head;
        } 
        else 
        {
            tail.next = temp;
            temp.previous = tail;
            tail = tail.next;
            temp.next = head;
            head.previous = temp;
        }
    }

    public void display_Forward() 
    {
        if(head == null)
        {
            System.out.println("List is Empty.");
            return;
        }

        Node ptr = head;
        System.out.print(ptr.data + " -> ");
        ptr = ptr.next;

        while (ptr != head) 
        {
            System.out.print(ptr.data + " -> ");
            ptr = ptr.next;
        }

        System.out.println("back to head");
    }

    public void display_Backward() 
    {
        Node ptr = tail;
        System.out.print(ptr.data + " -> ");
        ptr = ptr.previous;

        while (ptr != tail) 
        {
            System.out.print(ptr.data + " -> ");
            ptr = ptr.previous;
        }

        System.out.println("back to tail");
    }
    public static void main(String[] args) 
    {
        Circular_Doubly_Linked_List list = new Circular_Doubly_Linked_List();
        list.addNode(101);
        list.addNode(520);
        list.addNode(370);
        System.out.println("Forward Display:");
        list.display_Forward();
        System.out.println("Backward Display:");
        list.display_Backward();
    }
}