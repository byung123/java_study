package com.study.java_study.ch01_변수와_자료형;

public class Operation01 {
    public static void main(String[] args) {
        // 연산자

        // 산술연산자
        int num1 = 10 + 20;
        System.out.println(num1);
        int num2 = 9 / 2; // 실수값이 아닌 int 로 선언했기 때문에 정수값만 출력 = 몫 출력
        System.out.println(num2);
//      int num2 = 9.0 / 2; 오류 -> 명시적 형변환 필요
        int num3 = 9 % 2; // 나머지
        System.out.println(num3);
//      int num4 = ? % 2; 2의 배수인지 확인할 수 있는 연산자, n의 배수 확인 연산 가능
        boolean num4 = 5 % 2 == 0; // 짝수(2의 배수)인지 확인 할 수 있는 문법
        System.out.println(num4);

        System.out.println("///////////////////////");
        System.out.println();

        // 증감연산
        int i = 0;
        System.out.println(i);
        i++;
        System.out.println(i); // i = i + 1 과 같음
        ++i;
        System.out.println(i);

        System.out.println(++i);
        System.out.println(i++);
        System.out.println(i);
        System.out.println("/////////////////////");
        System.out.println(--i);
        System.out.println(i--);
        System.out.println(i);

        System.out.println("/////////////////////");
        System.out.println();

        // 논리연산자
        // true => 1
        // false => 0
        // && => AND(곱)
        // || => OR(합)
        // ! => NOT(부정)
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && false);
        System.out.println("/////////////////////");
        System.out.println(true || true); // 0이 아닌건 모두 1
        System.out.println(false || false);
        System.out.println("/////////////////////");
        System.out.println(!true);
        System.out.println(!false);
        System.out.println(!true && true);
        System.out.println(!(true && true));

        System.out.println("/////////////////////");
        System.out.println();

        // 관계연산자
        System.out.println(3 > 2 && 1 == 1);
        System.out.println(1 != 1);

        System.out.println("/////////////////////");
        System.out.println();

        // 조건연산자
        System.out.println(3 > 2 ? 10 : 20);
        int x = 10;
        int y = 2;
        String result = x % y == 0 ? "y의 짝수입니다" : "y의 배수가 아닙니다";
        System.out.println(result);
        String result2 = "" + 10 / 2;
        System.out.println(result2);

        System.out.println("/////////////////////");
        System.out.println();

        // 복합대입연산자
        int number = 10;
        number = number + 5;
        System.out.println(number);

        int number2  = 10;
        number2 += 5;
        number2 -= 1;
        System.out.println(number2);
        number2 *= 2;
        number2 /= 2;
        number2 %= 2;
        System.out.println(number2);

    }
}
