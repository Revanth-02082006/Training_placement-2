public class FactorialLoop {
    public static void main(String[] args) {
        int num=7,fact=1;
        for(int i=1;i<=num;i++) fact*=i;
        System.out.println("Factorial = "+fact);
    }
}
