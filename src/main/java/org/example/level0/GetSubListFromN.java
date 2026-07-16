package org.example.level0;

import java.util.Arrays;

public class GetSubListFromN {
    public static void main(String[] args) {
        /*
        정수 리스트 num_list와 정수 n이 주어질 때,
        n 번째 원소부터 마지막 원소까지의 모든 원소를 담은 리스트를
        return하도록 solution 함수를 완성해주세요.
         */

        int[] num_list = {2, 1, 6};
        int n = 3;
        System.out.println(Arrays.toString(solution(num_list, n)));
    }

    static int[] solution(int[] num_list, int n) {

        int[] answer = new int[num_list.length - (n-1)];

        for(int i=0; i<answer.length; i++) {
            answer[i] = num_list[n-1+i];
        }

        return answer;
    }
}
