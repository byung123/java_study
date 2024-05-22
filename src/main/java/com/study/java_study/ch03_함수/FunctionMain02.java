package com.study.java_study.ch03_함수;

public class FunctionMain02 {
    public static void main(String[] args) {
        Function02 fx = new Function02();

        fx.fx01();         // 호출한다라고 함

        System.out.println();

        fx.fx02(10, 20);
        fx.fx02(100, 200);

        System.out.println();

        System.out.println(fx.빙수만들기("딸기", 10));
        String 빙수 = fx.빙수만들기("초코", 3);
        System.out.println(빙수);
    }
}
