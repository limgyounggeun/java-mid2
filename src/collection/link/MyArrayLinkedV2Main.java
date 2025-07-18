package collection.link;


public class MyArrayLinkedV2Main {
    public static void main(String[] args) {
        System.out.println("== 데이터 생성 ==");
        MyLinkedListV2 list = new MyLinkedListV2();
        System.out.println("== 데이터 추가 ==");
        //마지막에 추가 O(n)
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        System.out.println("첫 번째 항목에 추가");
        //첫 번째 항목에 추가, 삭제
        list.add(0, "d"); //O(1)
        System.out.println(list);

        System.out.println("첫 번째 항목에 삭제");
        list.remove(0);
        System.out.println(list); //O(1)

        //중간 항목에 추가, 삭제
        System.out.println("중간 항목에 추가");
        list.add(1,"e"); // O(n)
        System.out.println(list);

        System.out.println("중간 항목에 삭제");
        list.remove(1); //O(n)
        System.out.println(list);
    }
}
