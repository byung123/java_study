package com.study.java_study.ch12_추상화03;

public class AuthorityMain {
    public static void main(String[] args) {
        System.out.println(Authority.DEFAULT_ROLE);
//        Authority.DEFAULT_ROLE = "aaaa";  // 상수라 값이 안바뀌어짐.
    }
}
