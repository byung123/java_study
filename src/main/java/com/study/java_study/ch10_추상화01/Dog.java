package com.study.java_study.ch10_추상화01;

public class Dog extends Animal{  // Animal에서 Dog로 확장
    private String breed;         // 공통된 name, age를 Animal 클래스로 빼고 Animal 클래스를 상속받음

    public Dog() {
        super();         // 이것이 생략되어 있음, super 뜻 : 내 상위 클래스의 주소
                         // super() : 부모객체(Animal) 생성자 호출 (맨 위에 있어야 함)
                         // 부모가 먼저 생성돼야 자식의 객체를 생성할 수 있기 때문에 맨 위에 둬야 한다
        System.out.println("강아지 객체 생성");
    }

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override               // ctrl + o : 누르면 오버라이드할 메소드를 선택해서 자동으로 만들수 있다.
    public void move() {
        System.out.println("강아지가 네 발로 움직입니다.");
    }

    public void bark() {
        System.out.println(breed + "종의 강아지가 짖습니다.");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed=" + breed +
                "} ";
    }
}
