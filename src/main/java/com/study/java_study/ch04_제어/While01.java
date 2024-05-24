package com.study.java_study.ch04_제어;

import java.util.Random;
import java.util.Scanner;

public class While01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

//        int num = random.nextInt(10);              // Scanner에 있는 nextInt()와 다른 것임(이름만 같음)
                                                   // 0-9까지 중 랜덤

        int num = random.nextInt(10) + 1;          // 1-10까지 중 랜덤

        while(true) {
            System.out.print("입력 : ");
            int data = scanner.nextInt();
            if(num == data) {
                System.out.println("정답은 " + data + "입니다.");
                break;
            }
            System.out.println("틀렸습니다. 다시 입력해 주세요.");
        }

    }
}
