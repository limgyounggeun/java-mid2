package map.test;

import java.util.HashMap;
import java.util.Map;

public class ArrayToMapTest {
    public static void main(String[] args) {
        String[][] produtArr = {{"Java", "10000"},{"Spring", "20000"}, {"Jpa", "30000"}};

        Map<String, Integer> produtMap = new HashMap<String, Integer>();
        for (int i = 0; i < produtArr.length; i++) {
            produtMap.put(produtArr[i][0], Integer.parseInt(produtArr[i][1]));
        }
        for (String key : produtMap.keySet()) {
            System.out.println("key = " + key + ", value = " + produtMap.get(key));
        }
    }
}
