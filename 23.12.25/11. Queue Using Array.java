class Queue {
    int[] arr; int front,rear,size;
    Queue(int n){ arr=new int[n]; front=0; rear=-1; size=0; }
    void enqueue(int x){ if(size==arr.length) return; arr[++rear]=x; size++; }
    int dequeue(){ if(size==0) return -1; int val=arr[front++]; size--; return val; }
}
public class QueueArray {
    public static void main(String[] args){
        Queue q=new Queue(5);
        q.enqueue(10); q.enqueue(20);
        System.out.println(q.dequeue());
    }
}
