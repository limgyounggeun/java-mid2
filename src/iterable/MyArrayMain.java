package iterable;

import java.util.Iterator;

public class MyArrayMain {
    public static void main(String[] args) {
         MyArray arr = new MyArray(new int[]{1,2,3,4,5});
        Iterator<Integer> iterator = arr.iterator();
        System.out.println("iterator 사용");
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println(next);
        }
    }
}
