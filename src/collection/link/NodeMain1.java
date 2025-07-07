package collection.link;

public class NodeMain1 {
    public static void main(String[] args) {
        // 노드 생성하고 연결하기  A -> B -> C
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        System.out.println("모든 노드 탐색 하기");
        System.out.println("first = " + first);
        System.out.println("first.next = " + first.next.item);
        System.out.println("두번째 노드 위치 : " + first.next);
        System.out.println("first.next.next = " + first.next.next.item);

        System.out.println("모든 노드 탐색하기 ");
        Node x = first;
        while (x != null) {
            System.out.println(x.item);
            x = x.next;
        }

    }
}
