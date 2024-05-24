package com.study.java_study.ch05_입력;

import java.util.Scanner;

public class 입력02 {
    public static void main(String[] args) {
        String name = null;
        int age = 0;
        String address = null;
        String gender = null;
        String phone = null;

        /*     문제    - 모르겠음
         이름 : 손경태              // next()
         나이 : 29                 // nextInt()
         주소 : 부산 수영구 무학로   // nextLine()
         성별 : 남                 // next()
         연락처 : 010-1111-2222    // nextLine()
         */

        Scanner scanner = new Scanner(System.in);

//        System.out.print("이름 : ");
//        String a = scanner.next();
//
//        System.out.print("나이 : ");
//        int b = scanner.nextInt();
//
//        System.out.println(scanner.nextLine());
//        System.out.print("주소 : ");
//        String c = scanner.nextLine();
//
//        System.out.println("성별 : ");
//        String d = scanner.next();
//
//        System.out.print("연락처 : ");
//        String e = scanner.nextLine();
//
//        System.out.print("이름 : " + a);
//        System.out.println("나이 : " + b);
//        System.out.println("주소 : " + c);
//        System.out.println("성별 : " + d);
//        System.out.println("연락처 : " + e);


        // 답
        System.out.print("이름 : ");              // 위에서 한 번 선언 해줬기 때문에 또 선언하면 안된다
        name = scanner.next();

        System.out.print("나이 : ");
        age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("주소 : ");
        address = scanner.nextLine();

        System.out.print("성별 : ");
        gender = scanner.next();
        scanner.nextLine();

        System.out.print("연락처 : ");
        phone = scanner.nextLine();

        System.out.println();

        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("주소 : " + address);
        System.out.println("성별 : " + gender);
        System.out.println("연락처 : " + phone);

    }
}
