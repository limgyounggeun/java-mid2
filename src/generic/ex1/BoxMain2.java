package generic.ex1;

public class BoxMain2 {
    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        Integer integer = (Integer) integerBox.get();
        System.out.println("integer = " +integer);

        ObjectBox StringBox = new ObjectBox();
        StringBox.set("hello");
        String string = (String) StringBox.get();
        System.out.println("string = " +string);

        //잘못된 타입의 인수 전달시
        integerBox.set("문자100");
        Integer rs = (Integer) integerBox.get(); //String ->Integer 캐스팅 예외
        System.out.println("rs = " +rs);

    }
}
