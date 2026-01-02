public class PerfectSquaresInRange {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            int root=(int)Math.sqrt(i);
            if(root*root==i) System.out.print(i+" ");
        }
    }
}
