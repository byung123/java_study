package com.study.java_study.ch18_빌더;

import lombok.Builder;

@Builder // 롬북의 Builder를 만들어 놓으면 앞에서 했던 DataEntity 클래스의 빌더 코드를 입력할 필요 없음.
public class DataEntity2 {
    private String data1;
    private int data2;
    private double data3;
    private String data4;

    DataEntity dataEntity = DataEntity.builder()
            .data2(10)
            .data1("a")
            .data4("b")
            .build();

    DataEntity2 dataEntity2 = DataEntity2.builder()  // 롬북 빌더를 사용해서 바로 만들기
            .data2(10)
            .data1("a")
            .data4("b")
            .data3(3.14)
            .build();
}
