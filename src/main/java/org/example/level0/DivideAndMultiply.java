package org.example.level0;

public class DivideAndMultiply {
    public static void main(String[] args) {
        /*
        정수 num1과 num2가 매개변수로 주어질 때,
        num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을 return 하도록 solution 함수를 완성해주세요.
         */

        int num1 = 3;
        int num2 = 2;
        System.out.println(solution(num1, num2));
    }

    static int solution(int num1, int num2) {
        int answer = 0;
        answer = (int)((double)num1 / num2 * 1000);
        return answer;
    }
}
