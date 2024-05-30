package com.study.java_study.ch12_추상화03;

/*
    인터페이스
    1. 일반 클래스와 동일하게 정의할 수 없다. (추상클래스는 동일하게 정의할 수 있다)
    2. 일반 변수(멤버변수)를 정의할 수 없다.
    3. 변수를 못쓰고 무조건 상수만 정의할 수 있다 (2번 내용에 추가)
    4. 일반 메소드(멤버메소드)를 정의하기 위해서는 default 키워드를 사용해야한다
    5. 추상 메소드를 정의할 때 abstract 키워드를 생략할 수 있다.
    6. 인터페이스 안에 정의되어 지는 모든 상수와 메소드들은 public 접근 지정자를 사용한다
 */

public interface Authority {  // 모든건 public으로 지정된다(6번)
    //public static final 이 생략된 상태 (6번)
    String DEFAULT_ROLE = "ROLE_USER"; // 6번에 의해서 public이 생략되어 있음

    // public abstract 생략 (6번)
    String getAuthority();

    // public 생략 (6번)
    // 4번
    default void printAuthority() {
        System.out.println(DEFAULT_ROLE);
    }
}
