public class FactorialTail {
    public static int fact(int n,int acc){
        if(n==0) return acc;
        return fact(n-1,n*acc);
    }
    public static void main(String[] args){
        System.out.println("Factorial = "+fact(5,1));
    }
}
