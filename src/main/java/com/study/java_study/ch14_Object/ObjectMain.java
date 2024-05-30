package com.study.java_study.ch14_Object;

/*
    Object 클래스 (최상위 클래스)

 */

import java.util.Objects;

public class ObjectMain {
    public static void main(String[] args) {
        Object object = new Object();
        Student student = new Student("김준일", 31);
        Student student2 = new Student("김준일", 31);

        Object[] objects = new Object[3];
        objects[0] = new Object();
        objects[1] = "test";
        objects[2] = new Student("김준일", 31);    // 최상위 클래스이기 때문에 어떤 클래스의 객체를 받아도 업캐스팅 할 수 있다

        System.out.println(student.toString());
        System.out.println(student);             // 변수명만 입력해도 toString()이 자동으로 호출되어 출력된다

        System.out.println();

        String str = "데이터";
        System.out.println(str);
        System.out.println(str.toString());

        System.out.println();

        String studentData = student.toString(); // 하지만 자료형이 달라서 대입을 하려면 뒤에 toString()을 기입해야한다

        System.out.println(student.equals(student2));

        System.out.println(student.hashCode());
        System.out.println(student2.hashCode());

        System.out.println(student.hashCode() == student2.hashCode());
        System.out.println(Objects.hash(10));
        System.out.println(Objects.hash(10));

    }
}
