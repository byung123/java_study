package com.study.java_study.ch06_배열;

public class ArrayMain02 {

    public static void main(String[] args) {
        String a = "김준일";
        String b = new String("김준일");

        System.out.println(a);
        System.out.println(b);

        System.out.println(a == "김준일");
        System.out.println(b == "김준일");

        System.out.println();

        String[] names = new String[2];
        names[0] = "김준일";
        names[1] = new String("김준일");


//        String[] names2 = new String[] {"김준일", new String("김준일")}; 앞에 new String[] 생략한 것
        String[] names2 = {"김준일", new String("김준일")}; // 바로 위 동작을 한꺼번에 한 것


        System.out.println(names[0] == names2[0]);   // literal 주소 비교하므로 True
        System.out.println(names[1] == names2[1]);   // 새로 할당된 주소끼리 비교하므로 False

        System.out.println(names == names2); // 배열 주소 비교 (안의 값은 같지만, 주소가 달라서 false)

        int n = 10;

        n = n + 1;

        System.out.println(new String[2]);
        System.out.println(new String[] {"a", "b"});
//        System.out.println({"a", "b"});             // 빨간줄 나옴

    }
}
