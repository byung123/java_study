package com.study.java_study.ch17_컬렉션;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StringArrayListMain {
    public static void main(String[] args) {
        String[] strArray = new String[10]; // 배열 지정할 때 형식

        ArrayList<String> strList = new ArrayList<>(); // ArrayList 지정할 때 형식
        strList.add("test1");

        // 배열 <-> 리스트 변환
        List<String> list = Arrays.asList(strArray); //  배열을 리스트로 만드는 방법(그냥 리스트)
//        ArrayList<String> list2 = (ArrayList<>) Arrays.asList(strArray); //  배열을 ArrayList로 만들기
        ArrayList<String> list2 = new ArrayList<>();
        list2.addAll(list);
        String[] strArray2 = strList.toArray(new String[strList.size()]); // 리스트에서 배열로 만드는 방법

        // 리스트 값 조회
        System.out.println(strList);

        //contains 포함 조회
        System.out.println(strList.contains("test1")); // 값이 있는지 확인

        // 리스트 바로 생성
        List<Integer> nums = List.of(1,2,3,4,5);
        System.out.println(nums);

        // 값 제거
//        nums.remove(); // 인덱스를 입력하면 제거한 값을 출력해줌,
                       // 값으로 지우면(입력하면) boolean으로 지워졌다 안지워졌다 결과를 출력해줌
        System.out.println();

        strList.add("김준일");
        strList.add("김준이");
        strList.add("김준삼");
        System.out.println(strList);
        System.out.println(strList.remove("test2"));  // true, false 출력
        strList.remove("test2");
        System.out.println(strList);
        System.out.println(strList.remove(1));  // 지운 값 출력
        System.out.println(strList);

        System.out.println();

        System.out.println(nums);
        List<Integer> num2 = List.of(1,3,5);
        ArrayList<Integer> num3 = new ArrayList<>();
        num3.addAll(nums);
//        System.out.println(num2.removeAll(List.of(1,3,5)));  // 그냥 리스트는 오류가 남
//        System.out.println(num2);
        System.out.println(num3.removeAll(List.of(1,3,5)));
        System.out.println(num3);

        System.out.println();

        // 값을 중간에 삽입하고 싶을 때
        num3.add(1, 3); // add(인덱스번호, 넣을 값)
        System.out.println(num3);

        // 값 수정
        num3.set(1,5); //  set(인덱스 번호, 수정할 값
        System.out.println(num3);

        num3.addAll(List.of(1,2,3));
        System.out.println(num3);

        System.out.println();

        //반복
        for(int i = 0; i < nums.size(); i++) {
            System.out.println(num3.get(i));
        }

        System.out.println();

        for(Integer num : num3) {
            System.out.println(num);
        }

        System.out.println();

        // Iterator로 반복하기
        Iterator<Integer> ir = num3.iterator();
        while(ir.hasNext()) {
            System.out.println(ir.next());
        }

    }
}
