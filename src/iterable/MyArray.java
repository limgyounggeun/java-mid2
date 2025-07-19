package iterable;

import java.util.Iterator;

public class MyArray implements Iterable<Integer> {
    @Override
    public Iterator<Integer> iterator() {
        return new MyArrayIterator(numbers);
    }

    private int[] numbers;

    public MyArray(int[] numbers) {
        this.numbers = numbers;
    }
}
