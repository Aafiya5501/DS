import java.util.Scanner;
public class armstrong{
    public static void main(String[] args) {
        System.out.println("Armstrong numbers from 1 to 10000:");
        for (int i = 1; i <= 10000; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isArmstrong(int n) {
        int sum = 0;
        int temp = n;
        while (temp!= 0) {
        int digit = temp % 10;
         sum += Math.pow(digit, getNumberOfDigits(n));
            temp /= 10;
        }
        return sum == n;
    }

    public static int getNumberOfDigits(int n) {
        int count = 0;
        while (n!= 0) {
            n /= 10;
            count++;
        }
        return count;
    }
}
