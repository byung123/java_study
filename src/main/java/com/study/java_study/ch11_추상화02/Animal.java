package com.study.java_study.ch11_추상화02;

public abstract class Animal { // abstract가 하나라도 있으면 클래스에도 abstract도 해줘야 한다.

    /*
        추상클래스
        1. 클래스에 추상 메소드가 하나라도 정의되어 있으면 추상클래스로 정의해야한다
        2. 추상클래스는 생성할 수 없다
        3. 일반 클래스와 정의할 수 있는 멤버변수, 멤버메소드는 동일하다
        4. 추상클래스라고 해서 무조건 추상 메소드를 가지고 있어야하는 것은 아니다(1번의 역)
        5. 추상클래스를 상속받은 클래스는 추상메소드를 모두 구현하거나 해당 클래스도 추상클래스로 정의해야한다.
     */

    private String name;

    public abstract void move();  // 어짜피 다른 Dog나 Tiger 클래스에서 오버라이딩 할거기 때문에 그냥 틀만 만들어둠

    public void eat() {
        System.out.println("종물이 밥을 먹습니다.");
    }

}
