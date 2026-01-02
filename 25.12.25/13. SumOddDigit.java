public class SumOddDigits {
    public static void main(String[] args) {
        int num = 48291, sum = 0;
        while(num > 0){
            int d = num % 10;
            if(d % 2 != 0) sum += d;
            num /= 10;
        }
        System.out.println("Sum of odd digits = " + sum);
    }
}
