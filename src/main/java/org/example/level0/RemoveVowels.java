package org.example.level0;

public class RemoveVowels {
    public static void main(String[] args) {
        /*
        영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다.
        문자열 my_string이 매개변수로 주어질 때
        모음을 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
         */

        String my_string1 = "bus";
        System.out.println(solution(my_string1));
        String my_string2 = "nice to meet you";
        System.out.println(solution(my_string2));
    }

    static String solution(String my_string) {
        String answer = "";
        answer = my_string.replaceAll("[aeiou]","");
        return answer;
    }

}
