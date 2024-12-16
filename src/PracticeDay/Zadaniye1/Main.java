package PracticeDay.Zadaniye1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> integers = new LinkedList<>(Arrays.asList(1,2,3,43,45,67,78,99));
        LinkedList<Integer> integers1 = new LinkedList<>(Arrays.asList(23,1, 25, 23, 2, 4, 5, 56));
        System.out.println("Task 1: ");
        System.out.println(integers.getFirst());

        System.out.println("Task 2: ");
        System.out.println(integers.getLast());

        System.out.println("Task 3: ");
        System.out.println(integers.contains(1));

        System.out.println("Task 4: ");
        System.out.println(Arrays.toString(integers.toArray()));

        System.out.println("Task 5: ");
        System.out.println(integers1.equals(integers));

        System.out.println("Task 6: ");
        System.out.println(integers.isEmpty());

        System.out.println("Task 7: ");
        System.out.println(integers.set(1, 12));

    }
}
