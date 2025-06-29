package collection.array;

public class MyArrayListV3Main {
    public static void main(String[] args) {
        System.out.println("== 데이터 생성 ==");
        MyArrayListV3 list = new MyArrayListV3();
        System.out.println("== 데이터 추가 ==");
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);
        System.out.println("== 원하는 위치에 추가==");
        list.add(3, "addList");
        System.out.println(list);
        list.add(0, "addFirst");
        System.out.println("== 삭제 ==");
        Object removed1 = list.remove(4);
        System.out.println("removed(4) = " + removed1);
        System.out.println(list);

        Object removed2 = list.remove(0);
        System.out.println("removed(0) = " + removed2);
        System.out.println(list);

    }
}
