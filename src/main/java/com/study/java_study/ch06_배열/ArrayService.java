package com.study.java_study.ch06_배열;

import java.util.Scanner;

public class ArrayService {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] names = new String[0];

        boolean isRun = true;

        while(isRun) {
            System.out.println("[이름 관리 프로그램]");
            System.out.println("1. 등록");
            System.out.println("2. 수정");
            System.out.println("3. 삭제");
            System.out.println("4. 이름 찾기");
            System.out.println("5. 전체 조회");
            System.out.println("q. 프로그램 종료");
            System.out.print("메뉴 선택 : ");

            String selectedMenu = scanner.nextLine();

            switch (selectedMenu) {
                case "1" :
                    System.out.println("[이름 등록]");
                    String[] newNames = new String[names.length + 1];  //기존 공간보다 하나 더 추가
                    for(int i = 0; i < names.length; i++) {
                        newNames[i] = names[i];
                    }
                    names = newNames;
                    newNames = null;                                   // 다 사용했으니 메모리를 줄인다
                    System.out.print("등록할 이름 : ");
                    names[names.length - 1] = scanner.nextLine();
                    System.out.println("등록 완료");
                    break;
                case "2" :
                    System.out.print("수정하고자 하는 이름을 입력하세요 : ");
                    String result = null;
                    String modifyName = scanner.nextLine();
                    for(int i = 0; i < names.length; i++) {
                        if(names[i].equals(modifyName)) {
                            result = modifyName;
                            System.out.print("이름을 수정해주세요 : ");
                            modifyName = scanner.nextLine();
                            names[i] = modifyName;
                            System.out.println("수정이 완료 되었습니다.");
                            break;
                        }
                    }
                    if(result == null) {
                        System.out.println("존재하지 않는 이름입니다.");
                    }
                    break;
                case "3" :
                    System.out.print("삭제하고자 하는 이름을 입력해주세요 : ");
                    String result3 = null;
                    String[] newNames2 = new String[names.length - 1];
                    String deleteName = scanner.nextLine();
                    for(int i = 0; i < names.length; i++) {
                        if(names[i].equals(deleteName)) {
                            result3 = deleteName;
                            for(int j = 0; j < i; j++) {
                                newNames2[j] = names[j];
                            }
                            for(int k = i; k < newNames2.length; k++) {
                                newNames2[k] = names[k + 1];
                            }
                            names = newNames2;
                            System.out.println("삭제 완료됐습니다.");
                            break;
                        }
                    }
                    if(result3 == null) {
                        System.out.println("해당 이름은 존재하지 않습니다.");
                        break;
                    }
                    break;
                case "4" :
                    System.out.println("[이름 찾기]");
                    System.out.print("조회할 이름 : ");
                    String result2 = null;
                    String findName = scanner.nextLine();
                    for(String name : names) {
                        if(name.equals(findName)) {
                            result2 = name;
                            System.out.println("해당 이름은 등록된 이름입니다.");
                            break;
                        }
                    }
                    if(result2 == null) {
                        System.out.println("해당 이름은 존재하지 않는 이름입니다.");
                        break;
                    }
                    break;
                case "5" :
                    System.out.println("[전체 이름 조회]");
                    for(int i = 0; i < names.length; i++) {
                        System.out.println("index[" + i + "]: " + names[i]);
                    }
                    break;
                case "q" :
                    isRun = false;
                    break;
                default :
                    System.out.println("다시 입력하세요");
            }
            System.out.println();
        }

    }

}
