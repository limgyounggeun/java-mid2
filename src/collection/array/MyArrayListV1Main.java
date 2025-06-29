package collection.array;

public class MyArrayListV1Main {
    public static void main(String[] args) {
        System.out.println("== 데이터 생성 ==");
        MyArrayListV1 list = new MyArrayListV1();
        System.out.println(list);
        System.out.println("== 데이터 추가 ==");
        list.add("a");
        System.out.println(list);
        list.add("b");
        System.out.println(list);
        list.add("c");
        System.out.println(list);
        System.out.println("== 기능 사용 ==");
        System.out.println("list.size() = " + list.size());
        System.out.println("list.getIndex() = " + list.getIndex(1));
        System.out.println("list.indexOf(\"c\") = " + list.indexOf("c"));
        System.out.println("list.set(2, \"z\") = " + list.set(2, "z"));
        System.out.println(list);

        System.out.println("== 범위 초과 ==");
        list.add("d");
        System.out.println(list);
        list.add("e");
        System.out.println(list);

        //범위 초과 , capacity 가 늘어나지 않으면 예외 발생
        list.add("f");
        System.out.println(list);
    }
}
