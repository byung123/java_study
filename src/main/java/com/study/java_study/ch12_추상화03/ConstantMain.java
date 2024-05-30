package com.study.java_study.ch12_추상화03;

public class ConstantMain {
    public static void main(String[] args) {
        /*
            상수
            1. 선언과 초기화를 잘 구분해야한다.
            2. 선언 이후에 한 번이라도 초기화가 되면 그 다음부터는 다른 값으로 변경할 수 없다.
            3. 상수는 가능한 대분자로 표긴한다.
            4. 모든 상수명이 대문자이기 때문에 스네이크 표기법을 사용한다
         */

        int a = 10;
        a = 20;
        final int b = 30; // 앞에 final을 붙이면 고정 상수가 된다
//        b = 40            // 오류가 뜬다
        final int B;
        B = 30;           // 앞에서 선언만 한 경우 대입 가능하다
//        B = 40;           // 하지만, 한 번 초기화이후엔 다시 값을 바꿀 수 없다
    }
}
