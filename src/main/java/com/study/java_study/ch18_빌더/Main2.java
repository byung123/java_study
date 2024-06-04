package com.study.java_study.ch18_빌더;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
        List<Integer> numbers2 = new ArrayList<>(numbers.size());

        for(int num : numbers) {  // 원래는 Integer 자료형으로 함
            numbers2.add(num * 2);
        }

        System.out.println(numbers2);
        System.out.println();

        // 위에 코드를 스트림으로 하는 방법 -> 나중에 배움
        List<Integer> numbers3 = numbers.stream().map(n -> n * 2).collect(Collectors.toList());

        System.out.println(numbers);
        System.out.println(numbers2);
        System.out.println(numbers3);
    }
}
