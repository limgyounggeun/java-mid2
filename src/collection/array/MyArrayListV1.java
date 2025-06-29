package collection.array;

import java.util.Arrays;

public class MyArrayListV1 {

    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size;

    public MyArrayListV1() {
        elementData = new Object[DEFAULT_CAPACITY];
    }
    public MyArrayListV1(int capacity) {
        elementData = new Object[capacity];
    }

    public int size(){
        return size;
    }

    public void add(Object o) {
        elementData[size] = o;
        size++;
    }

    public Object getIndex(int index) {
        return elementData[index];
    }

    public Object set(int index, Object element) {
        Object oldValue = getIndex(index);
        elementData[index] = element;
        return oldValue;
    }

    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (elementData[i].equals(o)) {
                return i;
            }
        }
        return  -1;
    }
    public String toString(){
        return Arrays.toString(Arrays.copyOf(elementData, size)) + "size = " + size  + " ,capacity = " + elementData.length;
    }
}
