package com.study.java_study.ch01_변수와_자료형;

public class TypeStudy {
    public static void main(String[] args) {
        // [ 일반 자료형 ]
        // 1. 논리 자료형
        boolean a = false;
        boolean b = true;

        // 2. 숫지(정수)
        int c = 1000;
        long d = 1000000000000L; // long은 뒤에 L을 붙여야 함 (literal 때문)
                                 // literal = 이미 정해져 있는 값 -> 정수만 정해져 있기 때문에(정수 주소(고정값)를 반환함)
                                 // long 변환시 뒤에 L을 붙임으로서 literal이 아닌 long 값으로 보라는 뜻으로 붙여줘야 한다
                                 // 실수도 정해져 있기 때문에 형변환 시 뒤에 F를 붙여야 한다
        
        // 3. 숫자(실수)
        double e = 3.14;

        // 4. 문자
        char f = '가'; // 문자는 한 글자만 가능해서 작은 따옴표를 사용 -> 두 자이상(문자열) 부터는 큰 따옴표
                       // 가 는 아스키코드 값으로 AC00 이다.

        // 5. 문자열
        String g = "가나"; // 첫글자가 대문자로 선언

        // 형변환하기
        System.out.println(f);      // 값 자체가 나옴
        System.out.println((int)f); // 44032가 나옴 = '가'의 아스키코드 값(AC00) (형변환)
        System.out.println((int)f + 1); // 44033
        System.out.println((char)((int)f + 1)); // 44033의 값인 '각' 출력

        System.out.println();
        // 형변환
        // 문자 -> 정수 -> 실수(소수점 날아감)

        double num = 3.14;
        System.out.println(num);
//      int num2 = num;  -> 오류 발생
        int num2 = (int)num; // 3 출력 -> 데이터 손실이 발생하기 때문에 명시적으로 선언 해줘야함 (명시적 형변환 = 다운 캐스팅)
        System.out.println(num2);
        double num3 = num2;
        System.out.println(num3); // 오류 발생x -> 명시하지 않아도 됨 (묵시적 형변환 = 업 캐스팅)

        
    }
}
