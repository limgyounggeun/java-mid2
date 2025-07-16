package set;

public class MyHashSetV0Main {
    public static void main(String[] args) {
        MyHashSetV0 set = new MyHashSetV0();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.println(set.toString());

        boolean rs = set.add(4);
        System.out.println("중복 데이터 저장 결과 : " + rs);
        System.out.println(set);
    }
}
