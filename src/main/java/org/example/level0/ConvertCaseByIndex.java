package org.example.level0;

import java.util.Arrays;

public class ConvertCaseByIndex {
    public static void main(String[] args) {
        /*
        문자열 배열 strArr가 주어집니다.
        모든 원소가 알파벳으로만 이루어져 있을 때,
        배열에서 홀수번째 인덱스의 문자열은 모든 문자를 대문자로,
        짝수번째 인덱스의 문자열은 모든 문자를 소문자로 바꿔서 반환하는 solution 함수를 완성해 주세요.
         */

        String[] strArr = {"AAA", "BBB", "CCC", "DDD"};
        System.out.println(Arrays.toString(solution(strArr)));
    }

    static String[] solution(String[] strArr) {

        String[] answer = new String[strArr.length];

        for(int i=0; i<answer.length; i++) {
            if (i%2 == 0) {
                answer[i] = strArr[i].toLowerCase();
            } else {
                answer[i] = strArr[i].toUpperCase();
            }
        }

        return answer;
    }
}
