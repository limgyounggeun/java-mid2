package set.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetOperationsTest {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));

        Set<Integer> set3 = new HashSet<>(set1);
        set3.addAll(set2);
        System.out.println("합집합 : " + set3);
        Set<Integer> set4 = new HashSet<>(set1);
        set4.retainAll(set2);
//        for (Integer integer : set1) {
//            if(set2.contains(integer)) {
//                set4.add(integer);
//            }
//        }
        System.out.println("교집합: " + set4);
        Set<Integer> set5 = new HashSet<>(set1);
//        for (Integer integer : set1) {
//            if(!set2.contains(integer)) {
//                set5.add(integer);
//            }
//        }
        set5.removeAll(set2);
        System.out.println("차집합 : " + set5);
    }
}
