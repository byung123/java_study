package com.study.java_study.ch04_제어;

public class 조건문02 {
    public static void main(String[] args) {

        String text = new String("");
        String name = "손경태";     // 값의 자료형 String
        String phone = "010";  // 값의 자료형 null

        System.out.println(name.length());
        System.out.println(text.length());
//      System.out.println(phone.length());  // 빨간줄은 안 뜨지만 실행하면 Exception 오류가 뜸(Null point)



        if(name == null || name == "") {
            System.out.println("name이 비어있습니다");
        }

        if(phone == null || phone == "") {
            System.out.println("phone이 비어있습니다");
        }

        if(text == null || text == "") {                // 이건 아무것도 발생하지 않음
            System.out.println("text이 비어있습니다");     // '=='은 주소값을 비교하는 연산자임
        }                                                // 공백은 리터럴 문자임\
                                                         // 따라서 new String으로 객체를 생성한 변수는
            // 다른 주소를 생성한 상태로 만들어지기 때문에 주소값이 다름
            // 따라서 주소값이 아닌 값 자체를 비교해주는 함수가 따로 있음 = equals() - boolean 타입

        if(name == null || name.equals("")) {
            System.out.println("name이 비어있습니다");
        }

        if(text == null || text.equals("")) {           // 하지만 null은 적용 안됨
            System.out.println("text이 비어있습니다");
        }

        ////////////////////////////////////////////////////////////////////////////////

        StringUtils stringUtils = new StringUtils();

        if(stringUtils.isEmpty(name)) {
            System.out.println("name이 비었습니다");
            return;                                 // 함수 자체가 void일 때 그냥 return은 쓸 수 있다
        }                                           // if안이 참이면 return에서 끊고 밑에껀 실행하지 마라라는 뜻

        if(stringUtils.isEmpty(phone)) {
            System.out.println("phone이 비었습니다");
            return;
        }

        if(stringUtils.isEmpty(text)) {
            System.out.println("text이 비었습니다");
            return;
        }

    }
}
