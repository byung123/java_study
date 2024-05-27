package com.study.java_study.ch06_배열;

import java.util.Scanner;

public class BookArrayService {
    public static void main(String[] args) {

        // 문제 : 앞에 했던 ArrayService 혼자서 해보기

        Scanner scanner = new Scanner(System.in);

        boolean isRun = true;
        String[] bookList = new String[0];

        while(isRun) {
            System.out.println("책 관리 프로그램");
            System.out.println("1. 도서 등록");
            System.out.println("2. 도서 수정");
            System.out.println("3. 도서 삭제");
            System.out.println("4. 도서 이름 찾기");
            System.out.println("5. 도서 전체 조회");
            System.out.println("q. 프로그램 종료");

            System.out.print("무엇을 하시 겠습니까?(번호 입력)");
            String select = scanner.nextLine();
            String findName = null;
            String result = null;

            switch (select) {
                case "1" :
                    System.out.println("[도서 등록]");
                    System.out.print("등록할 도서 이름 : ");
                    String[] newBookList = new String[bookList.length + 1];
                    for(int i = 0; i < bookList.length; i++) {
                        newBookList[i] = bookList[i];
                    }
                    newBookList[bookList.length + 1] = scanner.nextLine();
                    bookList = newBookList;
                    System.out.println("도서 등록이 완료되었습니다.");
                    System.out.println();
                    break;
                case "2" :
                    System.out.println("[도서 수정]");
                    System.out.print("수정하고자하는 도서 이름 : ");
                    findName = scanner.nextLine();
                    for(int i = 0; i < bookList.length; i++) {
                        if(bookList[i].equals(findName)) {
                            result = findName;
                            System.out.println("도서가 존재합니다");
                            System.out.print("이름 수정 : ");
                            bookList[i] = scanner.nextLine();
                            System.out.println("수정이 완료되었습니다.");
                            System.out.println();
                            break;
                        }
                    }
                    if(result == null) {
                        System.out.println("검색하신 도서는 존재하지 않습니다.");
                        System.out.println();
                        break;
                    }
                    break;
                case "3" :
                    System.out.println("[도서 삭제]");
                    System.out.print("삭제할 도서 이름 : ");
                    findName = scanner.nextLine();
                    for(int i = 0; i < bookList.length; i++) {
                        if(bookList[i].equals(findName)) {
                            result = findName;
                            System.out.println("해당 도서가 존재합니다");
                            String[] deleteBookList = new String[bookList.length - 1];
                            for(int j = 0; j < i; j++) {
                                deleteBookList[j] = bookList[j];
                            }
                            for(int k = i; k< deleteBookList.length; k++) {
                                deleteBookList[k] = bookList[k + 1];
                            }
                            bookList = deleteBookList;
                            System.out.println("도서 삭제가 완료되었습니다.");
                            System.out.println();
                            break;
                        }
                    }
                    break;
                case "4" :
                    System.out.println("[도서 이름 찾기]");
                    System.out.print("찾을 도서 이름 : ");
                    findName = scanner.nextLine();
                    for(int i = 0; i < bookList.length; i++) {
                        if(bookList[i].equals(findName)) {
                            result = findName;
                            System.out.println("검색한 도서는 " + (i + 1) + "번에 있습니다.");
                            System.out.println();
                        }
                        break;
                    }
                    if(result == null) {
                        System.out.println("찾는 도서는 현재 존재하지 않습니다");
                        System.out.println();
                    }
                    break;
                case "5" :
                    System.out.println("[도서 전체 조회]");
                    for(int i = 0; i < bookList.length; i++) {
                        System.out.println((i + 1) + ". " + bookList[i]);;
                    }
                    System.out.println();
                    break;
                case "q" :
                    System.out.println("프로그램을 종료합니다");
                    isRun = false;
                    break;
                default :
                    System.out.println("잘못 입력하셨습니다");
                    System.out.println();
                    break;
            }

        }


    }
}
