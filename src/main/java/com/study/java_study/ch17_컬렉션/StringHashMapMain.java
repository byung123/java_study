package com.study.java_study.ch17_컬렉션;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringHashMapMain {

    public static void main(String[] args) {
        HashMap<Integer, String> strMap = new HashMap<>();

        strMap.put(10, "김준일");
        strMap.put(11, "김준이");
        strMap.put(12, "김준삼");
        strMap.put(13, "김준사");         // 이렇게 하면 리스트와 용도가 똑같기 때문에 이럴바엔 리스트를 사용하는 것이 낫다.

        System.out.println(strMap);

        System.out.println(strMap.get(0)); // 0번 키의 값 출력  -> 없기 때문에 null출력
        System.out.println(strMap.get(10)); // 10번 키의 값 출력 -> 김준일 출력

        Map<String, String> lang = Map.of(
            "java", "자바",
            "c", "C",
            "python", "파이썬",
            "js", "자바스크립트"
        );

        System.out.println(lang);

        System.out.println(lang.get("java"));

        // Map은 반복문을 돌리기 위해 Entry 객체로 짝을 묶는 개체를 생성 후 이를 Set으로 묶어야 한다.
        Set<Map.Entry<String, String>> entries = lang.entrySet();

        for(Map.Entry<String, String> entry : entries) {
            System.out.println("key : " + entry.getKey());
            System.out.println("value : " + entry.getValue());
        }

    }

}
