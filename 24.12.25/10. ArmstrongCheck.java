public class ArmstrongCheck {
    public static void main(String[] args) {
        int num=407,sum=0,temp=num;
        while(temp>0){ int d=temp%10; sum+=d*d*d; temp/=10; }
        System.out.println(num+(sum==num?" is Armstrong":" is Not Armstrong"));
    }
}
