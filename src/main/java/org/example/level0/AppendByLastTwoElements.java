package org.example.level0;

import java.util.Arrays;

public class AppendByLastTwoElements {
    public static void main(String[] args) {
        /*
        정수 리스트 num_list가 주어질 때,
        마지막 원소가 그전 원소보다 크면 마지막 원소에서 그전 원소를 뺀 값을
        마지막 원소가 그전 원소보다 크지 않다면 마지막 원소를 두 배한 값을 추가하여
        return하도록 solution 함수를 완성해주세요.
         */

        int[] num_list = {2, 1, 6};
        System.out.println(Arrays.toString(solution(num_list)));
    }

    static int[] solution(int[] num_list) {

        int[] answer = new int[num_list.length + 1];

        int last = num_list[num_list.length-1];
        int prev = num_list[num_list.length-2];

        if (last > prev) {
            answer[answer.length-1] = last - prev;
        } else {
            answer[answer.length-1] = last * 2;
        }

        for(int i=0; i<answer.length-1; i++) {
            answer[i] = num_list[i];
        }

        return answer;
    }
}
