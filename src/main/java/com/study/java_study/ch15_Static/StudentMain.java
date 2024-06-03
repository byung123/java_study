package com.study.java_study.ch15_Static;

/*
    싱글론 디자인 패턴
    1. 객체를 유일하게 하나만 생성하여 사용하는 기법
    2. 생성자가 private으로 외부에서는 생성할 수 없다.
    3. 외부에서 생성되지 않게 private로 막아야한다
    4. static 메소드를 하나 만들어야 한다.(자기 자신 = 같은 주소)를 할당 받기 위해
 */

public class StudentMain {
    public static void main(String[] args) {
        StudentService studentService = StudentService.getInstance();
        StudentService studentService2 = StudentService.getInstance();

        studentService.addStudent();
        StudentRepository.getInstance().add("손병태");
        studentService2.addStudent();

        studentService.getStudentData();


    }
}
