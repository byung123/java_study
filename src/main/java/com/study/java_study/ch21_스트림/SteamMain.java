package com.study.java_study.ch21_스트림;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SteamMain {
    public static void main(String[] args) {

        // 스트림
        /*
            생성(사용) 절차
            1. 배열 생성 -> 스트림으로 변환
            2. List 생성 -> 스트림으로 변환
            3. generate 메소드 -> 스트림 생성
            4. 범위 지정 -> 스트림 생성
            5. 빌더 -> 스트림 생성

            중간(가공) 절차
            1. map(Function 인터페이스)
            2. filter(Predicate 인터페이스)
            3. sorted(Comparator)

            최종(결과) 절차
            1. collect -> stream을 List로 변환
            2. 반복자 -> forEach
        */

        // 배열 생성으로 스트림 생성 ( 배열형을 스트림형으로 바꿈 )
        Stream<Integer> st1 = Arrays.stream(new Integer[] {1,2,3,4,5}); // 스트림 생성
        // peek는 스트림이 실행될때 중간중간 결과를 확인할 때 사용
        List<Integer> numberList = st1.map(n -> n * 2) //가공 // 스트림에 있는 원소값에 2를 곱해서 새로운 스트림에 넣음
                .peek(n -> System.out.println(n)) // 가공(기타 스트림 메소드) // 중간중간 값 확인 용도(없어도 됨)
                .collect(Collectors.toList()); // 최종 // 결과로 나온 스트림형을 리스트형으로 바꿔버림

        numberList.forEach(n -> System.out.println("n : " + n));
        System.out.println();

        List<Integer> filterintNumberList = numberList.stream()
                .map(n -> n / 2)
                .filter(n -> n % 2 == 0) // 해당 스트림에서 조건에 해당되는 것만 선택
                .collect(Collectors.toList()); // 선택된 요소를 골라 리스트로 만듦

        System.out.println(filterintNumberList);
        System.out.println();

        List<Integer> sortedNumberList = numberList.stream()
                .sorted((o1, o2) -> o2 - o1) // 원래 있던 요소를 내림차순으로 바꿔서 정렬
                .collect(Collectors.toList());
        System.out.println(sortedNumberList);
        System.out.println();

        // 빌더를 통해서 스트림 만들기
        Stream<String> nameStream = Stream.<String>builder()
                .add("손경태")
                .add("최단비")
                .add("김지현")
                .add("정령우")
                .add("이성민")
                .build();

//        nameStream.forEach(name -> System.out.println(name)); // 넣은 순서대로 나옴
//        nameStream.sorted().forEach(name -> System.out.println(name)); // 정렬돼서 나옴(오름)
        nameStream.sorted((o1, o2) -> String.CASE_INSENSITIVE_ORDER.compare(o2, o1))   // 역정렬돼서 나옴
                .forEach(name -> System.out.println(name));
        System.out.println();

        List<Phone> phoneList = List.of(
                Phone.builder().number(1).model("아이폰").build(),
                Phone.builder().number(2).model("갤럭시").build(),
                Phone.builder().number(3).model("샤오미").build()
        );

        phoneList.stream()
                .map(phone -> Phone.builder() // 새로운 객체 생성
                    .number(phone.getNumber() * 2)
                    .model(phone.getModel())
                    .build())
                .forEach(phone -> System.out.println(phone));
        System.out.println();

        phoneList.stream()
                .filter(phone -> phone.getNumber() % 2 != 0)
                .forEach(phone -> System.out.println(phone));
        System.out.println();

        phoneList.stream()
                .sorted((o1, o2) -> o2.getNumber() - o1.getNumber()) // Number을 기준으로 역정렬
                .forEach(phone -> System.out.println(phone));
        System.out.println();

        phoneList.stream()                 // model 기준으로 오름차순 정렬
                .sorted((o1, o2) -> String.CASE_INSENSITIVE_ORDER.compare(o1.getModel(), o2.getModel()))
                .forEach(phone -> System.out.println(phone));
        System.out.println();

        phoneList.stream()
                .sorted((o1, o2) -> String.CASE_INSENSITIVE_ORDER.compare(o1.getModel(), o2.getModel()))
                .forEach(System.out :: println);  // 바로 위와 결과가 같음 -> 자동으로 해줌
    }
}
