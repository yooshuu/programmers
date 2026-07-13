package org.example.level0;

import java.util.Arrays;

public class GetLengthsSplitByX {
    public static void main(String[] args) {
        /*
        문자열 myString이 주어집니다.
        myString을 문자 "x"를 기준으로 나눴을 때
        나눠진 문자열 각각의 길이를 순서대로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
         */

        String myString = "oxooxoxxox";
        System.out.println(Arrays.toString(solution(myString)));
    }

    static int[] solution(String myString) {

        String[] str = myString.split("x", -1);
        int[] answer = new int[str.length];

        for(int i=0; i<str.length; i++) {
            answer[i] = str[i].length();
        }

        return answer;
    }
}
