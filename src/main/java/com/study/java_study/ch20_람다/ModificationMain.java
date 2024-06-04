package com.study.java_study.ch20_람다;

public class ModificationMain {
    public static void main(String[] args) {
        Modification<String> m1 = new Modification<String>() {
            @Override
            public String modify(String oldData, String newData) {
                System.out.println("기존 데이터 : " + oldData);
                System.out.println("새로운 데이터 : " + newData);
                return newData;
            }
        };

        Modification<String> m2 = new Modification<>() { // 뒤에껀 앞에 명시해놨기 때문에 생략 가능
            @Override
            public String modify(String oldData, String newData) {
                return newData;
            }
        };

        // 람다로 구현 (익명 정의 + 생성) : 메소드 이름을 안 씀
        //                               (그래서 무조건 하나의 메소드만 있어야함. 2개 이상이면 뭘 재정의하는지 오류가 남)
        Modification<String> m3 = (oldName, newName) -> {
            System.out.println("기존 데이터 : " + oldName);
            System.out.println("새로운 데이터 : " + newName);
            return  newName;
        };

        // 위에꺼 생략할 거 다 생략한 상태
        Modification<String> m4 = (oldName, newName) -> newName;


        String name = "김준일";
        String newName = m1.modify(name, "김준이");
        System.out.println(newName);

        String newName2 = m2.modify(name, "김준삼");
        System.out.println(newName2);

        String newName3 = m3.modify(name, "김준사");
        System.out.println(newName3);
    }
}
