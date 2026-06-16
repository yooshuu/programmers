package org.example.level0;

public class GetDigitSumFromString {
    public static void main(String[] args) {
        /*
        한 자리 정수로 이루어진 문자열 num_str이 주어질 때,
        각 자리수의 합을 return하도록 solution 함수를 완성해주세요.
         */

        String num_str = "123456789";
        System.out.println(solution(num_str));
    }

    static int solution(String num_str) {
        int answer = 0;

        String num_ary[] = num_str.split("");

        for(String i : num_ary) {
            answer += Integer.parseInt(i);
        }

        return answer;
    }
}
