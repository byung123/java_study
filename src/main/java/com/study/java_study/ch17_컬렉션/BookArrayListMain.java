package com.study.java_study.ch17_컬렉션;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookArrayListMain {
    public static void main(String[] args) {

        // 퀴즈
        // 프로그램시작
        // 도서명 : 도서1
        // 저자명 : 저자1
        // new Book("도서1", "저자1")
        // BookList에 추가

        // 도서명 : 도서2
        // 저자명 : 저자2
        // new Book("도서2", "저자2")
        // BookList에 추가

        // 도서명 : 도서3
        // 저자명 : 저자3
        // new Book("도서3", "저자3")
        // BookList에 추가

        // 도서 전체 조회 (toString() 쓰지 말라는 뜻, 반복문으로 해라)
        // 도서명 >> 도서1 - 3
        // 저자명 >> 저자1 - 3

        // 삭제할 도서명 : 도서2

        // 도서 전체 조회
        // 도서명 >> 도서1, 3
        // 저자명 >> 저자1, 3

        Scanner scanner = new Scanner(System.in);
//        ArrayList<String> bookList = new ArrayList<>();
//        Boolean isRun = true;
//
//
//        System.out.println("프로그램 시작");
//        while(isRun) {
//            System.out.println("[ 메뉴 선택 ]");
//            System.out.println("1. 도서 추가");
//            System.out.println("2. 도서 삭제");
//            System.out.println("3. 도서 전체 조회");
//            System.out.println("4. 프로그램 종료");
//            int select = scanner.nextInt();
//            scanner.nextLine();
//            switch(select) {
//                case 1 :
//                    System.out.println("도서를 추가합니다");
//                    System.out.println("도서명 : ");
//
//                    break;
//                case 2 :
//                    break;
//                case 3 :
//                    break;
//                case 4 :
//
//            }
//        }

        List<Book> bookList = new ArrayList<>();
        for(int i = 0; i < 3; i++) {
            String bookName;
            String author;
            System.out.println("도서명 : ");
            bookName = scanner.nextLine();
            System.out.println("저자명 : ");
            author = scanner.nextLine();

            bookList.add(new Book(bookName, author));
        }

        for(Book book : bookList) {
            System.out.println("도서명 : " + book.getBookName());
            System.out.println("저자명 : " + book.getAuthor());
        }

        System.out.println("삭제할 도서명 : ");
        String removeBookName = scanner.nextLine();
        for(Book book : bookList) {
            if(book.getBookName().equals(removeBookName)) {
                bookList.remove(book);
                break;             // 리스트 크기가 줄어들면서 새로운 리스트 주소를 할당 받기 때문에 break 꼭 필요함
            }
        }

        for(int i = 0; i < bookList.size(); i++) {
            if(bookList.get(i).getBookName().equals(removeBookName)) {
                Book removeBook = bookList.remove(i);
                System.out.println("삭제된 도서 정보 : " + removeBook);
                break;
            }
        }

        for(int i = 0; i < bookList.size(); i++) {
            System.out.println("도서명 : " + bookList.get(i).getBookName());
            System.out.println("저자명 : " + bookList.get(i).getAuthor());
        }
    }
}
