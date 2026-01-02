public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] mat={{1,2},{3,4}};
        int[][] trans=new int[2][2];
        for(int i=0;i<2;i++) for(int j=0;j<2;j++) trans[j][i]=mat[i][j];
        for(int[] row:trans){ for(int v:row) System.out.print(v+" "); System.out.println(); }
    }
}
