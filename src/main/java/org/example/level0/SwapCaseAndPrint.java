package org.example.level0;

import java.util.Scanner;

public class SwapCaseAndPrint {
    public static void main(String[] args) {
        /*
        영어 알파벳으로 이루어진 문자열 str이 주어집니다.
        각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.

        입력 #1
        aBcDeFg

        출력 #1
        AbCdEfG
         */

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String result = "";

        for(int i=0; i<a.length(); i++) {
            char c = a.charAt(i);

            if (c >= 'a' && c <= 'z') {
                result += String.valueOf(c).toUpperCase();
            } else if (c >= 'A' && c <= 'Z') {
                result += String.valueOf(c).toLowerCase();
            }
        }

        System.out.println(result);
    }
}
