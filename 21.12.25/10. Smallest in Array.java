public class SmallestArray {
    public static void main(String[] args) {
        int[] arr={10,25,3,99,45};
        int min=arr[0];
        for(int n:arr) if(n<min) min=n;
        System.out.println("Smallest = "+min);
    }
}
