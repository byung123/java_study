package com.study.java_study.ch07_클래스02;

public class StudyMain {
    public static void main(String[] args) {
        StudyA a = new StudyA(100,1000);
        System.out.println(a);    // @뒤에 있는 것이 주소값
        System.out.println(a.num);
        System.out.println(a.num2);

        System.out.println();

        StudyB b = new StudyB();
        b.show();
    }
}
