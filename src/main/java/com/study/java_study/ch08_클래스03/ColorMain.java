package com.study.java_study.ch08_클래스03;

public class ColorMain {
    public static void main(String[] args) {
        /*
            문제.
            Color 객체 5개를 담을 수 있는 배열을 생성하여
            #CAB4BA, Brandied Apricot
            #FFBE98, Peach Fuzz
            #964F4C, Marsala
            #A78C7B, Almondine
            #DBCBBD, Almond peach
            색상 데이터를 저장한 후에 for문을 사용하여 배열에 들어있는
            모든 색상 정보를 printInfo()로 호출하여 출력한다
            이후에 모든 code와 name의 값을 null로 바꾸어 다시 출력한다
            이때 null로 바꿀때에는 반복문을 사용한다
         */

//        Color color = new Color();    // 이건 없어도 됐었네

        Color[] colors = new Color[5];
        colors[0] = new Color("#CAB4BA", "Brandied Apricot");
        colors[1] = new Color("#FFBE98", "Peach Fuzz");
        colors[2] = new Color("#964F4C", "Marsala");
        colors[3] = new Color("#A78C7B", "Almondine");
        colors[4] = new Color("#DBCBBD", "Almond peach");

        for(int i = 0; i < colors.length; i++) {
            colors[i].printInfo();
            System.out.println();
        }

        for(int i = 0; i < colors.length; i++) {
            colors[i].setCode(null);
            colors[i].setName(null);
            colors[i].printInfo();
        }

        for(Color color : colors) {                // 여기부터 강사님 답
            color.printInfo();
            System.out.println();
        }

        for(Color color : colors) {
            color.setCode(null);
            color.setName(null);
            color.printInfo();
        }
    }
}
