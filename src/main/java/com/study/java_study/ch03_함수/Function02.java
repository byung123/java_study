package com.study.java_study.ch03_함수;

public class Function02 {

    // 매개변수 x, return x
    void fx01() {
        System.out.println("fx01 함수 호출");
    }

    //매개변수 o, return x                      // Main 함수에서 받아오는 매개변수를 쓰는 경우
    void fx02(int num1, int num2) {            // int num1, num2 선언
        System.out.println("fx02 함수 호출");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }

    String 빙수만들기(String 재료, int count) {
        return 재료 + "빙수: " + count + "개";
    }

}
