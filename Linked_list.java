public class Linked_list
 {
    Node head;
    public int size = 0;
    class Node
    {
        String data;
        Node next;

        Node(String data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data)
    {
        size++;
        Node newNode = new Node(data);
        if(head==null)
        {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data)
    {
        size++;
        Node newNode = new Node(data);
        if(head==null)
        {
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next!=null)
        {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void deleteFirst()
    {
        if(head==null)
        {
            System.out.println("The list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    public void deleteLast()
    {
        if(head==null)
        {
            System.out.println("The list is empty");
            return;
        }
        size--;
        if(head.next==null)
        {
            head = null;
            return;
        }
        Node secondLastNode = head;
        Node lastNode = head.next;

        while(lastNode.next!=null)
        {
            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
        }

        secondLastNode.next = null;
    }

    public void getSize()
    {
        System.out.println("Linked list size is : "+size);
    }

    public void reverseList()
    {
        if(head==null || head.next==null)
        {
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;
        while(currNode!=null)
        {
            Node newNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = newNode;
        }

        head.next = null;
        head = prevNode;
    }

    public void printList()
    {
        if(head==null)
        {
            System.out.println("The list is empty");
            return;
        }
        Node currNode = head;
        while(currNode!=null)
        {
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Linked_list list = new Linked_list();
        list.addFirst("am");
        list.printList();

        list.addFirst("I");
        list.printList();

        list.addLast("a");
        list.addLast("student");
        list.printList();
        list.getSize();

        // list.deleteFirst();
        // list.printList();

        // list.deleteLast();
        // list.printList();
        // list.getSize();

        list.reverseList();
        list.printList();
    }
}
