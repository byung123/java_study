package com.study.java_study.ch10_추상화01;

public class Tiger extends Animal{   // Animal에서 Tiger로 확장했다
    private int power;

    public Tiger() {
        super();         // 이것이 생략되어 있음, super 뜻 : 내 상위 클래스의 주소
                         // super() : 부모객체(Animal) 생성자 호출
        System.out.println("호랑이 객체 생성");
    }

    public Tiger(String name, int age, int power) {
        super(name, age);
        this.power = power;
    }

    // 재정의 -> 상속관계에서만 가능 (Animal에 move() 함수를 다시 재정의 즉, 오버라이딩을 한다)
    @Override // 이것을 달아줘야함. @를 어노테이션(Annotation)이라고 한다. 재정의할 때는 딱히 기능은 없다.(다른 데선 기능 있음)
    public void move() {
        System.out.println("호랑이가 네 발로 뛰어갑니다");
        super.move();   // 부모가 가지고 있는 move() 메소드도 함께 출력하고 싶을 때 입력
    }

    public void hunt() {
        System.out.println("호랑이가 " + power + "의 힘으로 사냥을 합니다.");
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "power=" + power +
                "} " + super.toString();
    }
}
