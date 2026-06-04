package org.example.level0;

public class ToUpperCase {
    public static void main(String[] args) {
        /*
        알파벳으로 이루어진 문자열 myString이 주어집니다.
        모든 알파벳을 대문자로 변환하여 return 하는 solution 함수를 완성해 주세요.
         */

        String myString = "aBcDeFg";
        System.out.println(solution(myString));
    }

    static String solution(String myString) {
        return myString.toUpperCase();
    }
}
