package com.study.java_study.ch04_제어;

public class Gugudan_quiz {
    public static void main(String[] args) {
        /*
        [2단]
        2 X 1 = 2
        2 X 2 = 4
        ...
        2 X 9 =18

        [9단]
        9 X 1 = 9
        ...
        9 X 9 = 81
         */

        for (int i = 2; i < 10; i++) {
            System.out.println("[" + i + "단]");
            for(int j = 1; j < 10; j++) {
                System.out.println(i + " X " + j + " = " + i * j);
            }
            System.out.println();
        }
    }
}
