package map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {
    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<String, String>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("== 단어 입력 ==");
        while(true) {
            System.out.print("영어 단어를 입력하세요 (종료는 'q'):");
            String wordE = scanner.nextLine();

            if(wordE.equals("q")) {
                break;
            }
            System.out.print("한글 뜻을 입력하세요: ");
            String wordK = scanner.nextLine();

            dictionary.put(wordE, wordK);
        }
        System.out.println("== 단어 검색 ==");
        while (true){
            System.out.print("검색할 단어를 입력하세요 (종료는 'q') :");
            String word = scanner.nextLine();
            if(word.equals("q")) {
                break;
            }
           if(dictionary.containsKey(word)) {
               String korean = dictionary.get(word);
               System.out.println(word + " 의 뜻 " + korean);
           }else {
               System.out.println( word + " 는 사전에 없는 단어 입니다.");
           }
        }
    }
}
