package com.study.java_study.ch04_제어;

public class Star_quiz {
    public static void main(String[] args) {

        /*
        * *
        * **
        * ***
        * ****
        * *****
         */

        for(int i = 1; i < 6; i++) {
            for(int j = 0; j < i; j++)
                System.out.print("*");
            System.out.println();
        }

        System.out.println();

        /*
          *
          * *****
          * ****
          * ***
          * **
          * *
         */

        for(int i = 1; i < 6; i++) {
            for(int j = 0; j < 6 - i; j++)
                System.out.print("*");
            System.out.println();
        }

        /*
          *
          *     *
          *    **
          *   ***
          *  ****
          * *****
         */

        System.out.println();

        for(int i = 0; i < 5; i++) {
            System.out.print(" ".repeat(4-i));
            for(int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        /*
         *
         * *****
         *  ****
         *   ***
         *    **
         *     *
         */

        for(int i = 0; i < 5; i++) {
            System.out.print(" ".repeat(i));
            for(int j = 0; j < 5 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        /*
         *     *
         *    ***
         *   *****
         *  *******
         * *********
         */

        for(int i = 0; i < 5; i++) {
            System.out.print(" ".repeat(4 - i));
            for(int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.print(" ".repeat(4 - i));
            System.out.println();
        }
    }
}
