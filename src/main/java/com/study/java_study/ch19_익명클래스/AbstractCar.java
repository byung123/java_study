package com.study.java_study.ch19_익명클래스;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@AllArgsConstructor
@Data
@Getter
public abstract class AbstractCar {
//    @Getter // model만 getter를 걸고 싶을 때 그 바로 위에 @getter 하면 됨.
    private String model;
    private String color;

    public abstract void createCar();
    public abstract void showCar();

}
