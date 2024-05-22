package com.study.java_study.ch03_함수;

public class FunctionMain03 {
    public static void main(String[] args) {
        Function03 fx  = new Function03();

        fx.fx01(1234, "손경태", 29, "010-1111-2222");   //전화번호는 0으로 시작하기 때문에 문자열로 한다

        Student student = new Student();
        student.studentCode = 1234;
        student.name = "손경태";
        student.age = 29;
        student.phone = "010-1111-2222";

        fx.fx02(student);
    }
}
