package com.study.java_study.ch02_클래스01;

public class ObjectMain {
    public static void main(String[] args) {
        int a = 10;
        ObjectA objectA1 = new ObjectA();     //ObjectA 의 주소를 100번이라 생각하자
        ObjectA objectA2 = new ObjectA();     //이러면 이것의 주소는 200번지가 된다

        System.out.println(a);
        System.out.println(objectA1);         // 주소가 출력되어 나옴
        System.out.println(objectA2);         // 주소가 출력되어 나옴

        System.out.println();

        objectA1.num = 20;
        objectA2.num = 30;

        System.out.println(objectA1.num);
        System.out.println(objectA2.num);

        System.out.println();

        System.out.println(objectA2.name);    // null이 나옴

    }
}
