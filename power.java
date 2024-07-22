public class power {
    static int power(int N, int P) {
        int pow = 1;
        for (int i = 1; i <= P; i++) {
            pow *= N;
        }
        return pow;
    }

    public static void main(String[] args) {
        int N = 2;
        int P = 3;
        System.out.println(power(N, P));
    }
}