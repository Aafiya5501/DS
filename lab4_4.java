import java.util.Arrays;

public class lab4_4{
    public static void main(String[] args) {
        int[] sortedArray = {1, 3, 5, 7, 9};
        int deleteNumber = 5;

        System.out.println("Original Sorted Array: " + Arrays.toString(sortedArray));
        int deleteIndex = findDeleteIndex(sortedArray, deleteNumber);
        if (deleteIndex != -1) {
            int[] newArray = new int[sortedArray.length - 1];
            for (int i = 0, j = 0; i < sortedArray.length; i++) {
                if (i == deleteIndex) {
                    continue;
                }
                newArray[j++] = sortedArray[i];
            }
            System.out.println("Array after deleting " + deleteNumber + ": " + Arrays.toString(newArray));
        } else {
            
            System.out.println(deleteNumber + " is not found in the array.");
        }
    }

    
    private static int findDeleteIndex(int[] sortedArray, int deleteNumber) {
        for (int i = 0; i < sortedArray.length; i++) {
            if (sortedArray[i] == deleteNumber) {
                return i; 
            }
        }
        return -1; 
    }
}
