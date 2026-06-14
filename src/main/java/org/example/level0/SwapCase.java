package org.example.level0;

public class SwapCase {
    public static void main(String[] args) {
        /*
        문자열 my_string이 매개변수로 주어질 때,
        대문자는 소문자로 소문자는 대문자로 변환한 문자열을 return하도록 solution 함수를 완성해주세요
         */

        String my_string1 = "cccCCC";
        System.out.println(solution(my_string1));
        String my_string2 = "abCdEfghIJ";
        System.out.println(solution(my_string2));
    }

    static String solution(String my_string) {

        String answer = "";

        for(int i=0; i<my_string.length(); i++) {
            char c = my_string.charAt(i);

            if(Character.isUpperCase(c)) {
                answer += String.valueOf(c).toLowerCase();
            } else {
                answer += String.valueOf(c).toUpperCase();
            }
        }

        return answer;
    }
}
