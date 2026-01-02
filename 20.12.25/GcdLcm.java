public class GcdLcm {
    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
    public static void main(String[] args) {
        int a = 12, b = 18;
        int g = gcd(a, b);
        int l = (a * b) / g;
        System.out.println("GCD = " + g + ", LCM = " + l);
    }
}
