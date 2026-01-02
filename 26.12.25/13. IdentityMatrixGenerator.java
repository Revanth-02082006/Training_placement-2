public class IdentityMatrixGenerator {
    public static void main(String[] args) {
        int n=3;
        int[][] mat=new int[n][n];
        for(int i=0;i<n;i++) mat[i][i]=1;
        for(int[] row:mat){ for(int v:row) System.out.print(v+" "); System.out.println(); }
    }
}
