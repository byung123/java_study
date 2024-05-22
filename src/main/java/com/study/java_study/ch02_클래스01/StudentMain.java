package com.study.java_study.ch02_클래스01;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student();     //객체를 생성한다라고 함.
        Student student2 = new Student();

        student1.name = "손경태";
        student1.age = 29;
        student2.name = "신선애";
        student2.age = 25;
    }
}
