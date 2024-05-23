package com.study.java_study.ch03_함수;

public class Function04 {

    void add(int a, int b) {
        System.out.println(a + b);
    }

//    void add(int a, int b) {          // 메소드 이름이 같고, 매개변수 까지 같으면 오류가 뜸
//        System.out.println(a + b);
//    }

    void add(int a, int b, int c) {
        System.out.println(a+ b+ c);
    }

    void add(int a, String b) {         // 함수의 이름이 같아도 오류가 표시 되지 않는다. (매개변수가 다름)
        int c = Integer.parseInt(b);
        System.out.println(a + c);
    }
}
