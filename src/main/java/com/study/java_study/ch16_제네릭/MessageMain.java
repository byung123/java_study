package com.study.java_study.ch16_제네릭;

public class MessageMain {
    public static void main(String[] args) {
        // 제네릭 와일드 카드 : 기호 -> ?

        Message<?> m1;          // 어떤 자료형이든 될 수 있는 것 : Object 또는 와일드카드(?) 라고 함
        Message<String> m2 = null;

        m1 = new Message<>("10", "바");
//        String s = m1.getMessage();   // Object 자료를 String으로(다운캐스팅)하려니 안됨
        String s = (String) m1.getMessage();   // 명시적 형 변환 필요(Object -> String)

        // 와일드 카드 제약
        Message<? extends String> m100; // String(자기자신)이거나 String을 상속받은 경우만 쓸 수 있다
        Message<? extends String> m3 = new Message<>("10", "다"); // 하행 (나자신 포함 아래 클래스들 전부 사용 가능)
        Message<? super String> m4 = new Message<>("new Objevt()", 10); // 상행 ( 나자신 포함 상위 클래스들은 다 가능)

//        String s2 = m1.getMessage(); // 다운 캐스팅 필요없음(다운 캐스팅) : 밑에도 다 포함되기 때문

        System.out.println(m3.toString());

    }
}
