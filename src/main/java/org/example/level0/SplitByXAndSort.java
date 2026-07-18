package org.example.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitByXAndSort {
    public static void main(String[] args) {
        /*
        문자열 myString이 주어집니다.
        "x"를 기준으로 해당 문자열을 잘라내 배열을 만든 후
        사전순으로 정렬한 배열을 return 하는 solution 함수를 완성해 주세요.
        단, 빈 문자열은 반환할 배열에 넣지 않습니다.
         */

        String myString = "axbxcxdx";
        System.out.println(Arrays.toString(solution(myString)));
    }

    static String[] solution(String myString) {

        String[] str = myString.split("x");

        List<String> list = new ArrayList<>();

        for(String s : str) {
            if (!s.equals("")) {
                list.add(s);
            }
        }

        String[] answer = new String[list.size()];

        for(int i=0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }

        Arrays.sort(answer);

        return answer;
    }
}
