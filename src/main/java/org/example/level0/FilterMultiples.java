package org.example.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterMultiples {
    public static void main(String[] args) {
        /*
        정수 n과 정수 배열 numlist가 매개변수로 주어질 때,
        numlist에서 n의 배수가 아닌 수들을 제거한 배열을 return하도록 solution 함수를 완성해주세요.
         */

        int n = 5;
        int[] numlist = {1,9,3,10,13,5};
        System.out.println(Arrays.toString(solution(n,numlist)));
    }
    static int[] solution(int n, int[] numlist) {
        List<Integer> list = new ArrayList<>();
        for(int num : numlist) {
            if(num % n == 0) {
                list.add(num);
            }
        }

        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}