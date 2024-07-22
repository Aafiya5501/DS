import java.util.Scanner;

public class lab6_1{
    public static void swap(int a, int b) {
        System.out.println("Before swapping:");
        System.out.println("a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println("After swapping:");
        System.out.println("a = " + a + ", b = " + b);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number (a): ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number (b): ");
        int num2 = scanner.nextInt();

        swap(num1, num2);
        
        scanner.close();
    }
}
