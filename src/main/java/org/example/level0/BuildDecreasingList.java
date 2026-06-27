package org.example.level0;

import java.util.Arrays;

public class BuildDecreasingList {
    public static void main(String[] args) {
        /*
        정수 start_num와 end_num가 주어질 때,
        start_num에서 end_num까지 1씩 감소하는 수들을
        차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
         */

        int start_num = 10;
        int end_num = 3;
        System.out.println(Arrays.toString(solution(start_num, end_num)));
    }

    static int[] solution(int start_num, int end_num) {

        int[] answer = new int[start_num-end_num+1];

        for (int i=0; i<answer.length; i++) {
            answer[i] = start_num - i;
        }

        return answer;
    }
}
