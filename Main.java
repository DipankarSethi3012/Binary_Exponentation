public class Main {
    private final static int MOD = (int)1e9 + 7;

    public static void main(String[] args) {
        int base = 2, exp = 30;
        int res = power(base, exp);
        System.out.println("res: " + res);
    }

    private static int power(int base, int exp) {
        long res = 1;  // Use long to avoid overflow
        long b = base; // Convert base to long

        while (exp > 0) {
            if ((exp & 1) == 1) {
                res = (res * b) % MOD; // Correct modular multiplication
            }
            b = (b * b) % MOD; // Correct modular squaring
            exp >>= 1;
        }

        return (int) res; // Convert back to int for final output
    }
}
