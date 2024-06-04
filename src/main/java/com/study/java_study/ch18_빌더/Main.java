package com.study.java_study.ch18_빌더;

public class Main {
    public static void main(String[] args) {
        // 내부 클래스 사용
        A a = new A(); // B 클래스를 사용하기 위해선 먼저 A클래스를 생성해줘야 한다
        A.B b = a.new B();

        a.test();
        b.print();

        A.C c = new A.C(); // C 클래스(static)는 A 클래스 객체(a)를 생성하지 않고, 생성할 수 있다.
        c.show();

        A.C.show2();  // 바로 호출 할 수 있다.
    }
}
