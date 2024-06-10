package com.study.java_study.ch19_익명클래스;

public class CarMain {
    public static void main(String[] args) {
        KiaCar kiaCar = new KiaCar("k8", "화이트");
        System.out.println(kiaCar);

        // 익명 클래스 - 이름이 없는 클래스, 한 번 사용하고 말 객체 만들 때 사용
        AbstractCar abstractCar = new AbstractCar("내가만든자동차", "블랙") {
            @Override
            public void createCar() {
                System.out.println("한 번 만들어봄");
            }

            @Override
            public void showCar() {
                System.out.println("자동차 정보...");
            }
        };
    }
}
