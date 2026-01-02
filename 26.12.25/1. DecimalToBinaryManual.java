public class DecimalToBinaryManual {
    public static void main(String[] args) {
        int num = 25;
        String bin = "";
        while(num > 0){
            bin = (num % 2) + bin;
            num /= 2;
        }
        System.out.println("Binary = " + bin);
    }
}
