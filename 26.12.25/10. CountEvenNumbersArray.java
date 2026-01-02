public class CountEvenNumbersArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int count = 0;
        for(int n:arr) if(n%2==0) count++;
        System.out.println("Even numbers count = " + count);
    }
}
