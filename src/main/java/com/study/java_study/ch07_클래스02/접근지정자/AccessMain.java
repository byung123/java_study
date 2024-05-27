package com.study.java_study.ch07_클래스02.접근지정자;

import com.study.java_study.ch07_클래스02.StudyB;   // 서로 다른 폴더(패키지) 안에 있는 클래스를 호출하려면 임포트해야한다

/*
    접근지정자
    1. private : 같은 객체(클래스) 안에서만 접근 할 수 있다
    2. public : 모든 영역에서 접근 할 수 있다
    3. default : 같은 패키지 안에서만 접근 할 수 있다
    4. protected : default와 동일하가 같은 패키지 안에서 접근 할 수 있고,
                   상속관계일 때는 다른 패키지에 있어도 접근 할 수 있다
 */

public class AccessMain {
    private String test;

    public void printTest() {
        System.out.println(test);
    }

    public static void main(String[] args) {
        StudyB b = new StudyB();    // 서로 다른 패키지 안에 있어서 위에 import 생김
        b.show();

        System.out.println();

        b.setName("손경태");         // private으로 선언된 변수들의 값을 바꿀 수 있음
        System.out.println(b.getName());

        System.out.println();

        AccessMain accessMain = new AccessMain();
        accessMain.printTest();        // 같은 클래스 안에 있기 때문에 private이여도 사용 할 수 있다
        accessMain.test = "테스트";

    }
}
