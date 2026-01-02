public class SumOfCubesDigits {
    public static void main(String[] args) {
        int num = 123, sum = 0;
        while(num > 0){
            int d = num % 10;
            sum += d*d*d;
            num /= 10;
        }
        System.out.println("Sum of cubes of digits = " + sum);
    }
}
