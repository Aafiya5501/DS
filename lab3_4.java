//Write a program to find whether the array contains a duplicate number or not.

import java.util.Scanner;

public class lab3_4 {
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The array is: ");
        for(int i=0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        boolean isDuplicate = false;
        for(int i=0; i<size; i++){
            for(int j=i+1; j<size; j++){
                if(arr[i] == arr[j]){
                    isDuplicate = true;
                    break;
                }
            }

        }
        if(isDuplicate){
            System.out.println("The array contains a duplicate number.");


 }else{
     
     System.out.println("The array does not contain a duplicate number.");

 }
        }

}

