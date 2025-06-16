package generic.ex1;

public class RowTypeMain {
    public static void main(String[] args) {
        //GenericBox integerBox = new GenericBox();
        GenericBox<Object> integer = new GenericBox<>();// 권장
        integer.set(10);
        Integer result = (Integer) integer.get();
        System.out.println("result = " +result);
    }
}
