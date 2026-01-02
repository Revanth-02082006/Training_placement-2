public class CountPrimeDigits {
    public static void main(String[] args) {
        int num = 75329, count = 0;
        while(num > 0){
            int d = num % 10;
            if(d==2 || d==3 || d==5 || d==7) count++;
            num /= 10;
        }
        System.out.println("Prime digits count = " + count);
    }
}
