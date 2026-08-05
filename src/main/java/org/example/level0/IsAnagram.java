package org.example.level0;

import java.util.Arrays;

public class IsAnagram {
    public static void main(String[] args) {
        /*
        문자열 before와 after가 매개변수로 주어질 때,
        before의 순서를 바꾸어 after를 만들 수 있으면 1을,
        만들 수 없으면 0을 return 하도록 solution 함수를 완성해보세요
         */

        String before = "olleh";
        String after = "hello";
        System.out.println(solution(before, after));
    }

    static int solution(String before, String after) {

        String[] be = before.split("");
        String[] af = after.split("");

        Arrays.sort(be);
        Arrays.sort(af);

        if (Arrays.equals(be, af)) {
            return 1;
        } else {
            return 0;
        }
    }
}
