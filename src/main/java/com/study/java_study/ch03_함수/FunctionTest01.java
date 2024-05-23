package com.study.java_study.ch03_함수;

public class FunctionTest01 {

    int fx01_1() {
        return 10;
    }

    int fx01_2() {
        return 20;
    }

    void printResult() {
        FunctionTest02 functionTest02 = new FunctionTest02();
        System.out.println(functionTest02.getAddData(fx01_1(),fx01_2()));
    }                          // 같은 클래스 안(같은 주소)에 있기 떄문에 fx01_1, 02는 따로 참조를 안해도 된다.

}
