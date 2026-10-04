package org.example.level0;

public class SumNaturalNumbersInString {
    public static void main(String[] args) {
        /*
        문자열 my_string이 매개변수로 주어집니다.
        my_string은 소문자, 대문자, 자연수로만 구성되어있습니다.
        my_string안의 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
         */

        String my_string = "aAb1B2cC34oOp";
        System.out.println(solution(my_string));
    }

    static int solution(String my_string) {
        String[] answer = my_string.split("[a-zA-Z]");

        int result = 0;

        for(String n : answer) {
            if(!n.isEmpty()) {
                result += Integer.parseInt(n);
            }
        }

        return result;
    }
}