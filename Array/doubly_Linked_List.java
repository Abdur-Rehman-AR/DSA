public class doubly_Linked_List {

    static class Node 
    {
        Node previous;
        int data;
        Node next;

        Node(int data) 
        {
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }

    private Node head;
    private Node tail;

    public doubly_Linked_List() 
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
        } 
        else 
        {
            tail.next = temp;
            temp.previous = tail;
            tail = tail.next;
        }
    }

    public void display_Forward() 
    {
        Node ptr = head;
        while (ptr != null) 
        {
            System.out.print(ptr.data + " -> ");
            ptr = ptr.next;
        }
        System.out.println("null");
    }

    public void display_Backward() 
    {
        Node ptr = tail;
        while (ptr != null) 
        {
            System.out.print(ptr.data + " -> ");
            ptr = ptr.previous;
        }
        System.out.println("null");
    }
    public static void main(String[] args) 
    {
        doubly_Linked_List list = new doubly_Linked_List();
        list.addNode(101);
        list.addNode(520);
        list.addNode(370);
        System.out.println("Forward Display:");
        list.display_Forward();
        System.out.println("Backward Display:");
        list.display_Backward(); 

    }
}
