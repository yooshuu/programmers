package org.example.level0;

public class ModuloOperation {
    public static void main(String[] args) {
        /*
        정수 num1, num2가 매개변수로 주어질 때,
        num1를 num2로 나눈 나머지를 return 하도록 solution 함수를 완성해주세요.
        */
        int num1 = 3;
        int num2 = 2;
        System.out.println(solution(num1, num2));

        int num3 = 10;
        int num4 = 5;
        System.out.println(solution(num3, num4));
    }

    static int solution(int num1, int num2) {
        int answer = -1;
        answer = num1 % num2;
        return answer;
    }
}
