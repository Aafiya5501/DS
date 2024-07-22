import java.util.Arrays;

public class insertascending {
    public static void main(String[] args) {
        int[] sortedArray = {1, 3, 5, 7, 9};
        int insertNumber = 4;

        System.out.println("Original Sorted Array: " + Arrays.toString(sortedArray));
        int insertIndex = findInsertIndex(sortedArray, insertNumber);
            newArray[i] = sortedArray[i];
        }

        newArray[insertIndex] = insertNumber;
        for (int i = insertIndex; i < sortedArray.length; i++){
            newArray[i + 1] = sortedArray[i];
        }
        while (index < sortedArray.length && sortedArray[index]<insertNumber){
            index++;
        }

