public class SumMatrix {
    public static void main(String[] args){
        int[][] mat={{1,2},{3,4}};
        int sum=0;
        for(int[] row:mat) for(int v:row) sum+=v;
        System.out.println("Sum = "+sum);
    }
}
