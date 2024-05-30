package com.study.java_study.ch12_추상화03;

public abstract class AbstractAuthority implements Authority{ // 인터페이스를 상속받을때는 implements를 사용하지만,
                                                              // 인터페이스 끼리 상속 받을 때는 extends를 쓴다
    public AbstractAuthority() {
        role = DEFAULT_ROLE;
    }

    private String role;

    public AbstractAuthority(String role) {
        this.role = role;
    }

    @Override // ctrl + o, 또는 ctrl + i(인터페이스만 뜸)
    public String getAuthority() {
        return "";
    }
}
