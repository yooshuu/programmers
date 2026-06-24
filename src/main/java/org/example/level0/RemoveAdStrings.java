package org.example.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveAdStrings {
    public static void main(String[] args) {
        /*
        문자열 배열 strArr가 주어집니다.
        배열 내의 문자열 중 "ad"라는 부분 문자열을 포함하고 있는
        모든 문자열을 제거하고 남은 문자열을 순서를 유지하여 배열로 return 하는 solution 함수를 완성해 주세요.
         */
        String strArr[] = {"and", "notad", "abcd"};
        System.out.println(Arrays.toString(solution(strArr)));
    }

    static String[] solution(String[] strArr) {

        List<String> list = new ArrayList<>();

        for (String s : strArr) {
            if (!s.contains("ad")) {
                list.add(s);
            }
        }

        return list.toArray(new String[0]);
    }
}
