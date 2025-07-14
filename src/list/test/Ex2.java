package list.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n개의 정수를 입력하세요. (종료 0)");
        int num = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        while ((num = sc.nextInt()) != 0) {
            list.add(num);
        }
        System.out.println("출력");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}
