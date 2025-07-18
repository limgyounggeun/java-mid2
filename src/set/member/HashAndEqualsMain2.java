package set.member;

import set.MyHashSetV2;

public class HashAndEqualsMain2 {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        MemberOnlyHash m1 = new MemberOnlyHash("A");
        MemberOnlyHash m2 = new MemberOnlyHash("A");
        System.out.println(m1.hashCode());
        System.out.println(m2.hashCode());
        System.out.println("m1.equals(m2) : " + m1.equals(m2));

        set.add(m1);
        set.add(m2);
        System.out.println(set);

        boolean contains = set.contains(new MemberOnlyHash("A"));
        System.out.println("contains = " + contains);
    }
}
