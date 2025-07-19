package map;

import java.util.HashMap;
import java.util.Map;

public class MapMain2 {
    public static void main(String[] args) {
        Map<String, Integer> sMap = new HashMap<String, Integer>();

        //학생 성적 데이터 추가
        sMap.put("a", 90);
        System.out.println(sMap);
        //같은 값 저장시 기존 값 교체
        sMap.put("a", 100);
        System.out.println(sMap);

        boolean a = sMap.containsKey("a");
        System.out.println(a);

        sMap.remove("a");
        System.out.println(sMap);
    }
}
