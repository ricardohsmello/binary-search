package main;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[700000000];
        int target = 680000000;

        for (int i=0; i<array.length; i++) {
            array[i] = i + 1;
        }

        BinarySearch b = new BinarySearch();

        System.out.println(" Binary Search: ");

        System.out.println(LocalDateTime.now());
        b.binarySearch(array, target, 0, array.length - 1);
        System.out.println(LocalDateTime.now());

        System.out.println(" Simple Loop Search: ");

        SimpleLoopSearch s = new SimpleLoopSearch();
        System.out.println(LocalDateTime.now());
        s.searchNumberPosition(array, target);
        System.out.println(LocalDateTime.now());
    }
}
