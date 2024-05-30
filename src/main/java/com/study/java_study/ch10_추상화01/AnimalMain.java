package com.study.java_study.ch10_추상화01;

public class AnimalMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Tiger tiger = new Tiger();
        Animal tiger2 = new Tiger(); // Animal(부모) 자료형으로 선언해도 부모 메소드가 아닌 재정의된 메소드가 실행된다.

        dog.move();
        tiger.move();
        tiger2.move();               // Animal(부모) 자료형으로 선언해도 부모 메소드가 아닌 재정의된 메소드가 실행된다.
        ((Tiger)tiger2).hunt();      // 자료형을 바꿔줘야 hunt() 메소드를 사용할 수 있다.
        dog.bark();

        Animal[] animals = new Animal[3];
        animals[0] = new Animal("이름없는 동물", 10);
        animals[1] = new Dog("콩이", 11, "말티즈");
        animals[2] = new Tiger("용이", 5, 100);

        for(Animal animal : animals) {
            animal.move();
        }

        System.out.println();

//        for(Animal animal : animals) {
//            if(animal instanceof Tiger) {  // Tiger 클래스 객체라면, 최신 버전의 자바는 instanceof가 없어졌음
//                Tiger t = (Tiger) animal;
//                t.hunt();
//            } else if(animal instanceof Dog) {
//                Dog d = (Dog) animal;
//                d.bark();
//            }
//        }

        for(Animal animal : animals) {
            if(animal.getClass() ==  Tiger.class) {  // Tiger 클래스 객체라면, 최신 버전의 자바는 instanceof가 없어졌음
                Tiger t = (Tiger) animal;            // 최신 자바는 .getclass()로 사용 - 호환성 때문에 이렇게 쓰는 것이 좋다
                t.hunt();
            } else if(animal.getClass() == Dog.class) {
                Dog d = (Dog) animal;
                d.bark();
            }
        }

    }

}
