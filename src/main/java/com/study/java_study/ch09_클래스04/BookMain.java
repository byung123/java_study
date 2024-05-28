package com.study.java_study.ch09_클래스04;

public class BookMain {

    public static void main(String[] args) {
        BookService bookService = new BookService();

        System.out.println("프로그램을 실행합니다.");

        while(bookService.run()) {}  // 중괄호 안하면 밑에 것이 계속 실행됨

        System.out.println("프로그램을 종료합니다.");

    }

}
