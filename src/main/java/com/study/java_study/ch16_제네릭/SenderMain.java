package com.study.java_study.ch16_제네릭;

public class SenderMain {

    public static void main(String[] args) {
        // [ Wrapper 자료형 ]
        // Integer                            int
        // Boolean       -----(언박싱)---->    boolean
        // Character     <----(박싱)------     char
        // Double                             double
        // Long                               long
        // Float                              float
        // 제네릭을 사용할 때만큼은 위의 자료형들로만 써야한다.(나머진 사용할 수 없음)

        Integer num = new Integer(10);   // 박싱 : 기본 타입의 데이터를 참조 타입으로 변환하는 과정
        int num2 = num.intValue();       // 언박싱 : 참조 타입의 데이터를 기본타입으로 변환하는 과정

        Integer num3 = 20;               // 자동 박싱 (자바에선 자동으로 박싱 언박싱을 할 수 있음)
        int num4 = num3;                 // 자동 언박싱

        Sender sender1 = new Sender<Integer, String, Double>(10, "test", 4.43);  // int가 아니라 Integer 씀
        Sender<Integer, String, Double> sender2 = new Sender<>(10, "test", 4.43);  // 앞에 쓰면 뒤에는 생략 가능

    }
}
