package com.study.java_study.ch09_클래스04;

import java.awt.print.Book;
import java.util.Arrays;
import java.util.Scanner;

public class BookService {

    private Scanner scanner;
    private BookRepository bookRepository;

    public BookService() {
        scanner = new Scanner(System.in);
        bookRepository = new BookRepository();
    }

    private String select2Menu() {                   // 배열일 때 방법
        String[] menus2 = {"1", "2", "3", "4", "5"};
        String selectedMenu2 = null;
        boolean isFind = false;

        while(!isFind) {
            System.out.print("메뉴 선택: ");
            selectedMenu2 = scanner.nextLine();

            for(int i = 0; i < menus2.length; i++) {
                if(menus2[i].equals(selectedMenu2)) {
                    isFind = true;
                    break;
                }
                System.out.println("잘못된 입력입니다. 다시 입력하세요.");
            }
        }
        return selectedMenu2;
    }

    private String select3Menu() {                    // Arrays.binarySearch로 찾는 방법
        String[] menus3 = {"1", "2", "3", "4", "5"};
        String selectedMenu3 = null;

        while(true) {
            System.out.print("메뉴 선택: ");
            selectedMenu3 = scanner.nextLine();

            if(Arrays.binarySearch(menus3, selectedMenu3) > -1) {
                break;
            }
            System.out.println("잘못된 입력입니다. 다시 입력하세요.");
        }
        return selectedMenu3;
    }

    private String selectMenu() {
        String menus = "1234q";
        String selectedMenu = null;

        while(true) {
            System.out.print("메뉴 선택: ");
            selectedMenu = scanner.nextLine();
            if(menus.contains(selectedMenu)) {
                break;
            }
            System.out.println("잘못된 입력입니다. 다시 입력하세요.");
        }
        return selectedMenu;
    }


    public boolean run() {
        boolean isRun = true;

        System.out.println("[도서관리 프로그램]");
        System.out.println("1. 도서 등록");
        System.out.println("2. 도서 검색");
        System.out.println("3. 도서 수정");
        System.out.println("4. 도서 삭제");
        System.out.println("q. 프로그램 종료");

        String selectedMenu = selectMenu();

        switch (selectedMenu) {
            case "q" :
                isRun = false;
                break;
            case "1" :
                registerBook();
                break;
            case "2" :
                search();
                break;
            case "3" :
                modify();
                break;
            case "4" :
                remove();
                break;
            default :
                System.out.println("입력 오류!");
        }
        System.out.println();

        return isRun;
    }

    private String validateValue(String title) {
        String value = null;
        while(true) {
            System.out.print(title + "명 입력 : ");
            value = scanner.nextLine();
            if(!value.isBlank()) {           // isEmpty() : 띄어쓰기를 포함하면(공백 포함), isBlank() : 띄어쓰기 포함x
                break;
            }
            System.out.println(title + "명은 공백일 수 없습니다. 다시 입력하세요.");
        }
        return value;
    }

    private  String duplicateBookName() {
        String bookName = null;
        while(true) {
            bookName = validateValue("도서");
            if(bookRepository.findBookByBookName(bookName) == null) {
                break;
            }
            System.out.println("해당 도서명이 이미 존재합니다. 다시 입력하세요. ");
        }
        return bookName;
    }

    private void registerBook() {
        System.out.println("[ 도서 등록 ]");
        int bookId = bookRepository.autoIncrementBookId();
        String bookName = duplicateBookName();
        String author = validateValue("저자");
        String publisher = validateValue("출판사");

        BookEntity book = new BookEntity(bookId, bookName, author, publisher);
        bookRepository.saveBook(book);
        System.out.println("새로운 도서를 등록하였습니다.");
    }

    private void search() {
        System.out.println("[ 도서 검색 ]");
        System.out.println("1. 통합 검색");
        System.out.println("2. 도서명 검색");
        System.out.println("3. 저자명 검색");
        System.out.println("4. 출판사명 검색");
        System.out.print("옵션 선택 : ");
        int option = scanner.nextInt();         // nextLine()을 제외한 모든 것은 엔터 버퍼를 지우기 위해 밑에 nextLine() 입력해야 한다.
        scanner.nextLine();
        System.out.print("검색어 입력 : ");
        String searchText = scanner.nextLine();
        BookEntity[] searchBooks = bookRepository.searchBooks(option, searchText);
        System.out.println("[ 검색 결과 ]");
        if(searchBooks.length == 0) {
            System.out.println("검색 결과가 없습니다.");
            return;
        }
        for(BookEntity book : searchBooks) {
            System.out.println(book.toString());
            System.out.println();
        }
    }

    private void remove() {
        System.out.println("[ 도서 삭제 ]");
        search();
        System.out.println("삭제할 도서번호를 입력하세요");
        int removeBookId = scanner.nextInt();
        scanner.nextLine();
        BookEntity book = bookRepository.findBookByBookId(removeBookId);
        if(book == null) {
            System.out.println("해당 도서번호는 존재하지 않습니다");
            return;
        }
        bookRepository.deleteBookByBookId(removeBookId);
        System.out.println("도서를 삭제하였습니다");
    }

    private void modify() {
        System.out.println("[ 도서 수정 ]");
        search();
        System.out.print("수정할 도선번호 입력 : ");
        int modifyBookId = scanner.nextInt();
        scanner.nextLine();
        BookEntity book = bookRepository.findBookByBookId(modifyBookId);
        if(book == null) {
            System.out.println("해당 도서번호는 존재하지 않습니다");
            return;
        }

        System.out.println("<< 도서 수정 번호 입력 >>");
        for(int i = 0; i < 3; i++) {
            String selected = null;
            switch (i) {
                case 0 :
                    System.out.println("도서명을 수정하시겠습니까?(y/n)");
                    selected = scanner.nextLine();
                    if(selected.equalsIgnoreCase("y")) {   // equalsIgnoreCase : 대소문자 구분없이 y면 실행한다는 뜻
                        String bookName = duplicateBookName();
                        book.setBookName(bookName);
                        break;
                    }
                    break;
                case 1 :
                    System.out.println("저자명을 수정하시겠습니까?(y/n)");
                    selected = scanner.nextLine();
                    if(selected.equalsIgnoreCase("y")) {
                        String author = validateValue("저자");
                        book.setAuthor(author);
                        break;
                    }
                    break;
                case 2 :
                    System.out.println("출판사를 수정하시겠습니까?(y/n)");
                    selected = scanner.nextLine();
                    if(selected.equalsIgnoreCase("y")) {
                        String publisher = validateValue("출판사");
                        book.setPublisher(publisher);
                        break;
                    }
            }
        }
    }

}
