package org.example.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitByMultipleSpaces {
    public static void main(String[] args) {
        /*
        단어가 공백 한 개 이상으로 구분되어 있는 문자열 my_string이 매개변수로 주어질 때,
        my_string에 나온 단어를 앞에서부터 순서대로 담은 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
         */

        String my_string = " i    love  you";
        System.out.println(Arrays.toString(solution(my_string)));
    }

    static String[] solution(String my_string) {

        String[] answer = my_string.split(" ");

        List<String> list = new ArrayList<>();

        for(String s : answer) {
            if(!s.equals("")) {
                list.add(s);
            }
        }

        String[] result = new String[list.size()];

        for(int i=0; i<result.length; i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
