package list.test;

import java.util.ArrayList;

public class Ex1 {
    public static void main(String[] args) {
        ArrayList<Integer> students = new ArrayList<>();
        students.add(90);
        students.add(80);
        students.add(70);
        students.add(60);
        students.add(50);

        int total = 0;
        for(Integer i : students) {
            total += i;
        }
//        for(int i =0; i <students.size(); i++) {
//            total += students.get(i);
//        }
        double average = (double) total / students.size();
        System.out.println("총합 " + total);
        System.out.println("평균 : "+average);
    }
}
