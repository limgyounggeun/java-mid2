package set;

public class StringHashMain {

    static final int CAPACITY = 10;
    public static void main(String[] args) {
        char charA = 'A';
        char charB = 'B';
        System.out.println((int) charA);
        System.out.println((int) charB);

        System.out.println("hashCode(\"A\") = " + hashCode("A"));
        System.out.println("hashCode(\"B\") = " + hashCode("B"));
        System.out.println("hashCode(\"AB\") = " + hashCode("AB"));

        int hashIndex = hashIndex(hashCode("A"));
        System.out.println(hashIndex);
    }
    static int hashCode(String str) {
        char[] charArray = str.toCharArray();
        int sum = 0;
        for (int i = 0; i < charArray.length; i++) {
            sum += charArray[i];
        }
        return sum;
    }

    static int hashIndex(int value){
        return value % CAPACITY;
    }
}
