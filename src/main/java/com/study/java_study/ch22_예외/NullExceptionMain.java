package com.study.java_study.ch22_예외;

import java.util.ArrayList;
import java.util.List;

public class NullExceptionMain {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("신성애");
        names.add("김동인");
        names.add("박승주");
        names.add("김준일");

        try {
            names.forEach(name -> System.out.println(name.toString()));
            for(int i = 0; i < 5; i++) {
                System.out.println(names.get(i).toString());
            }
            System.out.println("트라이 마지막 부분");

        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch(Exception e) {  // nullpoint, indexof 보다 상위 예외 Exception
            e.printStackTrace();
        } catch (Throwable e) { // Exception 보다 상위 Exception -> 어떤 예외가 나올지 모르는 경우
            e.printStackTrace(); // 가장 상위를 이용해 예외 업캐스팅을 이용해 예외처리를 할 수 있다
        } finally {
            System.out.println("예외이든 아니든 실행");
        }

        System.out.println("프로그램 종료");
    }
}
