public class StrongNumber {
    public static int fact(int n){ return n==0?1:n*fact(n-1); }
    public static void main(String[] args) {
        int num=145,sum=0,temp=num;
        while(temp>0){ int d=temp%10; sum+=fact(d); temp/=10; }
        System.out.println(num+(sum==num?" is Strong":" is Not Strong"));
    }
}
