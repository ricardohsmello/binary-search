package main;

public class BinarySearch {
 
    public int binarySearch(int[]array, int target, int low, int high) {
        int middlePosition = (low + high) / 2;
        int currentNumber = array[middlePosition];

        if (low > high) {
            return -1;
        }

        if (target == currentNumber) {
            return middlePosition;
        }

        if (target < currentNumber) {
            return binarySearch(array, target, low, middlePosition - 1);
        } else {
            return binarySearch(array, target, middlePosition + 1, high);
         }
    }
}