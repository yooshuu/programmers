package org.example.level0;

public class AddOrSubtractByFlag {
    public static void main(String[] args) {
        /*
        두 정수 a, b와 boolean 변수 flag가 매개변수로 주어질 때,
        flag가 true면 a + b를 false면 a - b를 return 하는 solution 함수를 작성해 주세요.
         */

        int a = -4;
        int b = 7;
        boolean flag = true;
        System.out.println(solution(a, b, flag));
        int c = -4;
        int d = 7;
        boolean flag2 = false;
        System.out.println(solution(c, d, flag2));
    }

    static int solution(int a, int b, boolean flag) {

        if (flag == true) {
            return a+b;
        } else {
            return a-b;
        }
    }
}
