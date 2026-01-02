public class ArmstrongRange {
    public static void main(String[] args) {
        for(int num=100; num<=999; num++){
            int sum=0, temp=num;
            while(temp>0){
                int d=temp%10;
                sum+=d*d*d;
                temp/=10;
            }
            if(sum==num) System.out.println(num);
        }
    }
}
