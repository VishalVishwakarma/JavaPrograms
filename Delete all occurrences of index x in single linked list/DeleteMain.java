import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}

class MyLinkedList{
    Node head;
    int size;
    public void add(int data){
        if(head == null){
            head = new Node(data);
            size += 1;
            return;
        }
        Node current = head;
        while(current.next != null)
        current = current.next;

        current.next = new Node(data);
        size += 1;
    }

    public void display(){
        if(head == null)
        return;
        Node current = head;
        while(current.next != null){
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.print(current.data);
    }

    public void printLinkList(Node head) {
        if(head == null)
        return;
        Node current = head;
        while(current.next != null){
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.print(current.data);
    }

    public Node deleteAllOccurences(Node head, int n){
        
        Node current = head;

        //Except First Node, we remove all nodes matching key 'n'.
        while(head != null && head.next != null){
            if (head.next.data == n) {
                head.next = head.next.next;
            }
            head = head.next;
        }

        //First Node is still remaining to be checked
        //We check if first node has key 'n' --> if yes we return the next node as first node
        if(current.data == n) {
            return current.next;
        }

        return current;
    }
    

}

public class DeleteMain{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        MyLinkedList ll = new MyLinkedList();
        int lsize = s.nextInt();
        if(lsize<=0){
            System.out.println("Invalid Input");
            System.exit(0);
        }
        for (int i=0; i<lsize; i++){
            int data = s.nextInt();
            ll.add(data);
        }
        System.out.print("Enter the element to be deleted:");
        int n = s.nextInt();
        
        //Declared a TEMP node, that will store the node returned by the function deleteAllOccurences()
        Node temp = ll.deleteAllOccurences(ll.head, n);
        System.out.println("The list after deletion: ");
        
        //Defined a new function printLinkList to display the linklist from the node provided
        ll.printLinkList(temp);
    }
}
