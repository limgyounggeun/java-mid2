package set.test;

import java.util.*;

public class UniqueNamesTest1 {

    public static void main(String[] args) {

        Integer[] inputArray = {30, 20, 20, 10, 10};

        Set<Integer> set = new HashSet<Integer>(List.of(inputArray));
//        for (Integer integer : inputArray) {
//            set.add(integer);
//        }
        for (Integer integer : set) {
            System.out.print(integer + " ");
        }
        System.out.println(" ");
        System.out.println("====================");
        Set<Integer> linkedSet = new LinkedHashSet<>();

        for (Integer integer : inputArray) {
            linkedSet.add(integer);
        }
        for (Integer integer : linkedSet) {
            System.out.print(integer + " ");
        }
        System.out.println();
        System.out.println("====================");

        Set<Integer> hashSet = new TreeSet<Integer>(linkedSet);
        for (Integer integer : hashSet) {
            System.out.print(integer + " ");
        }
    }
}
