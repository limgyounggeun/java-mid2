package collection.array;

import java.util.Arrays;

public class MyArrayListV4<E> {

    private static final int DEFAULT_CAPACITY = 2  ;

    private Object[] elementData;
    private int size;

    public MyArrayListV4() {
        elementData = new Object[DEFAULT_CAPACITY];
    }
    public MyArrayListV4(int capacity) {
        elementData = new Object[capacity];
    }

    public int size(){
        return size;
    }


    public void add(E o) {
        //코드 추가
        if(size == elementData.length){
            grow();
        }
        elementData[size] = o;
        size++;
    }

    //코드 추가
    public void add(int index, Object o) {
        if(size == elementData.length){
            grow();
        }
        //데이터 이동
        shiftRightFrom(index);
        elementData[index] = o;
        size++;
    }

    private void shiftRightFrom(int index) {
        for(int i = size; i>index; i--){
            elementData[i] = elementData[i-1];
        }
    }

    //코드 추가
    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;
        //배열을 새로 만들고, 기존 배열을 새로운 배열에 복사
//        Object[] newArr = new Object[newCapacity];
//        for(int i = 0; i < elementData.length; i++){
//            newArr[i] = elementData[i];
//        }
        elementData = Arrays.copyOf(elementData, newCapacity);
    }
    @SuppressWarnings("unchecked")
    public E getIndex(int index) {
        return (E)elementData[index];
    }

    public E set(int index, E element) {
        E oldValue = getIndex(index);
        elementData[index] = element;
        return oldValue;
    }

    public E remove(int index) {
        E oldValue = getIndex(index);
        shiftLeftFrom(index);
        size--;
        elementData[size] = null;
        return oldValue;
    }

    private void shiftLeftFrom(int index) {
        for(int i = index; i< size -1; i++){
            elementData[i] = elementData[i+1];
        }
    }

    public int indexOf(E o) {
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
