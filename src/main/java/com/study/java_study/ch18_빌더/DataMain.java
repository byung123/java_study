package com.study.java_study.ch18_빌더;

public class DataMain {
    public static void main(String[] args) {
        Data data = new Data("a", 10, 10.5, "b");
//        Data data2 = new Data("a", 0, 10.5, null); // 데이터 1과 3만 값을 넣고 싶을 때
        Data data2 = new Data(); // NoArgsConstructor로 데이터 1과 3에만 데이터 넣는 방법
        data2.setData1("a");
        data2.setData3(3.14);

        // 원하는 곳에만 데이터를 입력하는 방법 - 빌더를 이용
        // 전부 this(주소)가 같은 주소값만 출력하므로 data1,2,4() 메소드의 순서는 바껴도 상관 없다.
        DataEntity dataEntity = DataEntity.builder()
                .data1("a")
                .data2(10)
                .data4("b")
                .build();
    }
}
