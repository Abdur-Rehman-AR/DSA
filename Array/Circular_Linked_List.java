public class Circular_Linked_List {

    static class Node 
    {
        int data;
        Node next;

        Node(int data) 
        {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;

    public Circular_Linked_List() 
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
            temp.next = head;
        } 
        else 
        {
            tail.next = temp;
            tail = tail.next;
            temp.next = head;
        }
    }

    public void display() 
    {
        if(head == null)
        {
            System.out.println("List is Empty.");
            return;
        }
        Node ptr = head;
        System.out.print(ptr.data +" -> ");
        ptr = ptr.next;

        while (ptr != head) 
        {
            System.out.print(ptr.data + " -> ");
            ptr = ptr.next;
        }
        System.out.println("(back to head)");
    }
    public static void main(String[] args) 
    {
        Circular_Linked_List list = new Circular_Linked_List();
        list.addNode(101);
        list.addNode(520);
        list.addNode(370);
        list.display(); 
    }
}