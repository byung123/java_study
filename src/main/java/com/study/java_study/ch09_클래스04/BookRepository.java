package com.study.java_study.ch09_클래스04;

// 저장소 -> CRUD가 이뤄짐
public class BookRepository {

    private int bookId;
    private BookEntity[] books; // Repository가 생성될 때 배열을 같이 생성되게 하기 위해 생성자 전에 배열 생성

    public BookRepository() {
        books = new BookEntity[0];
    }

    public int autoIncrementBookId() {
        return ++bookId;
    }

    private void extendBooks() {
        // 기존 배열보다 크기가 하나 더 큰 배열을 생성한다
        BookEntity[] newBooks = new BookEntity[books.length + 1];

        // 기존 배열의 정보를 새로운 배열로 모두 옮긴다. 이 때 마지막 인덱스의 값은 빈값이다
        for(int i = 0; i < books.length; i++) {
            newBooks[i] = books[i];
        }

        // 기존의 배열이 들어있는 books의 변수에 새로운 배열의 주소를 대입한다.
        books = newBooks;
    }

    private int getLastIndex() {
        return books. length - 1;
    }

    public void saveBook(BookEntity book) {  // 기능이 여러가지 있다( 배열늘리기, 도서 옮기기, 도서 추가하기)
                                             // 각 기능들을 조금씩 묶어서 다른 기능으로 빼보자( 위에  3개 뺌 - extendBooks()
        // 기존 배열보다 크기가 하나 더 큰 배열을 생성한다
//        BookEntity[] newBooks = new BookEntity[books.length + 1];

        // 기존 배열의 정보를 새로운 배열로 모두 옮긴다. 이 때 마지막 인덱스의 값은 빈값이다
//        for(int i = 0; i < books.length; i++) {
//            newBooks[i] = books[i];
//        }

        // 기존의 배열이 들어있는 books의 변수에 새로운 배열의 주소를 대입한다.
//        books = newBooks;

        extendBooks();   // 위의 3개 기능을 합친 것
        // 새로운 배열의 마지막 인덱스에 매개변수로 받아온 book 객체를 대입한다
        // 인덱스의 마지막은 객체 크기에 - 1을 해줘야 마지막에 추가 가능하다
        books[getLastIndex()] = book;
    }

    // 단건 조회 : 하나만 조회한다
    public BookEntity findBookByBookId(int bookId) {
        BookEntity findBook = null;
        // 선형 탐색(순차 탐색) - 시간복잡도 n
        for(BookEntity book : books) {
            if(book.getBookcode() == bookId) {
                findBook = book;
                break;
            }
        }
        return findBook;
    }

    // 단건 조회
    public BookEntity findBookByBookName(String bookName) {
        BookEntity findBook = null;
        for(BookEntity book : books) {
            if(book.getBookName().equals(bookName)) {       // 이건 Id와 다르게 리터럴 주소가 아니기 때문에 equals를 사용한다
                findBook = book;
                break;
            }

        }
        return findBook;
    }

    // 이름을 정확히 입력해야만 검색이 되는데 일부만 쳐도 검색이 되기 위해 contains를 사용
    private int getNewArraySize(int option, String searchText) {
        int newArraySize = 0;

        switch(option) {
            case 1:   // 통합검색
                for(BookEntity book : books) {
                    if (book.getBookName().contains(searchText)
                            || book.getAuthor().contains(searchText)
                            || book.getPublisher().contains(searchText)) {
                        newArraySize++;
                    }
                }
                break;
            case 2:   // 도서명 검색
                for(BookEntity book : books) {
                    if (book.getBookName().contains(searchText)) {
                        newArraySize++;
                    }
                }
                break;
            case 3:   // 저자명 검색
                for(BookEntity book : books) {
                    if (book.getAuthor().contains(searchText)) {
                        newArraySize++;
                    }
                }
                break;
            case 4:   // 출판사명 검색
                for(BookEntity book : books) {
                    if (book.getPublisher().contains(searchText)) {
                        newArraySize++;
                    }
                }

        }
        return newArraySize;
    }

    // 다건 조회
    public BookEntity[] searchBooks(int option, String searchText) {
        int newArraySize = getNewArraySize(option, searchText);

        BookEntity[] searchBooks = new BookEntity[newArraySize];

        int i = 0;
        switch(option) {
            case 1:   // 통합검색
                for(BookEntity book : books) {
                    if (book.getBookName().contains(searchText)
                            || book.getAuthor().contains(searchText)
                            || book.getPublisher().contains(searchText)) {
                        searchBooks[i] = book;
                        i++;
                    }
                }
                break;
            case 2:   // 도서명 검색
                for(BookEntity book : books) {
                    if (book.getBookName().contains(searchText)) {
                        searchBooks[i] = book;
                        i++;
                    }
                }
                break;
            case 3:   // 저자명 검색
                for(BookEntity book : books) {
                    if (book.getAuthor().contains(searchText)) {
                        searchBooks[i] = book;
                        i++;
                    }
                }
                break;
            case 4:   // 출판사명 검색
                for(BookEntity book : books) {
                    if (book.getPublisher().contains(searchText)) {
                        searchBooks[i] = book;
                        i++;
                    }
                }

        }
        return searchBooks;
    }
}
