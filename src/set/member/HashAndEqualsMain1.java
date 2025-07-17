package set.member;

import set.MyHashSetV2;

public class HashAndEqualsMain1 {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        MemberNoHashNoEq m1 = new MemberNoHashNoEq("A");
        MemberNoHashNoEq m2 = new MemberNoHashNoEq("A");
        System.out.println(m1.hashCode());
        System.out.println(m2.hashCode());
        System.out.println("m1.equals(m2) : " + set.equals(m1));

        set.add(m1);
        set.add(m2);
        System.out.println(set);

        boolean contains = set.contains(new MemberNoHashNoEq("A"));
        System.out.println("contains = " + contains);
    }
}
