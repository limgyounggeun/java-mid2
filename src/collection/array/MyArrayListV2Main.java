package collection.array;

public class MyArrayListV2Main {
    public static void main(String[] args) {
        System.out.println("== 데이터 생성 ==");
        MyArrayListV2 list = new MyArrayListV2();
        System.out.println(list);
        System.out.println("== 데이터 추가 ==");
        list.add("a");
        System.out.println(list);
        list.add("b");
        System.out.println(list);
        list.add("c");
        System.out.println(list);
        System.out.println("== 범위 초과 ==");
        list.add("d");
        System.out.println(list);
        list.add("e");
        System.out.println(list);
        list.add("f");
        System.out.println(list);
    }
}
