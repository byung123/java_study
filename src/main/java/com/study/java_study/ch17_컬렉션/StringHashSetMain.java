package com.study.java_study.ch17_컬렉션;

import java.util.*;

public class StringHashSetMain {
    public static void main(String[] args) {

        HashSet<String> strSet = new HashSet<>();

        // 추가
        strSet.add("김준일");
        strSet.add("김준이");
        strSet.add("김준삼");
        strSet.add("김준사");

        System.out.println(strSet);  // Hash 값에 의해서 정렬된 채로 들어가짐

        for(String name : strSet) { // set은 순서가 없기 때문에 인덱스를 이용한 반복문을 사용하면 안된다. for each 반복문 사용
            System.out.println(Objects.hash(name));
        }

        strSet.addAll(List.of("김준일", "김준이", "김준일"));   // set은 중복이 안되기 때문에 addAll로 추가해도 같은 값들이 추가되지 않는다

        ArrayList<String> strList = new ArrayList<>();
        strList.addAll(strSet);
        System.out.println(strList);       // 아무것도 추가가 되지 않은것을 확인할 수 있다

        System.out.println();

        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return String.CASE_INSENSITIVE_ORDER.compare(o1, o2);
            }
        };

        strList.sort(stringComparator);

        strList.sort((o1, o2) -> String.CASE_INSENSITIVE_ORDER.compare(o1, o2)); // 바로 위 코드를 줄인 형태
        System.out.println(strList);



    }
}
