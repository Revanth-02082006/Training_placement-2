class Node {
    int data; Node next;
    Node(int d){ data=d; }
}
public class ReverseLinkedList {
    Node head;
    public void insert(int d){
        Node n=new Node(d);
        n.next=head; head=n;
    }
    public void display(){
        Node t=head;
        while(t!=null){ System.out.print(t.data+" "); t=t.next; }
    }
    public static void main(String[] args){
        ReverseLinkedList list=new ReverseLinkedList();
        list.insert(1); list.insert(2); list.insert(3);
        list.display();
    }
}
