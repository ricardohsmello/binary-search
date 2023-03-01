package test;

import main.BinarySearch;
 import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {
 
    @Test
    public void should_return_position_5_when_target_is_16() {
        int[] array = {3, 5, 7, 8, 13, 16, 17, 20};
        int target = 16;

        BinarySearch b = new BinarySearch();

        int position = b.binarySearch(array, target, 0, array.length - 1);
        Assertions.assertEquals(position, 5);
    }

    @Test
    public void should_return_minus1_when_target_is_notFound() {
        int[] array = {3, 5, 7, 8, 13, 16, 17, 20};
        int target = 33;

        BinarySearch b = new BinarySearch();

        int position = b.binarySearch(array, target, 0, array.length - 1);
        Assertions.assertEquals(position, -1);
    }
}
