public class SumEven {
    public static void main(String[] args) {
        int n = 20, sum = 0;
        for(int i=2;i<=n;i+=2) sum+=i;
        System.out.println("Sum of even numbers up to " + n + " = " + sum);
    }
}
