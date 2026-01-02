class NodeS { int data; NodeS next; NodeS(int d){data=d;} }
class Stack {
    NodeS top;
    void push(int x){ NodeS n=new NodeS(x); n.next=top; top=n; }
    int pop(){ if(top==null) return -1; int v=top.data; top=top.next; return v; }
}
public class StackLinked {
    public static void main(String[] args){
        Stack s=new Stack();
        s.push(5); s.push(10);
        System.out.println(s.pop());
    }
}
