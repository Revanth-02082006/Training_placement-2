public class SymmetricMatrixGenerator {
    public static void main(String[] args) {
        int[][] mat={{1,2,3},{2,4,5},{3,5,6}};
        boolean symmetric=true;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                if(mat[i][j]!=mat[j][i]) symmetric=false;
            }
        }
        System.out.println(symmetric?"Symmetric":"Not Symmetric");
    }
}
