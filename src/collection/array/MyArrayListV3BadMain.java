package collection.array;

public class MyArrayListV3BadMain {
    public static void main(String[] args) {
        MyArrayListV3 numberList = new MyArrayListV3();

        //숫자만 입력 하기를 기대
        numberList.add(1);
        numberList.add(2);
        numberList.add("문자3");
        System.out.println(numberList);

        Integer num1 = (Integer) numberList.getIndex(0);
        Integer num2 = (Integer) numberList.getIndex(1);

        // ClassCaseException 발생
        Integer num3 = (Integer) numberList.getIndex(2);
    }
}
