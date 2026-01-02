import java.util.HashMap;

public class FibonacciMemo {
    static HashMap<Integer,Integer> memo=new HashMap<>();
    public static int fib(int n){
        if(n<=1) return n;
        if(memo.containsKey(n)) return memo.get(n);
        int val=fib(n-1)+fib(n-2);
        memo.put(n,val);
        return val;
    }
    public static void main(String[] args){
        for(int i=0;i<10;i++) System.out.print(fib(i)+" ");
    }
}
