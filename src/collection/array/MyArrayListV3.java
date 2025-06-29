package collection.array;

import java.util.Arrays;

public class MyArrayListV3 {

    private static final int DEFAULT_CAPACITY = 2  ;

    private Object[] elementData;
    private int size;

    public MyArrayListV3() {
        elementData = new Object[DEFAULT_CAPACITY];
    }
    public MyArrayListV3(int capacity) {
        elementData = new Object[capacity];
    }

    public int size(){
        return size;
    }


    public void add(Object o) {
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

    public Object getIndex(int index) {
        return elementData[index];
    }

    public Object set(int index, Object element) {
        Object oldValue = getIndex(index);
        elementData[index] = element;
        return oldValue;
    }

    public Object remove(int index) {
        Object oldValue = getIndex(index);
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
