public class ReverseDigitsSum {
    public static void main(String[] args) {
        int num=1234,rev=0,sum=0;
        while(num>0){ int d=num%10; rev=rev*10+d; sum+=d; num/=10; }
        System.out.println("Reversed = "+rev+", Sum of digits = "+sum);
    }
}
