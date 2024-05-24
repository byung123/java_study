package com.study.java_study.ch04_제어;

import java.util.Scanner;

public class While02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("개수 : ");
        int count = scanner.nextInt();

        int i = 0;
        while(i < count) {
            if(i % 2 == 0) {
                System.out.println("짝수입니다");
                i++;
                continue;                         // 지금까지만 실행하고 다음 반복으로 넘어가라는 뜻
            }
            System.out.println("홀수입니다");
            i++;
        }

        // 문제 : 위에 것을 for문으로 구현해라.

        System.out.print("개수 : ");
        int count2 = scanner.nextInt();

        for(int j = 0; j < count2; j++) {
            if(j % 2 == 0) {
                System.out.println("짝수입니다.");
                continue;
            }
            System.out.println("홀수입니다");
        }
    }
}
