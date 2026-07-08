package org.example.level0;

public class CheckPatternAfterSwapAB {
    public static void main(String[] args) {
        /*
        문자 "A"와 "B"로 이루어진 문자열 myString과 pat가 주어집니다.
        myString의 "A"를 "B"로, "B"를 "A"로 바꾼 문자열의 연속하는 부분 문자열 중 pat이 있으면 1을 아니면 0을 return 하는 solution 함수를 완성하세요.
         */

        String myString = "ABBAA";
        String pat = "AABB";
        System.out.println(solution(myString, pat));
    }

    static int solution(String myString, String pat) {

        myString = myString.replaceAll("A","a").replaceAll("B","A").replaceAll("a","B");

        if (myString.contains(pat)) {
            return 1;
        } else {
            return 0;
        }
    }
}

