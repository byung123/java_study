package com.study.java_study.ch08_클래스03;

public class StudentMain {
    public static void main(String[] args) {
        int[] numbers = new int[5];

//        numbers[0] = 10;
//        students[0] = new Student();

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        Student[] students = new Student[5];
        students[0] = new Student(20240501, "손경태", 29);
        students[1] = new Student(20240502, "손경터", 27);
        students[2] = new Student(20240503, "손경타", 28);

        for(int i = 0; i < students.length; i++) {
            if(students[i] == null) {
                continue;
            }
            System.out.println("학번 : " + students[i].getCode());
            System.out.println("이름 : " + students[i].getName());
            System.out.println("나이 : " + students[i].getAge());
            System.out.println();
        }
    }
}
