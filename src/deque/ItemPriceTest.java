package deque;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ItemPriceTest {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("사과",500, "바나나",500, "망고", 1000, "딸기", 1000 );

        ArrayList<String> list = new ArrayList<>();
        for (String word : map.keySet()) {
            if(map.get(word) >= 1000) {
                list.add(word);
            }
        }
        for(String word : list) {
            System.out.println("상품명 : " + word+" 가격 : " +map.get(word));
        }
    }
}
