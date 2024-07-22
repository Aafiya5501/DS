

import java.util.Scanner;

public class lab3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr[i] == num1) {
                arr[i] = num2;
            }
        }
        System.out.println("The final array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            if (arr[i] == num2) {
                System.out.println("The index of " + num2 + " is: " + i);
            }
        }
        }
    }

        
