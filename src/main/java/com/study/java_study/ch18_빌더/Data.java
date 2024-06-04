package com.study.java_study.ch18_빌더;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
public class Data {

    private String data1;
    private int data2;
    private double data3;
    private String data4;

//    public Data(String data1) { // 밑에 data4 생성자와 겹침
//        this.data1 = data1;
//    }
//
//    public Data(int data2) {
//        this.data2 = data2;
//    }
//
//    public Data(double data3) {
//        this.data3 = data3;
//    }

//    public Data(String data4) { // 오버로딩이 불가능함 (맨 위 data1 생성자와 이름 매개병수가 일치하기 때문ㄴ
//        this.data4 = data4;
//    }


}
