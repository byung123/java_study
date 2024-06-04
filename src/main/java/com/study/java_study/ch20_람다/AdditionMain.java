package com.study.java_study.ch20_람다;

public class AdditionMain {
    public static void main(String[] args) {

        Addition addition = new Addition() {
            @Override
            public int add(int x, int y) {
                return x + y;
            }
        };

        int result = addition.add(10, 20);
        System.out.println("결과 " + result);

        System.out.println();

        // 위의 익명 클래스 것을 람다식으로 변경 = 위에 것과 같은 코드 -> 메소드를 재정의 하는 부분을 확 줄여줄 수 있음
        Addition addition2 = (x, y) -> x + y;
        result = addition2.add(10, 20);
        System.out.println("결과 " + result);

    }
}
