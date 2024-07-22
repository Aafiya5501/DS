import java.util.Scanner;
 class SumOfseries{
    public static void main(String[] args) {
        int n = 10; // change this to the desired value of n
        System.out.println("The sum of the series is: " + sumOfSeries(n));
    }

    public static int sumOfSeries(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                sum += j;
            }
        }
        return sum;
    }
}