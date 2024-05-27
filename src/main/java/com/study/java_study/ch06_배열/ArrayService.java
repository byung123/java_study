package com.study.java_study.ch06_배열;

import java.util.Scanner;

public class ArrayService {

    public static void main(String[] args) {
        ArrayUtils arrayUtils = new ArrayUtils();
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

            String[] newNames = null;      // case1,3에서 동일한 변수명을 사용하기 때문에 아예 바깥에서 선언해줌
            int findIndex = -1;

            switch (selectedMenu) {
                case "1" :
                    System.out.println("[이름 등록]");
                    newNames = new String[names.length + 1];  //기존 공간보다 하나 더 추가
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
                    System.out.println("[이름 삭제]");
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


//  case 3 :
//      sout("삭제할 이름 : ")
//      String rremovename = scanner.nextLinr();
//      int findindex = -1
//      for(int i = 0; i < names.length; i++) {
//          String name = names[i]
//          if(name.equals(removename)) {
//              findindex = i;
//              break;                             // break가 없으면 중복된 이름 중에 제일 마지막 이름이 삭제됨
//            }
//      }
//      if(findindex == -1) {
//          sout("해당 이름은 존재하지 않습니다");
//          break;
//        }
//      newNames = new String[names.length - 1];
//      for(int i = 0; i < newNames.length; i++) {
//          if(i < findindex) {
//                newNames[i] = names[i];
//                continue;
//            }
//          newNames[i] = names[i + 1];
//        }
//      sout(removename + "을(를) 삭제하였습니다");
//      break;
//  case 2 :
//      sout("[이름 수정]");
//      sout("수정할 이름 : ");
//      String modifyName = scanner.nextLine();
//      for(int i = 0; i < names.length; i++) {
//          String name = names[i];
//          if(name.equals(modifyName)) {         // 하나의 메소드 안에 여러 작업을 하므로 단일 기능 원칙에 위배된다
//              sout("새 이름 : ");                // ArrayUtils 클래스를 만들어 메소드 하나를 정의하고 다시 작성해보자
//              neams[i] = scanner.nextLine();
//              sout("이름이 수정되었습니다");
//              break;
//            }
//        }
//      break;
//
//      // 수정하면
//
//case 2 :
//    sout("[이름 수정]");
//    sout("수정할 이름 : ");
//    String mopdifyName = scanner.nextLine();
//    findIndex = arrayUtils.findIndexByName(names, removename);
//    if(findindex == -1) {                    // 이건 메소드로 만들 수 없는 이유 : break;가 있기 때문
//        sout("해당 이름은 존재하지 않습ㄴ디ㅏ");
//        break;
//        }
//    sout("새 이름 :");
//    names[findIndex] = scanner.nextLine();
//    sout("수정 완료");
//case 3 :
//    sout("삭제할 이름 : ")
//    String rremovename = scanner.nextLinr();
//    int findindex = -1
//    findIndex = arrayUtils.findIndexByName(names, removename);  // case3에서도 동일하게 사용 가능
//          if(findindex == -1) {
//            sout("해당 이름은 존재하지 않습니다");
//            break;
//          }
//             newNames = new String[names.length - 1];
//            for(int i = 0; i < newNames.length; i++) {
//                 if(i < findindex) {
//                    newNames[i] = names[i];
//                    continue;
//                 }
//                 newNames[i] = names[i + 1];
//                 }
//            sout(removename + "을(를) 삭제하였습니다");
//            break;
// case4 도 마찬가지로 ArrayUtils 클래스의 메소드를 이용해 코드를 수정할 수 있다 -> 직접 해보디