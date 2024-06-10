package com.study.java_study.ch20_람다;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaInterface2 {
    public static void main(String[] args) {

        // Lambdainterface에서 실습했던 것 혼자서 해보기
        Runnable run = new Runnable() {
            @Override
            public void run() {
                System.out.println("프로그램 실행");
                System.out.println("프로그램 종료");
            }
        };

        Runnable run2 = () -> {
            System.out.println("프로그램 실행");
            System.out.println("프로그램 종료");
        };

        run.run();
        run2.run();
        System.out.println();

        Function<String, Integer> fx = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        };

        Function<String, Integer> fx2 = s -> Integer.parseInt(s);

        int num = fx.apply("10");
        System.out.println("num : " + num);

        int num2 = fx2.andThen(result -> result + 100).apply("10");
        System.out.println("num2 : " + num2);
        System.out.println();

        Consumer<String> cus = new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.println(o + "님 안녕하세요");
            }
        };

        Consumer<String> cus2 = s -> System.out.println(s + "님 안녕하세요");

        cus.accept("김준일");
        cus2.accept("김준이");
        System.out.println();

        Supplier<Integer> sup = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return num + 1000;
            }
        };

        Supplier<Integer> sup2 = () -> num + 500;

        System.out.println(sup.get());
        System.out.println(sup2.get());
        System.out.println();

        Predicate<Integer> even = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        };

        Predicate<Integer> even2 = integer -> integer % 2 == 0;

        System.out.println(even.test(10));
        System.out.println(even2.test(10));
        System.out.println(even.test(11));
        System.out.println(even2.test(11));
    }
}
