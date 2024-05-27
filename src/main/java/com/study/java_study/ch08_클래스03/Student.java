package com.study.java_study.ch08_클래스03;

public class Student {
    private int code;
    private String name;
    private int age;

    public Student() {} // 기본 생성자    // Alt + insert Constructor에서 아무것도 선택안하면 됨

    public Student(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public Student(int code, String name, int age) {
        this.code = code;
        this.name = name;
        this.age = age;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
