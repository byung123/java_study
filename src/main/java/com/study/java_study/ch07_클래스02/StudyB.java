package com.study.java_study.ch07_클래스02;

public class StudyB {

    private String name;   // private - 자기 클래스 안에서는 접근이 가능하지만 외부 클래스에선 접근이 불가능하다
    private int age;

    public StudyB() {}

    public StudyB(String name, int age) {  // 생성자는 public이기 때문에 다른 클래스나 패키지 안에서 StudyB 메소드를
        this.name = name;                  // 사용하더라도 값을 집어 넣을 수 있다.
        this.age = age;
    }

    public void setName(String name) {    // private로 선언된 변수들의 접근뿐만 아니라 값까지 변경하고 싶을 때
        this.name = name;                 // public 메소드를 이용하여 바꿀 수 있다. 단축기 : Alt + insert(getter and setter)
    }

    public String getName() {
        return name;
    }

    public void show() {      //
        System.out.println(name);
        System.out.println(age);
    }
}
