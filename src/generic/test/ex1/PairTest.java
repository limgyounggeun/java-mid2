package generic.test.ex1;

public class PairTest {
    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>();
        pair1.setFirst(1);
        pair1.setSeconds("data");
        System.out.println(pair1.getFirst());
        System.out.println(pair1.getSeconds());
        System.out.println("pair1 = "+ pair1);

        Pair<String, String> pair2 = new Pair<>();
        pair2.setFirst("key");
        pair2.setSeconds("value");
        System.out.println(pair2.getFirst());
        System.out.println(pair2.getSeconds());
        System.out.println("pair2 = "+ pair2);
    }
}
