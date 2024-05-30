package com.study.java_study.ch10_추상화01;

public class Animal {         // Animal은 Dog와 Tiger를 추상했다
    private String name;      // Tiger와 Dog에 동시에 있는 name, age를 작성
    private int age;

    public Animal() {
        System.out.println("동물 객체 생성");
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void move() {
        System.out.println("동물이 움직입니다");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
