package list.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        List<Integer> list = new ArrayList<Integer>();
        int n= 0;
        while(true){
            n = sc.nextInt();
            if(n == 0){
                break;
            }
            list.add(n);
        }
        int sum = 0;
        for(Integer i : list) {
            sum += i;
        }
        double average = (double) sum / list.size();
        System.out.println( "합계 : " + sum);
        System.out.println("평균 : " + average);
    }
}
