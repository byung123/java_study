package com.study.java_study.ch17_컬렉션;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
// Data Transfer Object - 레이어에서 레이어로, 서버에서 클라이언트로 데이터를 전송하는 것
// 데이터 전송 객체
public class BookRequestDto {
    private int status;
    private String message;
    private List<BookEntity> bookEntities;
}
