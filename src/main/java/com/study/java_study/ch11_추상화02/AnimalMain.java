package com.study.java_study.ch11_추상화02;

public class AnimalMain {
    public static void main(String[] args) {
//        Animal a = new animal(); // 추상클래스는 생성할 수 없기 때문에 생성할 수 없음

        Animal[] animals = new Animal[10]; // 배열은 상관없음

        for(int i = 0; i < animals.length; i++) {
            animals[i] = i % 2 == 0 ? new Dog() : new Tiger();
        }

        for(Animal animal : animals) {
            animal.move();
        }
    }
}
