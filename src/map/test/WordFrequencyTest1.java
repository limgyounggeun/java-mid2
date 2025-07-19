package map.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest1 {

    public static void main(String[] args) {

        String text = "orange banana apple apple banana apple";

        Map<String, Integer> map = new HashMap<>();
        String[] s = text.split(" ");
        System.out.println(Arrays.toString(s));
        for (String word : s) {
//            if (map.containsKey(word)) {
//                map.put(word, map.get(word) + 1);
//            }else {
//                map.put(word, 1);
//            }
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
    }
}
