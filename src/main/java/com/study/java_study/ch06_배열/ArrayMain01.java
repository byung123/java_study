package com.study.java_study.ch06_배열;

public class ArrayMain01 {
    public static void main(String[] args) {

        int[] nums = new int[100];    // 배열은 대괄호로 크기를 지정한다

        for(int i = 0; i < 100; i++) {
            nums[i] = (i + 1) * 10;
        }

        for(int num : nums) {
            System.out.println(num);
        }

        for(int i = 0; i < nums.length; i++) {   // 바로 위 코드를 다른 for문으로 바꾼 것
            if(i % 2 == 0) {                     // 배열의 코드를 이용하면 인덱스를 이용하여
                continue;                        // 새로운 연산을 할 수 있다.
            }
            int num = nums[i];
            System.out.println(num);
        }

    }
}
