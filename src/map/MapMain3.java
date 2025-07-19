package map;

import java.util.HashMap;
import java.util.Map;

public class MapMain3 {
    public static void main(String[] args) {
        Map<String, Integer> sMap = new HashMap<String, Integer>();

        //학생 성적 데이터 추가
        sMap.put("a", 50);
        System.out.println(sMap);

        //학생이 없는 경우에만 데이터 추가
        if(!sMap.containsKey("a")){
            sMap.put("a", 100);
        }

        //학생이 없는 경우에만 데이터 추가 2
        sMap.putIfAbsent("a", 100);
        sMap.putIfAbsent("b", 100);
        System.out.println(sMap);
    }
}
